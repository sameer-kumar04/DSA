package recursion;

public class Main {
    public static void main(String[] args) {

        String s = "madam";
        System.out.println(Checkpalindrome.isPalindrome(s,0,s.length()));

    }

    public static void printArray(int[] arr) {
        for ( int i : arr ) {
            System.out.print(i + " ");
        }
    }
}
