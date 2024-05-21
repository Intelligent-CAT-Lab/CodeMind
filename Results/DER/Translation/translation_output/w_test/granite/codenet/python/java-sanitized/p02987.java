import java.util.*;

public class p02987 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        String sorted = new String(arr);
        if (s.equals(sorted)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}