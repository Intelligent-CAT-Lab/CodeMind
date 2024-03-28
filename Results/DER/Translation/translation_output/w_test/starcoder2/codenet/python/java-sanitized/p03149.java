import java.util.Scanner;

public class p03149 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[4];
        for (int i = 0; i < 4; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = {1, 4, 7, 9};
        String ans = "NO";
        for (int i = 0; i < 4; i++) {
            if (a[i] != b[i]) {
                ans = "NO";
                break;
            } else {
                ans = "YES";
            }
        }
        System.out.println(ans);
    }
}




import java.util.Scanner;

public class p03149 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = a[i] + b[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(c[i] + " ");
        }
    }
}

/01-01-2021/01-01-202