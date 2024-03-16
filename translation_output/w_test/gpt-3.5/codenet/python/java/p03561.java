```java
import java.util.*;

public class Seishin {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int K = scanner.nextInt();
        int N = scanner.nextInt();

        if (K % 2 == 0) {
            List<Integer> result = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                result.add(K/2);
            }
            System.out.println(result.toString().replace(",", "").replace("[", "").replace("]", ""));
        } else {
            List<Integer> X = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                X.add((K+1)/2);
            }
            for (int i = 0; i < N/2; i++) {
                if (X.get(X.size()-1) == 1) {
                    X.remove(X.size()-1);
                } else {
                    X.set(X.size()-1, X.get(X.size()-1) - 1);
                    for (int j = 0; j < N-X.size(); j++) {
                        X.add(K);
                    }
                }
            }
            System.out.println(X.toString().replace(",", "").replace("[", "").replace("]", ""));
        }

        scanner.close();
    }
}
```
