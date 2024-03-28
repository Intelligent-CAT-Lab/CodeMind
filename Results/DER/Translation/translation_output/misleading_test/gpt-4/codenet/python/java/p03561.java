Below is the translation of the provided Python code into Java:

```java
import java.util.Scanner;
import java.util.ArrayList;

public class Seishin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int N = scanner.nextInt();
        scanner.close();

        if(K % 2 == 0){
            // Directly print the even case result
            System.out.print(K / 2 + " ");
            for(int i = 1; i < N; i++) {
                System.out.print(K + " ");
            }
        } else {
            // Handle the odd case using an ArrayList
            ArrayList<Integer> X = new ArrayList<>();
            for(int i = 0; i < N; i++){
                X.add((K + 1) / 2);
            }
            for(int i = 0; i < N / 2; i++){
                if(X.get(X.size() - 1) == 1){
                    X.remove(X.size() - 1);
                }else{
                    X.set(X.size() - 1, X.get(X.size() - 1) - 1);
                    while(X.size() < N){
                        X.add(K);
                    }
                }
            }
            // Print the result
            for(int i = 0; i < X.size(); i++){
                if(i > 0) {
                    System.out.print(" ");
                }
                System.out.print(X.get(i));
            }
        }
    }
}
```

This Java code produces the same output as the Python code when given the same input and takes into account the differences between Python and Java, including the need to manage collections differently (ArrayList in Java versus list in Python) and the explicit declaration of variable types.
