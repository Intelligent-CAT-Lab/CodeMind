import java.util.Scanner;

public class p02881 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = (int) Math.sqrt(n);
        int j = n / i;
        System.out.println(i + j - 2);
    }
}




import java.util.Scanner;

public class p02881 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        int[] c = new int[k];
        for (int i = 0; i < k; i++) {
            c[i] = sc.nextInt();
        }
        int[] d = new int[n + m + k];
        for (int i = 0; i < n; i++) {
            d[i] = a[i];
        }
        for (int i = 0; i < m; i++) {
            d[i + n] = b[i];
        }
        for (int i = 0; i < k; i++) {
            d[i + n + m] = c[i];
        }
        for (int i = 0; i < n + m + k; i++) {
            System.out.print(d[i] + " ");
        }
    }
}

/2019-2020/2019-2020-1/2019-2020-1-