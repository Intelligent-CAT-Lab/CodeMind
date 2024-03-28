public class p03227 {
    public static void main(String[] args) {
        String input = "abc";
        String output = reverseString(input);
        System.out.println(output);
    }

    public static String reverseString(String input) {
        if (input.length() == 2) {
            return input;
        } else {
            return new StringBuilder(input).reverse().toString();
        }
    }
}