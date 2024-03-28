import java.util.*;

public class p02566 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int n = S.length();
        int[] sa = suffix_array(S);
        int res = n