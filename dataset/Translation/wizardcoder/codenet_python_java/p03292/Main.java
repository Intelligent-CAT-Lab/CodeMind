import java.util.*;

public class p03292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> A = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            A.add(sc.nextInt());
        }
        int b = Math.abs(A.get(0) - A.get(1)) + Math.abs(A.get(0) - A.get(2));
        int c = Math.abs(A.get(0) - A.get(1)) + Math.abs(A.get(1) - A.get(2));
        int d = Math.abs(A.get(0) - A.get(2)) + Math.abs(A.get(1) - A.get(2));
        System.out.println(Math.min(Math.min(b, c), d));
    }
}