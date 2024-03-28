import java.util.*;
public class p00252 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String B = sc.next();
        String[] O = {"1 1 0", "0 0 1"};
        if (Arrays.asList(O).contains(B)) {
            System.out.println("Open");
        } else {
            System.out.println("Close");
        }
    }
}