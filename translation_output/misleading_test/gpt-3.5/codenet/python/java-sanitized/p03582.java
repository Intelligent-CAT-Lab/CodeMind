import java.util.*;

public class p03582 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            list.add(0);
        }
        for (int i = 0; i < b; i++) {
            list.add(1);
        }
        for (int i = 0; i < c; i++) {
            list.add(2);
        }

        while (list.size() > 1) {
            list.set(0, list.get(0) + list.remove(list.size() - 1));
            Collections.sort(list);
        }

        StringBuilder result = new StringBuilder();
        for (int i : list) {
            if (i == 0) {
                result.append('a');
            } else if (i == 1) {
                result.append('b');
            } else {
                result.append('c');
            }
        }

        System.out.println(result.toString());
    }
}