import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (char)((arr[i] - 'A' - 3 + 26) % 26 + 'A');
        }
        System.out.println(arr);
    }
}

