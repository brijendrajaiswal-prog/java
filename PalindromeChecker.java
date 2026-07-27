public class PalindromeChecker {
    
    public static void main(String[] args) {
        String str1 = "racecar";
        String str2 = "hello";
        
        boolean result1 = isPalindrome(str1);
        boolean result2 = isPalindrome(str2);
        
        System.out.println("\"" + str1 + "\" is Palindrome: " + result1);
        System.out.println("\"" + str2 + "\" is Palindrome: " + result2);
    }
    
    public static boolean isPalindrome(String str) {
        // Remove spaces and convert to lowercase
        str = str.replaceAll("\\s+", "").toLowerCase();
        
        // Compare string with its reverse
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}
