import java.util.Scanner;

public class p03963 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(k * (int)Math.pow(k - 1, n - 1));
    }
}




import java.util.Scanner;

public class p03963 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += sc.nextInt();
        }
        System.out.println(sum / k);
    }
}

/java/00