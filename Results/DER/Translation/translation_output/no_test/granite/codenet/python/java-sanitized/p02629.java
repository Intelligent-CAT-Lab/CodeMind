import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p02629 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String res = "";
        while (N > 0) {
            N--;
            res = (char) (97 + N % 26) + res;
            N /= 26;
        }
        System.out.println(res);
    }
}