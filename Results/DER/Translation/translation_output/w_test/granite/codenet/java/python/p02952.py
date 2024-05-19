System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
11

Expected output:
9


```
import java.util.*;

public class p02952
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c=0;
		a=sc.nextInt();
		for(int i=1;i<=a;i++)
		{
			if(String.valueOf(i).length()%2!= 0)
			{c++;}
		}
		System.out.println(c);
	}
}
```


Answer:
```python
def main():
    a = int(input())
    c = 0
    for i in range(1, a + 1):
        if len(str(i)) % 2!= 0:
            c += 1
    print(c)

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_inputs = [
    "11",
]

test_outputs = [
    "9",
]

for test_input, expected_output in zip(test_inputs, test_outputs):
    with patch('builtins.input', return_value=test_input):
        main()
        captured = capsys.readouterr()
        assert captured.out == expected_output + "\n"
```<|endoftext|>
