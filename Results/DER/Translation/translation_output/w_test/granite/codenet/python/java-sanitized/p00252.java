import java.util.*;

public class p00252 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String B = sc.nextLine();

        List<String> O = Arrays.asList("1 1 0", "0 0 1");

        if (O.contains(B)) {
            System.out.println("Open");
        } else {
            System.out.println("Close");
        }
    }
}