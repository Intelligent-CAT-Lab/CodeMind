import java.util.*;

public class atcoder_ABC132_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split(" ");
        if (arr[0].equals(arr[1]) && arr[2].equals(arr[3]) && !arr[0].equals(arr[2])) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}