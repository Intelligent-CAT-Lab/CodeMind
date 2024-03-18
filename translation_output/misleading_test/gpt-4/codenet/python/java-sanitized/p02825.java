import java.util.Scanner;

public class p02825 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        if (n == 2) {
            System.out.println(-1);
            return;
        }
        
        if (n == 3) {
            System.out.println("abb");
            System.out.println("a.c");
            System.out.println("ddc");
            return;
        }
        
        if (n == 5) {
            System.out.println("aabbc");
            System.out.println("hi..c");
            System.out.println("hi..d");
            System.out.println("g.jjd");
            System.out.println("gffee");
            return;
        }
        
        if (n == 7) {
            System.out.println("..abc..");
            System.out.println("..abc..");
            System.out.println("aax..aa");
            System.out.println("bbx..bb");
            System.out.println("cc.yycc");
            System.out.println("..abc..");
            System.out.println("..abc..");
            return;
        }
        
        char[][] a = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = '.';
            }
        }
        
        if (n % 2 != 0) {
            String S = "aabbc";
            String T = "hi..c";
            String U = "hi..d";
            String V = "g.jjd";
            String W = "gffee";
            a[n-5] = (new String(String.valueOf(a[n-5])).substring(0, n-5) + S).toCharArray(); 
            a[n-4] = (new String(String.valueOf(a[n-4])).substring(0, n-5) + T).toCharArray(); 
            a[n-3] = (new String(String.valueOf(a[n-3])).substring(0, n-5) + U).toCharArray(); 
            a[n-2] = (new String(String.valueOf(a[n-2])).substring(0, n-5) + V).toCharArray(); 
            a[n-1] = (new String(String.valueOf(a[n-1])).substring(0, n-5) + W).toCharArray();
            n -= 5;
        }
        
        for (int i = 0; i < n; i += 2) {
            a[i][i] = 'a';
            a[i][i + 1] = 'a';
            a[i + 1][i] = 'b';
            a[i + 1][i + 1] = 'b';
        }
        
        if (n % 4 == 0) {
            for (int i = 0; i < n; i += 2) {
                a[n - i - 2][i] = 'c';
                a[n - i - 2][i + 1] = 'd';
                a[n - i - 1][i] = 'c';
                a[n - i - 1][i + 1] = 'd';
            }
        } else {
            for (int i = 0; i < n - 2; i += 2) {
                a[i][i + 2] = 'c';
                a[i][i + 3] = 'd';
                a[i + 1][i + 2] = 'c';
                a[i + 1][i + 3] = 'd';
            }
            a[n - 2][0] = 'c';
            a[n - 2][1] = 'd';
            a[n - 1][0] = 'c';
            a[n - 1][1] = 'd';
        }

        for (char[] row : a) {
            System.out.println(new String(row));
        }
        scanner.close();
    }
}