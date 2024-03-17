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
        String[] a = new String[n];
        for (int i = 0; i < n; i++) {
            a[i] = new String(new char[n]).replace("\0", ".");
        }
        if (n % 2 != 0) {
            a[n - 5] = "aabbc";
            a[n - 4] = "hi..c";
            a[n - 3] = "hi..d";
            a[n - 2] = "g.jjd";
            a[n - 1] = "gffee";
            n -= 5;
        }
        for (int i = 0; i < n; i += 2) {
            a[i] = a[i].substring(0, i) + "a" + a[i].substring(i + 1);
            a[i + 1] = a[i + 1].substring(0, i) + "b" + a[i + 1].substring(i + 1);
        }
        if (n % 4 == 0) {
            for (int i = 0; i < n; i += 2) {
                a[n - i - 2] = a[n - i - 2].substring(0, i) + "c" + a[n - i - 2].substring(i + 1);
                a[n - i - 1] = a[n - i - 1].substring(0, i) + "d" + a[n - i - 1].substring(i + 1);
            }
        } else {
            for (int i = 0; i < n - 2; i += 2) {
                a[i] = a[i].substring(0, i + 2) + "c" + a[i].substring(i + 3);
                a[i + 1] = a[i + 1].substring(0, i + 2) + "d" + a[i + 1].substring(i + 3);
            }
            a[n - 2] = a[n - 2].substring(0, 0) + "c" + a[n - 2].substring(1);
            a[n - 1] = a[n - 1].substring(0, 0) + "d" + a[n - 1].substring(1);
        }
        for (String s : a) {
            System.out.println(s);
        }
    }
}