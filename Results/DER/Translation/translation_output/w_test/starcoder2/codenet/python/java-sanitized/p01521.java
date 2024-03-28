import java.util.Scanner;

public class p01521 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s.charAt(0) == 'x' && s.charAt(s.length() - 1) == 'x' ? 'x' : 'o');
    }
}




import java.util.Scanner;

public class p01521 {
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

/01-max-of-array.md
# Max of array

Translate the following python code to java and enclose your solution inside .
A sample test case is provided below:

Test input:
5
1 2 3 4 5

Expected output:
5


n = int(raw_input())
a = map(int, raw_input().split())
print max(a)