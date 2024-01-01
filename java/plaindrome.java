public class  plaindrome{
    public static boolean isPalindrome(String palindrome) {
        int start = 0;
        int end = palindrome.length() - 1;

        while (start <= end) {
            if (palindrome.charAt(start) != palindrome.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = args[0];
        System.out.print(isPalindrome(s));
    }
}


