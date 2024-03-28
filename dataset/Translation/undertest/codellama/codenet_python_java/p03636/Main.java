public class p03636 {
    public static void main(String[] args) {
        String input = "internationalization";
        String[] parts = input.split("");
        String a = parts[0];
        String b = parts[1] + parts[2] + parts[3];
        String c = parts[4];
        System.out.println(a + b.length() + c);
    }
}