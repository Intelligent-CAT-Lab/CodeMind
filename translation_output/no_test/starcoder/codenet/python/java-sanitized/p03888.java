import java.util.Scanner;

public class p03888 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        int r1 = Integer.parseInt(arr[0]);
        int r2 = Integer.parseInt(arr[1]);
        System.out.println(1 / ((r2 + r1) / (r1 * r2)));
    }
}