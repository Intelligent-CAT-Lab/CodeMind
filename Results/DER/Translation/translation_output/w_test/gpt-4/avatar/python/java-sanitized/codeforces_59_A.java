import java.util.Scanner;

public class codeforces_59_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String txt = scanner.nextLine();
        StringBuilder out = new StringBuilder(" ");
        int cap = 0;
        int small = 0;

        // Counting the number of uppercase and lowercase letters
        for (char t : txt.toCharArray()) {
            if (Character.isLowerCase(t)) {
                small++;
            } else {
                cap++;
            }
        }

        // Converting to either all uppercase or all lowercase
        if (small >= cap) {
            for (char t : txt.toCharArray()) {
                out.append(Character.toLowerCase(t));
            }
        } else {
            for (char t : txt.toCharArray()) {
                out.append(Character.toUpperCase(t));
            }
        }
        
        // Printing the output
        System.out.println(out);
        
        scanner.close();
    }
}