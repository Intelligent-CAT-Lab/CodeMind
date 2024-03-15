import java.util.Scanner;

public class p03963 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(k * (k - 1) * Math.pow(k - 1, n - 1));
    }
}




import java.util.Scanner;

public class p03963 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % k == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}

/java/01-basic/01-basic-0