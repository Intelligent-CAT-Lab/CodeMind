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
        getCombinations(l, k, new ArrayList<>(), 0, combs);

        List<Integer> sumList = new ArrayList<>();
        for (List<Integer> comb : combs) {
            int sum = 0;
            for (int c : comb) {
                sum += Math.pow(2, c);
            }
            sumList.add(sum);
        }

        List<Pair> z = new ArrayList<>();
        for (int i = 0; i < sumList.size(); i++) {
            z.add(new Pair(sumList.get(i), combs.get(i)));
        }

        Collections.sort(z, Comparator.comparing(Pair::getSum));

        sumList.clear();
        combs.clear();

        for (Pair pair : z) {
            sumList.add(pair.getSum());
            combs.add(pair.getComb());
        }

        for (int i = 0; i < sumList.size(); i++) {
            String cStr = String.join(" ", combs.get(i).stream().map(Object::toString).toArray(String[]::new));
            System.out.println(sumList.get(i) + ": " + cStr);
        }
    }

    private static void getCombinations(List<Integer> numbers, int k, List<Integer> comb, int start, List<List<Integer>> combs) {
        if (k == 0) {
            combs.add(new ArrayList<>(comb));
            return;
        }

        for (int i = start; i <= numbers.size() - k; i++) {
            comb.add(numbers.get(i));
            getCombinations(numbers, k - 1, comb, i + 1, combs);
            comb.remove(comb.size() - 1);
        }
    }

    static class Pair {
        int sum;
        List<Integer> comb;

        Pair(int sum, List<Integer> comb) {
            this.sum = sum;
            this.comb = comb;
        }

        int getSum() {
            return sum;
        }

        List<Integer> getComb() {
            return comb;
        }
    }
}