import java.util.*;

public class codeforces_672_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < 371; i++) {
            int count = 0;
            int num = i;
            while (num != 0) {
                num /= 10;
                count++;
            }
            if (count == 1) {
                list.add(i);
            } else if (count == 2) {
                int temp = i;
                while (temp != 0) {
                    int digit = temp % 10;
                    temp /= 10;
                    list.add(digit);
                }
            } else if (count == 3) {
                int temp = i;
                while (temp != 0) {
                    int digit = temp % 10;
                    temp /= 10;
                    list.add(digit);
                }
            }
        }
        list.remove(list.size() - 1);
        list.remove(list.size() - 1);
        System.out.println(list.get(n - 1));
    }
}