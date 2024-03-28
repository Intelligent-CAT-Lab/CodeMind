public class p03636 {
    public static void main(String[] args) {
        String input = "internationalization";
        String[] parts = input.split("");
        String output = parts[0] + parts.length + parts[parts.length - 1];
        System.out.println(output);
    }
}