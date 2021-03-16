public class WiederholungDemoApp {
    public static void main(String[] args) {
        printNumbersFor();
        printNumbersWhile();
    }

    /*
        A new Method in which
          -> all numbers between 1 and max 1.000 print (printf) which could be divided by 7 and 3
          -> add all of those numbers (21, 42, 63, ...)
          -> the loop should stop when there has been printed 10 numbers or when the sum reaches 1000
     */
    // ReturnType
    // Name
    // Parameters
    public static void printNumbersFor() {

        int sum = 0;
        int counter = 0;
        // Initialisierung;Abbruchbedingung;Increment
        for(int i = 1;i <= 1000;i++){
            if (i % 7 == 0 && i % 3 == 0) {
                System.out.print(i + ", ");
                sum = sum + i;
                counter++;
            }

            if (counter >= 10 || sum >= 1000){
                break;
            }
        }

        System.out.println("\nsum = " + sum);
        System.out.println("counter = " + counter);
    }

    public static void printNumbersWhile() {
        int sum = 0, counter = 0, i = 1;

        while (i < 1000 && counter <= 10 && sum <= 1000){
            i++;
            if (i % 7 == 0 && i % 3 == 0){
                System.out.print(i + ", ");
                sum = sum + i;
                counter++;
            }
        }

        System.out.println("\nsum = \t" + sum); // \n => Zeilenumbruch \t => Tabulator
        System.out.println("counter = " + counter);
    }

}
