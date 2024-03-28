public class p00006 {
    public static void main(String[] args) {
        String input = "w32nimda";
        String output = reverseString(input);
        System.out.println(output);
    }

    public static String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}