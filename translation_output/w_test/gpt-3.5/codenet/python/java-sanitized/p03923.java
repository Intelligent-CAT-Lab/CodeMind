import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p03923 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());

            int t = n;
            for (int k = 1; k < Math.ceil(Math.log(n) / Math.log(2)); k++) {
                int d = (int) Math.ceil(Math.pow(n,