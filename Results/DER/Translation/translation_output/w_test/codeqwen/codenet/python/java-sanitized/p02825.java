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
        if (n % 2 == 1) {
            a[n - 5][n - 5] = 'a';
            a[n - 5][n - 4] = 'a';
            a[n - 5][n - 3] = 'a';
            a[n - 5][n - 2] = 'a';
            a[n - 5][n - 1] = 'a';
            a[n - 4][n - 5] = 'b';
            a[n - 4][n - 4] = 'b';
            a[n - 4][n - 3] = 'b';
            a[n - 4][n - 2]