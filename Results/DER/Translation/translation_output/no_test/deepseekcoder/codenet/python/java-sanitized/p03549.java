import java.util.*;
import java.lang.*;

class Main {
    static Scanner in = new Scanner(System.in);

    static int getN() {
        return in.nextInt();
    }

    static int[] getNM() {
        int[] arr = new int[2];
        arr[0] = in.nextInt();
        arr[1] = in.nextInt();
        return arr;
    }

    static ArrayList<Integer> getList() {
        ArrayList<Integer> list = new ArrayList<>();
        while (in.hasNextInt()) {
            list.add(in.nextInt());
        }
        return list;
    }

    static int[] getArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        return arr;
    }

    public static void main (String[] args) {
        int[] nm = getNM();
        int N = nm[0], M = nm[1];
        int total = 1900 * M + 100 * (N - M);
        System.out.println(total * (int)Math.pow(2, M));
    }
}