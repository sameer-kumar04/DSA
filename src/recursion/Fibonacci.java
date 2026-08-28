package recursion;

public class Fibonacci {

    public static int fib(int n) { //using loops
        if ( n <= 1) {
            return n;
        }

        int prev = 1;
        int sprev = 0;

        for ( int i = 2; i <= n; i++) {
            int current = sprev + prev;
            sprev = prev;
            prev = current;
        }

        return prev;
    }
//    public static int fib(int n) { //using recursion
//        if ( n <= 1) {
//            return n;
//        }
//
//        return fib(n-2)+fib(n-1);
//    }
}
