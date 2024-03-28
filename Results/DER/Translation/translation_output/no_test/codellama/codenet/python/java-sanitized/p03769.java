import java.util.ArrayList;
import java.util.List;

public class p03769 {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        List<Integer> X = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            X.add(i);
        }
        System.out.println(X.size());
        System.out.println(X.toString());
    }
}