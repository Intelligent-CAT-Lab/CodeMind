import java.util.Scanner;

public class p03889 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] s = input.toCharArray();
        char[] t = new char[s.length];
        
        // Reverse the input string and replace characters accordingly
        for (int i = 0; i < s.length; i++) {
            char ch = s[s.length - i - 1];
            switch (ch) {
                case 'p':
                    t[i] = 'q';
                    break;
                case 'q':
                    t[i] = 'p';
                    break;
                case 'b':
                    t[i] = 'd';
                    break;
                case 'd':
                    t[i] = 'b';
                    break;
                default:
                    t[i] = ch;
            }
        }
        
        // Check if arrays s and t are equal
        String ans = "Yes";
        for (int i = 0; i < s.length; i++) {
            if (s[i] != t[i]) {
                ans = "No";
                break;
            }
        }
        System.out.println(ans);
        
        sc.close();
    }
}