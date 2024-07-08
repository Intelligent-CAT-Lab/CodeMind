import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) throws Exception {
    try (final var stdin = new InputStreamReader(System.in);
         final var br = new BufferedReader(stdin)) {
var newVariable_0 = br.readLine().split(" ");var newVariable_1 = br.readLine();      final var x = Arrays.stream(newVariable_1.split(" "))
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
