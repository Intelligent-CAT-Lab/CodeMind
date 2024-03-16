import java.util.*;

public class p00341 {
    public static void main(String[] args) {
        int[] a = new int[100];
        List<Integer> b = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        for (int i = 0; i < input.length; i++) {
            b.add(Integer.parseInt(input[i]));
        }
        for (int i = 0; i < 12; i++) {
            a[b.get(i) - 1]++;
        }
        int c = 0;
        for (int i = 0; i < 100; i++) {
            if (a[i] > 0 && a[i] % 4 == 0) {
                c += a[i] / 4;
            }
        }
        System.out.println(c == 3? "yes" : "no");
    }
}