public class BisiestoDemo {
    public static void main(String[] args) {

        System.out.println("1996 es Bisiesto? : " + esBisiesto(1996));
        System.out.println("1990 es Bisiesto? : " + esBisiesto(1990));
        System.out.println("2000 es Bisiesto? : " + esBisiesto(2000));

        for (int i = 1; i < 2100; i++) {
            if (esBisiesto(i)){
                System.out.println(i + " es bisiesto.");
            }

        }
    }

    public static boolean esBisiesto(int year){
        if (year % 4 == 0) {
            if (year % 100 == 0){
                if (year % 400 == 0){
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }



}
