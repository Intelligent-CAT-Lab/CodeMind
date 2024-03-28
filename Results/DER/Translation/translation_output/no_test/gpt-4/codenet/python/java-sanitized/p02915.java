import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p02915 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = reader.readLine()) != null) {
                int n = Integer.parseInt(line.split("\\s+")[0]);
                System.out.println((long) n * n * n);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}