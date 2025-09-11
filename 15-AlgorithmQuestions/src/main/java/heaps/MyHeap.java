package heaps;

public class MyHeap {

    int[] items;
    int size;

    public MyHeap( int capacity) {
        this.items = new int[capacity];
        this.size = 0;
    }


    public void insert(int item){

        if(size == items.length) throw new ArrayIndexOutOfBoundsException();
        else {
            items[size++] = item;
            bubbleUp();
        }
    }

    public int remove(){
        int root = items[0];

        if (size == 0) throw new ArrayIndexOutOfBoundsException();
        else{
            items[0]= items[--size];
            bubbleDown();
        }
        return root;
    }

    public void bubbleUp(){
        // last child index
        int index = size-1;
        while(index >= 0 && items[parentIdx(index)] < items[index] ){
            swap(items[parentIdx(index)], items[index]);
            index = parentIdx(index);
        }
    }

    public void bubbleDown(){
        int index = 0;

        while(index < size && !isValidParent(index)){
            int largerChild = items[largerChildIdx(index)];
            swap(largerChild, items[index]);
            index =  items[largerChildIdx(index)];

        }

        if(hasRightChild(index)){
            if(items[leftChildIdx(index)] > items[rightChildIdx(index)]){
                swap(items[leftChildIdx(index)], items[index]);
            } else{
                swap(items[rightChildIdx(index)], items[index]);
            }
        } else {

            swap(items[leftChildIdx(index)], items[index]);
        }

    }

    public boolean isValidParent(int index){

        if(!hasLeftChild(index)) return true;
        else{
            boolean isValid = items[index] >= items[leftChildIdx(index)];
            if(hasRightChild(index)){
                isValid &= items[index] >= items[rightChildIdx(index)];
            }
            return isValid;
        }
    }

    public int largerChildIdx(int index){
        if(!hasLeftChild(index)) return index;
        else if(!hasRightChild(index)) return leftChildIdx(index);

        return items[leftChildIdx(index)] > items[rightChildIdx(index)] ? leftChildIdx(index) : rightChildIdx(index);
    }

    public boolean hasRightChild(int index){
        return rightChildIdx(index) < size;
    }

    public boolean hasLeftChild(int index){
        return leftChildIdx(index) < size;
    }

    public int leftChildIdx(int index){
        return (index * 2) +1;

    }
    public int rightChildIdx(int index){
        return (index *2 ) + 2;
    }

    public void swap(int item1, int item2){
        int temp = item1;
        item1 = item2;
        item2 = temp;
    }

    public int parentIdx(int index){
        return (index-1)/2;
    }

    public int getRoot(){
        return items[0];
    }





}
