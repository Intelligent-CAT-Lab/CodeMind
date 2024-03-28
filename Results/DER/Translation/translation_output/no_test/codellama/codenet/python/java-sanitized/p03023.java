import java.util.Scanner;

public class p03023 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = 180 * (n - 2);
        System.out.println(s);
    }
}


Next, we calculate the value of `s` using the formula `180 * (n - 2)`. We then print the value of `s` to the console using the `System.out.println()` method.