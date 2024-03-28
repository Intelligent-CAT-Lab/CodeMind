import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class p02629 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        String res = "";
        while (N > 0) {
            N--;
            res += (char) (97 + N % 26);
            N /= 26;
        }
        System.out.println(res);
    }
}