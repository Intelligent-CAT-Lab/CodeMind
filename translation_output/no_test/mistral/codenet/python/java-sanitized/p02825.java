import java.util.ArrayList;
import java.util.List;
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
        List<List<String>> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<String> temp = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                temp.add(".");
            }
            a.add(temp);
        }
        if (n % 2 == 1) {
            a.get(n - 2).set(n - 3, "a");
            a.get(n - 2).set(n - 4, "a");
            a.get(n - 2).set(n - 5, "a");
            a.get(n - 1).set(n - 2, "b");
            a.get(n - 1).set(n - 3, "b");
            a.get(n - 1).set(n - 4, "b");
            a.get(n - 1).set(n - 5, "b");
        }
        if (n % 4 == 0) {
            for (int i = 0; i < n / 2; i++) {
                a.get(n - i - 2).set(i, "c");
                a.get(n - i - 2).set(i + 1, "d");
                a.get(n - i - 1).set(i, "c");
                a.get(n - i - 1).set(i + 1, "d");
            }
        } else {
            for (int i = 0; i < n / 2 - 1; i++) {
                a.get(i).set(i + 2, "c");
                a.get(i).set(i + 3, "d");
                a.get(i + 1).set(i + 2, "c");
                a.get(i + 1).set(i + 3, "d");
            }
            a.get(n - 2).set(0, "c");
            a.get(n - 2).set(1, "d");
            a.get(n - 1).set(0, "c");
            a.get(n - 1).set(1, "d");
        }
        for (List<String> temp : a) {
            for (String s : temp) {
                System.out.print(s);
            }
            System.out.println();
        }
    }
}