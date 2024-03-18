import java.util.*;

public class p02212 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        List<Integer> list = new ArrayList<>();
        for (String input : inputs) {
            list.add(Integer.parseInt(input));
        }

        Collections.sort(list);
        int result = Math.abs((list.get(0) + list.get(3)) - (list.get(1) + list.get(2)));
        System.out.println(result);
    }
}