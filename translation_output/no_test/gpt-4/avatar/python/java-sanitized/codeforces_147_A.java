import java.util.Scanner;

public class codeforces_147_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = " , . ? !";
        
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            s = s.replace(String.valueOf(ch), ch + " ▁"); // Replace '▁' with your special character
        }
        
        s = String.join(" ▁", s.trim().split("\\s+")); // Replace '▁' with your special character
        
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            s = s.replace(" ▁" + ch, String.valueOf(ch)); // Replace '▁' with your special character
        }
        
        System.out.println(s);
        scanner.close();
    }
}