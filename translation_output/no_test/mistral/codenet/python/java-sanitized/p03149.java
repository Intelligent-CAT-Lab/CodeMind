import java.util.*;

public class p03149 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] split = input.split(" ");
        List<Integer> list = Arrays.asList(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
        Collections.sort(list);
        List<Integer> b = Arrays.asList(1, 4, 7, 9);
        if (list.equals(b)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}