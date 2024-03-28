import java.util.ArrayList;

public class p02427 {

    public static ArrayList<ArrayList<Integer>> subset(int n) {
        ArrayList<ArrayList<Integer>> subsets = new ArrayList<>();
        for (int i = 0; i < Math.pow(2, n); i++) {
            ArrayList<Integer> subset = new ArrayList<>();
            for (int v = 0; v < n; v++) {
                if ((i & (1 << v)) > 0) {
                    subset.add(v);
                }
            }
            subsets.add(subset);
        }
        return subsets;
    }

    public static void run() {
        java.util.Scanner input = new java.util.Scanner(System.in);
        int n = input.nextInt();

        ArrayList<ArrayList<Integer>> subsets = subset(n);
        for (int i = 0; i < subsets.size(); i++) {
            System.out.print(i + ":");
            for (int j = 0; j < subsets.get(i).size(); j++) {
                System.out.print(" " + subsets.get(i).get(j));
            }
            System.out.println();
        }
        input.close();
    }

    public static void main(String[] args) {
        run();
    }
}