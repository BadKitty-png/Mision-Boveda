public class Recursion {

    public static int factorial(int n) {
        if (n <= 1) {            // caso base: 0! = 1 y 1! = 1
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int sumaDigitos(int n) {
        if (n < 10) {            // caso base: un solo dígito
            return n;
        }
        return (n % 10) + sumaDigitos(n / 10);
    }

    public static String invertirTexto(String s) {
        if (s.length() <= 1) {   // caso base: "" o "a"
            return s;
        }
        return invertirTexto(s.substring(1)) + s.charAt(0);
    }
}
