package recursion;

public class Power {
    public static int findPower(int m, int n) {
        if ( n == 0 ) {
            return 1;
        }

        if ( n % 2 == 0 ) {//if n is even
            return findPower( m * m , n / 2 );
        }

        return m * findPower( m * m, (n-1)/2 ); //if n is odd
    }
}
