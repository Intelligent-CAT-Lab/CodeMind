import java.util.Scanner;
import java.lang.Math;

public class p02400 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double s = r * r * Math.PI;
        double l = r * 2 * Math.PI;
        System.out.printf("%.5f %.5f", s, l);
    }
}




import java.util.Scanner;

public class p02400 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int max = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println(max);
    }
}

/02-max-of-array.md
# Max of array

Translate the following python code to java and enclose your solution inside .
A sample test case is provided below:

Test input:
5
1 2 3 4 5

Expected output:
5


print(max(input()))



import java.util.Scanner;

public class p02400 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        System.out.println(sum);
    }
}

/01-sum-of-array.md
# Sum of array

Translate the following python code to java and enclose your solution inside .
A sample test case is provided below:

Test input:
5
1 2 3 4 5

Expected output:
15


print(sum(input()))