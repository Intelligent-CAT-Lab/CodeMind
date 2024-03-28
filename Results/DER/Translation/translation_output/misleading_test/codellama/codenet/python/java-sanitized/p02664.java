public class p02664 {
    public static void main(String[] args) {
        String input = "PD?D??P";
        String output = "";

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '?') {
                output += "D";
            } else {
                output += input.charAt(i);
            }
        }

        System.out.println(output);
    }
}