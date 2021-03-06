class Palindrome {

    public static void main(String[] args) {
        Palindrome solution = new Palindrome();
        System.out.println("result: " + String.valueOf(solution.isPalindrome(1221)));
        System.out.println("result: " + String.valueOf(solution.isPalindrome(1442323423)));
    }

    public boolean isPalindrome(int x) {
        String inputString = String.valueOf(x);
        boolean result = true;
        if (x > Integer.MAX_VALUE || x < Integer.MIN_VALUE) {
            return false;
        }
        for (int i = 0; i <= inputString.length() / 2; i++) {
            if (inputString.charAt(i) != inputString.charAt(inputString.length() - 1 - i)) {
                result = false;
            }
        }
        return result;
    }
}