import java.util.*;
public class p00029 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] a = sc.nextLine().split(" ");
        int max = 0;
        String max_word = "";
        for (String word : a) {
            int count = 0;
            for (String w : a) {
                if (word.equals(w)) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
                max_word = word;
            }
        }
        System.out.println(max_word);
        int max_len = 0;
        String max_len_word = "";
        for (String word : a) {
            if (word.length() > max_len) {
                max_len = word.length();
                max_len_word = word;
            }
        }
        System.out.println(max_len_word);
    }
}