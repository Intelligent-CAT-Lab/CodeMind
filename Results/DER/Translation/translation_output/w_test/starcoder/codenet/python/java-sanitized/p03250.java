import java.util.*;
public class p03250 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] arr = {a, b, c};
        Arrays.sort(arr);
        System.out.println(arr[2] + arr[1] + arr[0]);
    }
}