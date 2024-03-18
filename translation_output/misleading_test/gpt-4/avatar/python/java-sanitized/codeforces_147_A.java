import java.util.Scanner;

public class codeforces_147_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your input:");
        String s = scanner.nextLine();
        String t = " ,.?!";
        
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            s = s.replace(Character.toString(c), c + " ▁ ");
        }
        
        s = String.join(" ▁ ", s.trim().split("\\s+"));
        
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            s = s.replace(" ▁ " + c, Character.toString(c));
        }
        
        System.out.println(s);
        scanner.close();
    }
}