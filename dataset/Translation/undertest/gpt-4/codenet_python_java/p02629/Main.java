import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p02629 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        StringBuilder res = new StringBuilder();
        
        while (N > 0) {
            N--; // Since the alphabet starts at 'a', we decrement first
            res.append((char) ('a' + N % 26));
            N /= 26;
        }
        
        // Reverse the result string and output it
        System.out.println(res.reverse().toString());
    }
}