public class FactorialDemo {
    public static void main(String[] args) {
        System.out.println("El factorial de 5 es: " + calcFactorial(5));
        System.out.println("El factorial de 0 es: " + calcFactorial(0));

    }

    public static long calcFactorial(int value){
        long factorial = 1L;
        if (value==0){
            return factorial;
        }
        for (int i = value; i > 0; i--) {
            factorial = factorial * i;
        }

        return factorial;
    }
}
