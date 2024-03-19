import java.util.Scanner;

public class p02825 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

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
            for (int i = 0; i < 7; i++) {
                System.out.println("..abc..");
            }
            return;
        }

        String[] a = new String[n];
        for (int i = 0; i < n; i++) {
            a[i] = ".".repeat(n);
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
            a[i] = a[i].substring(0, i) + "aa" + a[i].substring(i + 2);
            a[i + 1] = a[i + 1].substring(0, i) + "bb" + a[i + 1].substring(i + 2);
        }

        if (n % 4 == 0) {
            for (int i = 0; i < n; i += 2) {
                a[n - i - 2] = a[n - i - 2].substring(0, i) + "cc" + a[n - i - 2].substring(i + 2);
                a[n - i - 1] = a[n - i - 1].substring(0, i) + "dd" + a[n - i - 1].substring(i + 2);
            }
        } else {
            for (int i = 0; i < n - 2; i += 2) {
                a[i] = a[i].substring(0, i + 2) + "cc" + a[i].substring(i + 4);
                a[i + 1] = a[i + 1].substring(0, i + 2) + "dd" + a[i + 1].substring(i + 4);
            }
            a[n - 2] = "cc" + a[n - 2].substring(2);
            a[n - 1] = "dd" + a[n - 1].substring(2);
        }

        for (String i : a) {
            System.out.println(i);
        }
    }
}