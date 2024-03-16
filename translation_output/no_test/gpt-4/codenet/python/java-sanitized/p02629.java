import java.io.*;

public class p02629 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        StringBuilder res = new StringBuilder();
        while (N != 0) {
            N--;
            res.append((char) ('a' + N % 26));
            N /= 26;
        }
        System.out.println(res.reverse().toString());
    }
}