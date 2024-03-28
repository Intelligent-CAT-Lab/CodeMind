import java.util.*;

public class p03206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        Map<Integer, String> d = new HashMap<>();
        d.put(25, "Christmas");
        d.put(24, "Christmas Eve");
        d.put(23, "Christmas Eve Eve");
        d.put(22, "Christmas Eve Eve Eve");
        System.out.println(d.get(D));
    }
}