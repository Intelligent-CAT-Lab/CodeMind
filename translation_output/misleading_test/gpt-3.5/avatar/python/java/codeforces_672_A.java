```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int ind = 0;
        for (int i = 1; i < 371; i++) {
            List<Integer> temp = new ArrayList<>();
            int p = i;
            int q = i;
            int count = 0;
            while (p != 0) {
                p /= 10;
                count++;
            }
            if (count == 1) {
                list.add(i);
            }
            if (count == 2) {
                temp.clear();
                while (q != 0) {
                    int x = q % 10;
                    q /= 10;
                    temp.add(x);
                }
                for (int j = temp.size() - 1; j >= 0; j--) {
                    list.add(temp.get(j));
                }
            }
            if (count == 3) {
                temp.clear();
                while (q != 0) {
                    int x = q % 10;
                    q /= 10;
                    temp.add(x);
                }
                for (int j = temp.size() - 1; j >= 0; j--) {
                    list.add(temp.get(j));
                }
            }
        }
        list.remove(list.size() - 1);
        list.remove(list.size() - 1);

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(list.get(n - 1));
    }
}
```

