import java.util.Scanner;

public class codeforces_579_A {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        int n = str.nextInt();
        String s = " ";
        
        while (n > 0) {
            int x = n % 2;
            n /= 2;
            s += x + " ";
        }
        
        int ans = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                ans++;
            }
        }
        
        System.out.println(ans);
    }
}



import java.util.Scanner;

public class codeforces_579_A {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        int n = str.nextInt();
        String s = " ";
        
        while (n > 0) {
            int x = n % 2;
            n /= 2;
            s += x + " ";
        }
        
        int ans = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                ans++;
            }
        }
        
        System.out.println(ans);
    }
}