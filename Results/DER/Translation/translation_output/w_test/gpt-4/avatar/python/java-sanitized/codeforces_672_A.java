import java.util.ArrayList;
import java.util.Scanner;

public class codeforces_672_A {
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<>();
        for (int i = 1; i < 371; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            int p = i;
            int q = i;
            int count = 0;
            while (p != 0) {
                p /= 10;
                count++;
            }
            if (count == 1) {
                li.add(i);
            }
            if (count == 2 || count == 3) {
                temp = new ArrayList<>();
                while (q != 0) {
                    int x = q % 10;
                    q /= 10;
                    temp.add(0, x); // Add at the beginning to reverse order
                }
                li.addAll(temp);
            }
        }
        li.remove(li.size() - 1);
        li.remove(li.size() - 1);

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(li.get(n - 1));
    }
}