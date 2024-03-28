import java.util.*;

public class p02430 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            l.add(i);
        }

        List<List<Integer>> combs = new ArrayList<>();
        generateCombinations(l, k, new ArrayList<>(), combs);

        List<Integer> sumList = new ArrayList<>();
        for (List<Integer> comb : combs) {
            int sum = 0;
            for (int c : comb) {
                sum += Math.pow(2, c);
            }
            sumList.add(sum);
        }

        List<Integer> sortedIndices = new ArrayList<>();
        for (int i = 0; i < sumList.size(); i++) {
            sortedIndices.add(i);
        }
        sortedIndices.sort(Comparator.comparingInt(sumList::get));

        for (int i : sortedIndices) {
            System.out.print(sumList.get(i) + ": ");
            for (int c : combs.get(i)) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    private static void generateCombinations(List<Integer> l, int k, List<Integer> current, List<List<Integer>> combs) {
        if (k == 0) {
            combs.add(new ArrayList<>(current));
            return;
        }
        if (l.isEmpty()) {
            return;
        }

        int head = l.get(0);
        List<Integer> rest = l.subList(1, l.size());

        // include head
        current.add(head);
        generateCombinations(rest, k - 1, current, combs);
        current.remove(current.size() - 1);

        // exclude head
        generateCombinations(rest, k, current, combs);
    }
}