import java.util.Scanner;

public class atcoder_ABC132_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        if (arr[0] == arr[1] && arr[2] == arr[3] && arr[0]!= arr[2]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}