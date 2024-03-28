public class codeforces_59_A {
    public static void main(String[] args) {
        String input = "CDOZDPBVVVHNBJVBYHEOXWFLJKRWJCAJMIFCOZWWYFKVWOGTVJcuusigdqfkumewjtdyitveeiaybwrhomrwmpdipjwiuxfnwuz";
        String output = "";
        int cap = 0;
        int small = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLowerCase(c)) {
                small++;
            } else {
                cap++;
            }
        }

        if (small >= cap) {
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                output += Character.toLowerCase(c);
            }
        } else {
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                output += Character.toUpperCase(c);
            }
        }

        System.out.println(output);
    }
}