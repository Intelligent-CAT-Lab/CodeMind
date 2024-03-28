import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p03549 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static int mod = (int) 1e9 + 7;
    
    public static int getN() throws IOException {
        return Integer.parseInt(br.readLine().trim());
    }
    
    public static int[] getNM() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] nm = new int[2];
        nm[0] = Integer.parseInt(st.nextToken());
        nm[1] = Integer.parseInt(st.nextToken());
        return nm;
    }
    
    public static int[] getList() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] list = new int[st.countTokens()];
        for (int i = 0; i < list.length; i++) {
            list[i] = Integer.parseInt(st.nextToken());
        }
        return list;
    }
    
    public static int[] getArray(int intn) throws IOException {
        int[] arr = new int[intn];
        for (int i = 0; i < intn; i++) {
            arr[i] = Integer.parseInt(br.readLine().trim());
        }
        return arr;
    }

    public static void main(String[] args) throws IOException {
        int[] nm = getNM();
        int N = nm[0];
        int M = nm[1];
        int total = 1900 * M + 100 * (N - M);
        System.out.println(total * (1 << M));
    }
}