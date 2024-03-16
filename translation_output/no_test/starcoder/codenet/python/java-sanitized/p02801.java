import java.util.*;
public class p02801 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String C = sc.next();
        char[] al = new char[26];
        for (int i = 0; i < 26; i++) {
            al[i] = (char) ('a' + i);
        }
        int idx = Arrays.binarySearch(al, C);
        System.out.println(al[idx + 1]);
    }
}