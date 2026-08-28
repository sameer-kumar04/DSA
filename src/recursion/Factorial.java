package recursion;

public class Factorial {
    public static int findfactorial(int n) {
        if ( n == 0 ) {
            return 1;
        }

        return findfactorial(n-1) * n;
    }
}
