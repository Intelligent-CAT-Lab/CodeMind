import java.util.*;
public class p02639 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> x_list = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            x_list.add(sc.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            if (x_list.get(i) == 0) {
                System.out.println(i + 1);
            }
        }
    }
}