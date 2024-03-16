import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class atcoder_ABC151_A {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char inputChar = (char) (reader.readLine().charAt(0) + 1);
        System.out.println(inputChar);
    }
}