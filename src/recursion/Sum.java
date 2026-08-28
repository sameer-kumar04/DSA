package recursion;

public class Sum {
    public static int sumOfNnaturalnumbers(int n) {
        if ( n == 0 ) {
            return 0;
        }

        return sumOfNnaturalnumbers(n-1) + n;
    }
}
