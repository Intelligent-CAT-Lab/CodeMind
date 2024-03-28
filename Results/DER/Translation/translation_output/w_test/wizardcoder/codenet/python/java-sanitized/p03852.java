import java.util.Scanner;

public class p03852 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        sc.close();

        if (ch == 'a' || ch == 'i' || ch == 'u' || ch == 'e' || ch == 'o') {
            System.out.println("vowel");
        } else {
            System.out.println("consonant");
        }
    }
}