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
        List<List<Integer>> combList = new ArrayList<>();
        for (List<Integer> comb : combs) {
            int sum = 0;
            for (int c : comb) {
                sum += Math.pow(2, c);
            }
            sumList.add(sum);
            combList.add(comb);
        }

        List<Integer> sortedIndices = new ArrayList<>();
        for (int i = 0; i < sumList.size(); i++) {
            sortedIndices.add(i);
        }
        sortedIndices.sort(Comparator.comparingInt(sumList::get));

        for (int index : sortedIndices) {
            List<Integer> comb = combList.get(index);
            String combStr = String.join(" ", comb.toString().replaceAll("[\\[\\],]", "").trim());
            System.out.println(sumList.get(index) + ": " + combStr);
        }
    }

    private static void generateCombinations(List<Integer> list, int k, List<Integer> current, List<List<Integer>> result) {
        if (current.size() == k) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            current.add(list.get(i));
            generateCombinations(list.subList(i + 1, list.size()), k - 1, current, result);
            current.remove(current.size() - 1);
        }
    }
}