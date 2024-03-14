import java.util.Scanner;

public class codeforces_49_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        int start = -1, letter = 0;
        while (true) {
            if (sentence.charAt(start)!= 'Â' && sentence.charAt(start)!= '?') {
                letter = sentence.charAt(start);
                break;
            }
            start--;
        }
        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'y') {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}