import java.io.*;

public class p02629 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        String res = "";
        while (N > 0) {
            char c = (char) ('a' + (N % 26));
            res += c;
            N /= 26;
        }
        bw.write(res.substring(res.length() - 1) + res.substring(0, res.length() - 1));
        bw.flush();
        bw.close();
    }
}