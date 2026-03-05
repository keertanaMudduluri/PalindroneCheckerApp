import java.util.Scanner;
public class PalindroneCheckerApp {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        // Prompt for input
        System.out.print("Input : ");
        String input = scanner.nextLine();

        // Start performance measurement
        long startTime = System.nanoTime();

        // Palindrome logic
        boolean isPalindrome = checkPalindrome(input);

        // End performance measurement
        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        // Display results matching the provided snapshot
        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println("Execution Time : " + duration + " ns");

        scanner.close();
    }
}

interface PalindromeStrategy {

    boolean check(String input);
}



class StackStrategy implements PalindromeStrategy {

    public boolean check(String input) {

    private static boolean checkPalindrome(String text) {
        if (text == null) return false;

        String clean = text.replaceAll("\\s+", "").toLowerCase();
        int length = clean.length();

        for (int i = 0; i < length / 2; i++) {
            if (clean.charAt(i) != clean.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
