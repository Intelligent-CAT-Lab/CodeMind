import java.util.*;

public class p02702 {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c[] = str.toCharArray();
        int n = str.length();
        int p = 2019;
        
        // ans: iæ¡ç®ï½jæ¡ç®ã®é¨ååã2019ã®åæ°ã§ãããã¿ã¼ã³æ°
        // ex. 1817181712114
        //         ^^^^^
        long ans = 0;
        
        // 2019ã®åæ°ã«ãªãæ¡i, jã®çµã¿åããå
¨æ¢ç´¢ã¯O(N^2)
        // -> åæ¡ã®ã2019ã®ä½ãããO(N)ã§è¨ç®ããã
        
        // d'[i]: å³ããiæ¡ç®ã®å¤ * 10^i (mod 2019)
        // ex. 1817181712114
        // d'[0]: 4 % 2019 -> 4
        // d'[1]: 10 % 2019 -> 10
        // d'[5]: 700000 (mod 2019) ->?
        // â¡ 7 * 1