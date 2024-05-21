import java.util.HashMap;
import java.util.Map;

public class p02842 {
    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine());

        Map<Integer, Integer> dic = new HashMap<>();
        for (int i = 1; i <= 50000; i++) {
            int p = (int) (i * 1.08);
            dic.put(p, i);
        }

        if (dic.containsKey(n)) {
            System.out.println(dic.get(n));
        } else {
            System.out.println(":(");
        }
    }
}