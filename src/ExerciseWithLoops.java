public class ExerciseWithLoops {
    public static void main(String[] args) {

        System.out.println("Imprimo los nros del 1 al 100 con un for loop: ");
        for (int i = 1; i < 101; i++) {
            System.out.print(i + " , ");
        }
        System.out.println("\n\nImprimo los nros del 1 al 100 con un while loop: ");
        int j = 1;
        while (j < 101){
            System.out.print(j + " , ");
            j++;
        }

        System.out.println("\n\nImprimo los nros del 100 al 1 con un for loop: ");
        for (int i = 100; i > 0; i--) {
            System.out.print(i + " , ");
        }
        System.out.println("\n\nImprimo los nros del 100 al 1 con un while loop: ");
        int k = 100;
        while (k > 0){
            System.out.print(k + " , ");
            k--;
        }

        System.out.println("\n\nImprimo la suma de los nros del 1 al 100: ");
        int l = 0;
        int m =0;
        while (l < 101){
            m = m+l;
            l++;
        }
        System.out.println(m);

        System.out.println("\nImprimo los nros del 1 al 100 que son divisibles por 3: ");
        for (int n = 1; n < 101; n++) {
            if (n % 3 == 0){
                System.out.print(n + ", ");
            }
        }

        System.out.println("\n\nImprimo un triángulo con dos for anidados: ");
        for (int p = 0; p < 10; p++) {

            for (int q = 0; q < p+1; q++) {
                System.out.print(q +" ");
            }
            System.out.println(" ");
        }




    }

}
