import java.io.*;
import java.util.*;

public class p03549 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer tokenizer = null;

    static int getN() throws IOException {
        return Integer.parseInt(reader.readLine());
    }

    static int[] getNM() throws IOException {
        return Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    }

    static List<Integer> getList() throws IOException {
        return Arrays.stream(reader.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
    }

    static int[] getArray(int intn) throws IOException {
        int[] array = new int[intn];
        for (int i = 0; i < intn; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        return array;
    }

    public static void main(String[] args) throws IOException {
        int[] nm = getNM();
        int N = nm[0];
        int M = nm[1];
        int total = 1900 * M + 100 * (N - M);
        System.out.println(total * (int)Math.pow(2, M));
    }
}