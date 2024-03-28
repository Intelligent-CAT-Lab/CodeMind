import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p02629 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder res = new StringBuilder();
        while(N > 0){
            N -= 1;
            res.append((char)('a' + N % 26));
            N /= 26;
        }
        System.out.println(res.reverse());
    }
}