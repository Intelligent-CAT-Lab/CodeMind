import java.util.Scanner;

public class p03543 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine();
        char[] arr = N.toCharArray();
        if (arr[0] == arr[1] && arr[1] == arr[2] || arr[1] == arr[2] && arr[2] == arr[3]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}