import java.util.*;

public class p03389 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        List<Integer> a = new ArrayList<>(Arrays.asList(A, B, C));
        Collections.sort(a);

        int s = 0;

        for (int i = 0; i < 2; i++) {
            int tmp = a.get(2) - a.get(i);
            s += tmp / 2;
            a.set(i, a.get(i) + tmp / 2 * 2);
        }

        s += sum(a) % 3;

        System.out.println(s);
    }

    public static int sum(List<Integer> a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }
}