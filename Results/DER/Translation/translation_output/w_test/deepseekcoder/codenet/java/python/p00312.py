<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 5

Expected output:
2


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
def main():
    try:
        str1 = input()
        s = str1.split(" ")
        i1 = int(s[0])
        i2 = int(s[1])

        count = i1 // i2
        count += i1 % i2
        print(count)
    except Exception as e:
        print(e)

if __name__ == "__main__":
    main()
```

In Python, the ```//``` operator is used for integer division and the ```%``` operator is used for modulus operation. The ```try-except``` block is used to handle exceptions. The ```input()``` function is used to read input from the user. The ```split()``` function is used to split the input string into a list of strings. The ```int()``` function is used to convert the strings in the list to integers.
<|EOT|>
