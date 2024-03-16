Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

class atcoder_ABC042_A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int num_1 = Integer.parseInt(str);

        str = scan.next();
        int num_2 = Integer.parseInt(str);

        str = scan.next();
        int num_3 = Integer.parseInt(str);

        if (num_1 == 7) {
            if (num_2 == 5 && num_3 == 5) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else if (num_2 == 7) {
            if (num_1 == 5 && num_3 == 5) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else if (num_3 == 7) {
            if (num_2 == 5 && num_1 == 5) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
```

### Response:
```python
import java.util.*;

class atcoder_ABC042_A:
    def main(self):
        scan = Scanner(System.in)
        str = scan.next()
        num_1 = Integer.parseInt(str)

        str = scan.next()
        num_2 = Integer.parseInt(str)

        str = scan.next()
        num_3 = Integer.parseInt(str)

        if num_1 == 7:
            if num_2 == 5 and num_3 == 5:
                print("YES")
            else:
                print("NO")
        elif num_2 == 7:
            if num_1 == 5 and num_3 == 5:
                print("YES")
            else:
                print("NO")
        elif num_3 == 7:
            if num_2 == 5 and num_1 == 5:
                print("YES")
            else:
                print("NO")
```<|endoftext|>
