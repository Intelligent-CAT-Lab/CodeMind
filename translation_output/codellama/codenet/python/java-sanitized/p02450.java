import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class p02450 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                int temp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, temp);
                System.out.println(list);
                list.set(i, temp);
            }
        }
    }
}