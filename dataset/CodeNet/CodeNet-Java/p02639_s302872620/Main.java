import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) throws Exception {
    try (final var stdin = new InputStreamReader(System.in);
         final var br = new BufferedReader(stdin)) {
      final var x = Arrays.stream(br.readLine().split(" "))
        .mapToInt(Integer::parseInt)
        .toArray();

      for (int i = 0; i < x.length; i++) {
        if (x[i] == 0) {
          System.out.println(i + 1);
        }
      }
    }
  }
}
