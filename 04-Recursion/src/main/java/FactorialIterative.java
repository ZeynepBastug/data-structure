public class FactorialIterative {
    public static void main(String[] args) {

        System.out.println(factorial(0));
        System.out.println(factorial(1));
        System.out.println(factorial(6));
    }

    public static int factorial(int num){

        if(num <= 1){
            return 1;
        }else{
            return num * factorial(num-1);
        }
    }
}
