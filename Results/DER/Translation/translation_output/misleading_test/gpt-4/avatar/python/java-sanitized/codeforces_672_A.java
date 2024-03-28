import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_672_A {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        for (int i = 1; i < 371; i++) {
            List<Integer> temp = new ArrayList<>();
            int p = i;
            int q = i;
            int count = 0;
            while (p != 0) {
                p /= 10;
                count += 1;
            }
            if (count == 1) {
                li.add(i);
            }
            if (count == 2) {
                temp = new ArrayList<>();
                while (q != 0) {
                    int x = q % 10;
                    q /= 10;
                    temp.add(0, x); // Add in reverse order
                }
                li.addAll(temp);
            }
            if (count == 3) {
                temp = new ArrayList<>();
                while (q != 0) {
                    int x = q % 10;
                    q /= 10;
                    temp.add(0, x); // Add in reverse order
                }
                li.addAll(temp);
            }
        }
        li.remove(li.size() - 1);
        li.remove(li.size() - 1);

        Scanner scanner = new Scanner(System.in);
        System.out.print(" ");
        int n = scanner.nextInt();
        System.out.println(li.get(n - 1));
    }
}