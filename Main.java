public class Main {
    public static void main(String[] args) {

        double zahl1 = 0.0;
        double zahl2 = 0.0;
        double PI = 3.14159;


        System.out.println(addition(zahl1, zahl2));
    }

    // basic math operations
    private static double addition(double n1, double n2) {
        return n1 + n2;
    }

    private static double substraction(double n1, double n2) {
        return n1 - n2;
    }

    private static double multiplication(double n1, double n2) {
        return n1 * n2;
    }

    private static double division(double n1, double n2) {
        return n1 / n2;
    }

    // advanced math operations
    private static double modulo(double n1, double n2) {
        return n1 % n2;
    }
    // power, wurzel und so weiter


}