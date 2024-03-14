Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class p03029 {
    public static void main(String[] args){
        try {

        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        String str[] = (br.readLine()).split("\\s+");
        int A = Integer.parseInt(str[0]);
        int P = Integer.parseInt(str[1]);
        System.out.println((P+3*A)/2);

        } catch(IOException e) {
            System.out.println("Exception :" + e);
        }

    }
}
```

### Response:
```python
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class p03029:
    def main(self):
        try:
            br = BufferedReader(InputStreamReader(System.in))
            str = br.readLine().split()
            A = int(str[0])
            P = int(str[1])
            print((P+3*A)//2)
        except IOException as e:
            print("Exception :", e)

p03029().main()
```

Note: In Python, integer division is performed using the double forward slash (//) operator instead of the single forward slash (/).<|endoftext|>
