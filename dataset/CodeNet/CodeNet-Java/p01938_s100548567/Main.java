import java.util.*;

public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();
        char prev = 'A';
        int count = 0;
        for (char c : arr) {
            if (prev >= c) {
                count++;
            }
            prev = c;
        }
        System.out.println(count);
    }
}
