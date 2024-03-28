import java.util.Scanner;

public class p02612 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(1000 - n % 1000);
    }
}




import java.util.Scanner;

public class p02612 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                if (i * 2 + j * 4 == k) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

/2020-09-21/README.md
# 2020-09-21