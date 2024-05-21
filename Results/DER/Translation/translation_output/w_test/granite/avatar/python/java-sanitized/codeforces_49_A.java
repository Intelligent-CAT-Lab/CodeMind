import java.util.*;

public class codeforces_49_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        int start = -1;
        char letter ='';
        while (true) {
            if (sentence.charAt(start)!='â'&& sentence.charAt(start)!= '? ') {
                letter = sentence.charAt(start);
                break;
            }
            start--;
        }
        if (letter =='') {
            System.out.println("NO");
        } else {
            String vowels = "aeiouy";
            if (vowels.contains(String.valueOf(letter).toLowerCase())) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}