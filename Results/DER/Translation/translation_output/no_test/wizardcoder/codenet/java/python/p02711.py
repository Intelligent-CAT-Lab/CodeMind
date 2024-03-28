Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

class p02711 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String string = String.valueOf(n);
        System.out.println(string.contains("7")? "Yes" : "No");
    }
}
```

### Response:
```python
import java.util.Scanner;

class p02711:
    def main(self):
        s = Scanner(System.in)
        n = s.nextInt()
        string = str(n)
        print("Yes" if "7" in string else "No")
```<|endoftext|>
