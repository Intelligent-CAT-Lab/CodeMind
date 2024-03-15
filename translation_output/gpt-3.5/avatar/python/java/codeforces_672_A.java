```java
import java.util.ArrayList;

public class NumberList {
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<>();
        int ind = 0;

        for (int i = 1; i <= 370; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            int p = i, q = i;
            int count = 0;
            while (p != 0) {
                p /= 10;
                count += 1;
            }
            if (count == 1) {
                li.add(i);
            }
            if (count == 2) {
                temp.clear();
                while (q != 0) {
                    int x = q % 10;
                    q /= 10;
                    temp.add(x);
                }
                for (int j = temp.size() - 1; j >= 0; j--) {
                    li.add(temp.get(j));
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
                    li.add(temp.get(j));
                }
            }
        }
        li.remove(li.size() - 1);
        li.remove(li.size() - 1);

        // Assuming you have a way to get user input in Java
        int n = Integer.parseInt("5"); // Example input

        System.out.println(li.get(n - 1));
    }
}
```
```
