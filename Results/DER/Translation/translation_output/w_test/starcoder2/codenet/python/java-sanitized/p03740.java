import java.util.Scanner;

public class p03740 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(Math.abs(x - y) <= 1 ? "Brown" : "Alice");
    }
}




import java.util.Scanner;

public class p03740 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (a[i] == b[j]) {
                k--;
            }
            if (k == 0) {
                System.out.println(a[i]);
                break;
            }
            if (a[i] < b[j]) {
                i++;
            } else {
                j++;
            }
        }
    }
}

/2020-09-28/README.md
# 2020-09-28