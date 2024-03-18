```java
import java.util.*;
import java.io.*;

public class Main {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(reader.readLine().trim());

        int K = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i * (i - 1) / 2 == N) {
                K = i;
                break;
            }
        }

        if (K == 0) {
            writer.write("No");
            writer.flush();
            return;
        }

        List<List<Integer>> S = new ArrayList<>();
        for (int i = 0; i < K; i++) {
            S.add(new ArrayList<Integer>());
        }

        int i = 1;
        int k = 0;
        int cnt = 0;
        while (i <= N) {
            S.get(k).add(i);
            i++;
            cnt++;
            if (cnt == K - (k + 1)) {
                k++;
                cnt = 0;
            }
        }

        int j = 1;
        k = 1;
        cnt = 0;
        int col = 0;
        while (j <= N) {
            S.get(k).add(j);
            j++;
            k++;
            cnt++;
            if (cnt == K - (col + 1)) {
                col++;
                k = col + 1;
                cnt = 0;
            }
        }

        writer.write("Yes\n");
        writer.write(K + "\n");

        for (List<Integer> s : S) {
            writer.write((K - 1) + " ");
            for (int num : s) {
                writer.write(num + " ");
            }
            writer.newLine();
        }

        writer.flush();
    }
}
```

To run the code, you could compile it using javac and run the class with java command in your console or use an Integrated Development Environment (IDE) such as IntelliJ IDEA or Eclipse to run it.

Remember to include the class in a file called `Main.java` because the class is public and should match the file name. When running the program, standard input redirection or console input can be used to provide the test input. If you want to provide a permanent input you could replace the standard input with a FileInputStream pointing to a file with the input data.
