import java.util.*;

public class p04043 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);
        Collections.sort(list);
        if (list.get(0) == 5 && list.get(1) == 5 && list.get(2) == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}