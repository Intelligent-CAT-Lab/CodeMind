import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class p03561 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int N = scanner.nextInt();
        scanner.close();

        if (K % 2 == 0) {
            List<Integer> list = new ArrayList<>();
            list.add(K / 2);
            for (int i = 0; i < N - 1; i++) {
                list.add(K);
            }
            printList(list);
        } else {
            List<Integer> list = new ArrayList<>();
            list.add((K + 1) / 2);
            for (int i = 0; i < N / 2; i++) {
                if (list.get(list.size() - 1) == 1) {
                    list.remove(list.size() - 1);
                } else {
                    list.set(list.size() - 1, list.get(list.size() - 1) - 1);
                    for (int j = 0; j < N - list.size(); j++) {
                        list.add(K);
                    }
                }
            }
            printList(list);
        }
    }

    private static void printList(List<Integer> list) {
        for (int i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}