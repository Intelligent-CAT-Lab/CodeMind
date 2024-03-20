Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 5

Expected output:
-95

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class p00312 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String str1 = reader.readLine();
	    String s[]=str1.split(" ");
	    int i1=Integer.parseInt(s[0]);
	    int i2=Integer.parseInt(s[1]);

	    int count=i1/i2;
	    count+=i1%i2;
	    System.out.println(count);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


```

### Response:
```python
import sys

def main():
    input_str = sys.stdin.readline().strip()
    i1, i2 = map(int, input_str.split())
    count = i1 // i2
    count += i1 % i2
    print(count)

if __name__ == '__main__':
    main()
```

Explanation:

- We first import the `sys` module to read input from the command line.
- We define a `main` function that reads the input from the command line using `sys.stdin.readline().strip()` and splits it into two integers `i1` and `i2` using `map(int, input_str.split())`.
- We calculate the count of divisions needed to get `i1` as a multiple of `i2` using integer division `//` and the modulo operator `%`.
- We add this count to `i1` to get the final result.
- Finally, we print the result using `print(count)`.<|endoftext|>
