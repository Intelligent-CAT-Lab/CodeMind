import java.util.*;

public class p02430 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            l.add(i);
        }
        List<List<Integer>> combs = new ArrayList<>();
        for (List<Integer> c : new Combinations(l, k)) {
            combs.add(c);
        }
        List<Integer> sumlist = new ArrayList<>();
        for (List<Integer> comb : combs) {
            int sum = 0;
            for (int c : comb) {
                sum += Math.pow(2, c);
            }
            sumlist.add(sum);
        }
        Collections.sort(sumlist);
        Collections.sort(combs, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                return Integer.compare(sumlist.indexOf(sumlist.get(combs.indexOf(o1))), sumlist.indexOf(sumlist.get(combs.indexOf(o2))));
            }
        });
        for (int i = 0; i < combs.size(); i++) {
            List<Integer> comb = combs.get(i);
            int sum = sumlist.get(i);
            String c_str = "";
            for (int j = 0; j < comb.size(); j++) {
                c_str += comb.get(j) + " ";
            }
            System.out.println(sum + ": " + c_str);
        }
    }
}

class Combinations implements Iterable<List<Integer>> {
    private final List<Integer> elements;
    private final int r;

    public Combinations(List<Integer> elements, int r) {
        this.elements = elements;
        this.r = r;
    }

    @Override
    public Iterator<List<Integer>> iterator() {
        return new Iterator<List<Integer>>() {
            private final int[] indices = new int[r];
            private final List<Integer> combination = new ArrayList<>(r);

            {
                for (int i = 0; i < r; i++) {
                    combination.add(null);
                }
            }

            @Override
            public boolean hasNext() {
                return nextCombination();
            }

            @Override
            public List<Integer> next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                List<Integer> result = new ArrayList<>(combination);
                return result;
            }

            private boolean nextCombination() {
                int i = r - 1;
                while (i >= 0) {
                    if (indices[i] < i + elements.size() - r + 1) {
                        combination.set(i, elements.get(indices[i]));
                        for (int j = i + 1; j < r; j++) {
                            indices[j] = indices[j - 1] + 1;
                            combination.set(j, elements.get(indices[j]));
                        }
                        return true;
                    }
                    i--;
                }
                return false;
            }
        };
    }
}