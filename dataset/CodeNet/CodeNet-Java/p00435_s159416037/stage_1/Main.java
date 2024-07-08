import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
var newVariable_0 = sc.next();        char[] arr = newVariable_0.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (char)((arr[i] - 'A' - 3 + 26) % 26 + 'A');
        }
        System.out.println(arr);
    }
}

