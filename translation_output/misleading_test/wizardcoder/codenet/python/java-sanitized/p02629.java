import java.io.*;

public class p02629 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String res = "";
        while(N > 0) {
            char ch = (char)('a' + (N % 26));
            res += ch;
            N /= 26;
        }
        System.out.println(res);
    }
}