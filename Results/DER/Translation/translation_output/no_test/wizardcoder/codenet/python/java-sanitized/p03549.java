import java.util.*;

public class p03549 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = getN();
        int M = getN();
        int total = 1900 * M + 100 * (N - M);
        System.out.println(total * (int) Math.pow(2, M));
    }

    public static int getN() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static int[] getNM() {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[2];
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        return arr;
    }

    public static List<Integer> getList() {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while (sc.hasNextInt()) {
            list.add(sc.nextInt());
        }
        return list;
    }

    public static int[] getArray(int n) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static String input() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine().trim();
    }
}