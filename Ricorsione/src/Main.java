public class Main {
    public static int fattoriale(int n) {
        if (n == 0) {
            return 1;
        }else {
            return fattoriale(n-1) * n;
        }
    }

    public static int fibonacci(int n) {
        if(n == 0)
            return 1;
        else if(n == 1)
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void printReverse(String s, int i) {
        System.out.print(s.charAt(i));
        if (i == 0) {
            System.out.print(s.charAt(i));
        }else {
            System.out.print(s.charAt(i));
            printReverse(s, i-1);
        }

    }

    public static void main(String[] args) {
        System.out.println(fattoriale(5));
        System.out.println(fibonacci(7));

        String s = "Ciao";
        printReverse(s,s.length()-1);
    }
}
