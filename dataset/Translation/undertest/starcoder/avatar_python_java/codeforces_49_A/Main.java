import java.util.*;
public class codeforces_49_A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        int start = sentence.length() - 1;
        String letter = "";
        while (true) {
            if (sentence.charAt(start)!= 'Â' && sentence.charAt(start)!= '?') {
                letter = sentence.charAt(start) + "";
                break;
            }
            start--;
        }
        if (letter.toLowerCase().equals("a") || letter.toLowerCase().equals("e") || letter.toLowerCase().equals("i") || letter.toLowerCase().equals("o") || letter.toLowerCase().equals("u") || letter.toLowerCase().equals("y")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}