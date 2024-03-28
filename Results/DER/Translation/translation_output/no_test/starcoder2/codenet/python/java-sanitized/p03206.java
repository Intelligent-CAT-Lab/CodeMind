import java.util.Scanner;

public class p03206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        String[] d = {"Christmas", "Christmas Eve", "Christmas Eve Eve", "Christmas Eve Eve Eve"};
        System.out.println(d[D]);
    }
}




import java.util.Scanner;

public class p03206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = new int[N];
        for (int i = 0; i < N; i++) {
            b[i] = sc.nextInt();
        }
        int[] c = new int[N];
        for (int i = 0; i < N; i++) {
            c[i] = a[i] + b[i];
        }
        for (int i = 0; i < N; i++) {
            System.out.print(c[i] + " ");
        }
    }
}

/2019-09-25/README.md
# 2019-09-25