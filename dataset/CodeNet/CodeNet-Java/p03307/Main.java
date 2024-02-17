import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(problem102a(n));
    }

    private static int problem102a(int n) {
        return (n % 2 == 0) ? n : (n * 2);
    }
}