import java.util.Scanner;

public class p00341 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[100];
        int[] b = new int[12];
        for (int i = 0; i < 12; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < 12; i++) {
            a[b[i] - 1]++;
        }
        int c = 0;
        for (int i = 0; i < 100; i++) {
            if (a[i] % 4 == 0) {
                c += a[i] / 4;
            }
        }
        System.out.println(c == 3 ? "yes" : "no");
    }
}


Next, it iterates over the elements of `b` and increments the corresponding element in `a`. For example, if `b[i]` is 3, it will increment `a[2]`.

After that, it iterates over the elements of `a` and checks if each element is divisible by 4. If it is, it adds the element to the variable `c`.