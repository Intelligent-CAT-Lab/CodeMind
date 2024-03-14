Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p00312 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String str1 = reader.readLine();
            String[] s = str1.split(" ");
            int i1 = Integer.parseInt(s[0]);
            int i2 = Integer.parseInt(s[1]);

            int count = i1 // i2;
            count += i1 % i2;
            System.out.println(count);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

Explanation:

- We import the necessary classes from the java package.
- We create a new instance of the BufferedReader class to read input from the user.
- We use a try-catch block to handle any exceptions that may occur while reading input from the user.
- We read a line of input from the user using the readLine() method of the BufferedReader class.
- We split the input string into two parts using the split() method of the String class.
- We convert the two parts of the input string into integers using the parseInt() method of the Integer class.
- We calculate the quotient and remainder of i1 divided by i2 using the // and % operators respectively.
- We add the quotient and remainder to get the final count.
- We print the final count to the console.
- We close the BufferedReader object to release any system resources it may be holding.<|endoftext|>
