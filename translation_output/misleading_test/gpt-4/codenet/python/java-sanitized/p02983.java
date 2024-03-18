import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class p02983 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();
        sc.close();

        if (R - L > 2019) {
            System.out.println(0);
        } else {
            List<Integer> l = new ArrayList<>();
            for (int i = L; i <= R; i++) {
                for (int j = i + 1; j <= R; j++) {
                    l.add(i * j % 2019);
                }
            }
            System.out.println(l.stream().min(Integer::compare).get());
        }
    }
}