import java.util.*;
public class p00993 {
    public static void main(String[] args) {
        System.out.println(Arrays.stream(new int[1500]).reduce(1, (x, y) -> x * y) + 2);
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < sc.nextInt(); i++) {
            System.out.println(i + 1);
        }
    }
}