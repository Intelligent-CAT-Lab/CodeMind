Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
this is a pen.

Expected output:
THIS IS A PEN.


```
import java.io.*;

public class p00020 {
	public static void main(String[] args) throws Exception{
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
		String s,t;
		char c;
		while((s=bf.readLine())!=null){
			t="";for(int i=0,j=s.length();i<j;i++){c=s.charAt(i);t+=(char)((c>=97&&c<=123)?(c-32):(c));}
			System.out.println(t);
		}
	}
}
```

### Response:
```python
import java.io.*;

public class p00020 {
    public static void main(String[] args) throws Exception{
        BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
        String s,t;
        char c;
        while((s=bf.readLine())!=null){
            t="";
            for(int i=0,j=s.length();i<j;i++){
                c=s.charAt(i);
                if(c>=97 and c<=123):
                    t+=(char)(c-32);
                else:
                    t+=c;
            }
            System.out.println(t);
        }
    }
}
```

Explanation:

- We import the necessary classes from the java.io package.
- We create a BufferedReader object to read input from the user.
- We declare two string variables s and t to store the input and the output respectively.
- We declare a char variable c to store the character at each index of the input string.
- We use a while loop to read input from the user until the end of the file is reached.
- Inside the loop, we use a for loop to iterate over each character of the input string.
- We check if the character is a lowercase letter using the if statement.
- If the character is a lowercase letter, we convert it to uppercase by subtracting 32 from its ASCII value.
- If the character is not a lowercase letter, we leave it as it is.
- We append the modified character to the output string t.
- Finally, we print the output string t.<|endoftext|>
