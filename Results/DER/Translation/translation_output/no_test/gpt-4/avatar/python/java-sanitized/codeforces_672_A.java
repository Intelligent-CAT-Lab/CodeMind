import java.util.ArrayList;
import java.util.Scanner;

public class codeforces_672_A {
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<>();
        for (int i = 1; i < 371; i++) {
            ArrayList<Integer> temp;
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

            if (count == 2 || count == 3) { // Combine the logic for count 2 and 3 as it's the same
                temp = new ArrayList<>();

                while (q != 0) {
                    int x = q % 10;
                    q /= 10;
                    temp.add(0, x); // Prepend the digit by adding at index 0
                }

                li.addAll(temp);
            }
        }

        // Remove the last two elements from the list
        li.remove(li.size() - 1);
        li.remove(li.size() - 1);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = scanner.nextInt();

        if (n >= 1 && n <= li.size()) {
            System.out.println(li.get(n - 1));
        } else {
            System.out.println("Invalid input!");
        }

        scanner.close();
    }
}