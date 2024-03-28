import java.util.Arrays;

public class p02825 {
    public static void main(String[] args) {
        int n = 6;
        if (n == 2) {
            System.out.println(-1);
            System.exit(0);
        }
        if (n == 3) {
            System.out.println("abb");
            System.out.println("a.c");
            System.out.println("ddc");
            System.exit(0);
        }
        if (n == 5) {
            System.out.println("aabbc");
            System.out.println("hi..c");
            System.out.println("hi..d");
            System.out.println("g.jjd");
            System.out.println("gffee");
            System.exit(0);
        }
        if (n == 7) {
            System.out.println("..abc..");
            System.out.println("..abc..");
            System.out.println("aax..aa");
            System.out.println("bbx..bb");
            System.out.println("cc.yycc");
            System.out.println("..abc..");
            System.out.println("..abc..");
            System.exit(0);
        }
        
        char[][] a = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(a[i], '.');
        }
        
        if (n % 2 != 0) {
            char[] letters1 = {'a', 'a', 'b', 'b', 'c'};
            char[] letters2 = {'h', 'i', '.', '.', 'c'};
            char[] letters3 = {'h', 'i', '.', '.', 'd'};
            char[] letters4 = {'g', '.', 'j', 'j', 'd'};
            char[] letters5 = {'g', 'f', 'f', 'e', 'e'};
            
            for (int i = 0; i < 5; i++) {
                a[n-5][n-5+i] = letters1[i];
                a[n-4][n-5+i] = letters2[i];
                a[n-3][n-5+i] = letters3[i];
                a[n-2][n-5+i] = letters4[i];
                a[n-1][n-5+i] = letters5[i];
            }
            n -= 5;
        }
        
        for (int i = 0; i < n; i += 2) {
            a[i][i] = 'a';
            a[i][i+1] = 'a';
            a[i+1][i] = 'b';
            a[i+1][i+1] = 'b';
        }
        
        if (n % 4 == 0) {
            for (int i = 0; i < n; i += 2) {
                a[n-i-2][i] = 'c';
                a[n-i-2][i+1] = 'd';
                a[n-i-1][i] = 'c';
                a[n-i-1][i+1] = 'd';
            }
        } else {
            for (int i = 0; i < n-2; i += 2) {
                a[i][i+2] = 'c';
                a[i][i+3] = 'd';
                a[i+1][i+2] = 'c';
                a[i+1][i+3] = 'd';
            }
            a[n-2][0] = 'c';
            a[n-2][1] = 'd';
            a[n-1][0] = 'c';
            a[n-1][1] = 'd';
        }

        for (char[] row : a) {
            System.out.println(new String(row));
        }
    }
}