import java.util.Scanner;

public class p03624 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] s = input.toCharArray();
        char[] s2 = new char[s.length];
        for (int i = 0; i < s.length; i++) {
            s2[i] = s[i];
        }
        char[] s3 = new char[s2.length];
        for (int i = 0; i < s2.length; i++) {
            s3[i] = s2[i];
        }
        char[] s4 = new char[] {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        if (s3.length == s4.length) {
            System.out.println("None");
        } else {
            for (int i = 0; i < s3.length; i++) {
                if (s3[i] != s4[i]) {
                    System.out.println(s4[i]);
                    break;
                }
                if (i == s3.length - 1) {
                    System.out.println(s4[i + 1]);
                }
            }
        }
    }
}


Next, it checks if `s3` and `s4` are equal in length. If they are, it prints "None" to the console. Otherwise, it iterates through `s3` and checks if each character is equal to the corresponding character in `s4`. If a character is not equal, it prints that character to the console and breaks out of the loop. If the loop completes without breaking, it prints the next character in `s4` to the console.