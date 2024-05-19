System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
12

Expected output:
[Yes

```
import java.util.Scanner;

public class p03316 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list=new ArrayList<Integer>();
		//Integer[] array = new Integer[m];
		int n = sc.nextInt();
		int a =sumDigits(n);
		if(n%a==0)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

	private static int sumDigits(int n) {
		int sum = 0;
		//èªç¶æ°ã®åæ¡ã®åãè¨ç®
		while (n!= 0) {
			//sumDigitsã¯åç¬ã§ã¯loopããªãã®ã§ãwhile loopãä½¿ãã
			sum += n % 10;
			//åå³ç«¯ã®æ¡ãå¾ãããã«%10ãå©ç¨ããã
			n /= 10;
			//åå³ç«¯ã®æ¡ãåãé¤ãããã«n/=10ãå©ç¨ããã
		}
		return sum;//åè¨ãè¿ã
	}
}
```


Answer:
```python
def sum_digits(n):
    sum = 0
    while n!= 0:
        sum += n % 10
        n //= 10
    return sum

def main():
    n = int(input())
    if n % sum_digits(n) == 0:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_cases = [
    (12, "Yes"),
    (25, "Yes"),
    (36, "Yes"),
    (49, "Yes"),
    (64, "Yes"),
    (81, "Yes"),
    (100, "Yes"),
    (121, "Yes"),
    (144, "Yes"),
    (169, "Yes"),
    (196, "Yes"),
    (225, "Yes"),
    (256, "Yes"),
    (289, "Yes"),
    (324, "Yes"),
    (361, "Yes"),
    (400, "Yes"),
    (441, "Yes"),
    (484, "Yes"),
    (529, "Yes"),
    (576, "Yes"),
    (625, "Yes"),
    (676, "Yes"),
    (729, "Yes"),
    (784, "Yes"),
    (841, "Yes"),
    (900, "Yes"),
    (961, "Yes"),
    (1024, "Yes"),
    (1089, "Yes"),
    (1156, "Yes"),
    (1225, "Yes"),
    (1296, "Yes"),
    (1369, "Yes"),
    (1444, "Yes"),
    (1521, "Yes"),
    (1600, "Yes"),
    (1681, "Yes"),
    (1764, "Yes"),
    (1849, "Yes"),
    (1936, "Yes"),
    (2025, "Yes"),
    (2116, "Yes"),
    (2209, "Yes"),
    (2304, "Yes"),
    (2401, "Yes"),
    (2500, "Yes"),
    (2601, "Yes"),
    (2704, "Yes"),
    (2809, "Yes"),
    (2916, "Yes"),
    (3025, "Yes"),
    (3136, "Yes"),
    (3249, "Yes"),
    (3364, "Yes"),
    (3481, "Yes"),
    (3600, "Yes"),
    (3721, "Yes"),
    (3844, "Yes"),
    (3969, "Yes"),
    (4096, "Yes"),
    (4225, "Yes"),
    (4356, "Yes"),
    (4489, "Yes"),
    (4624, "Yes"),
    (4761, "Yes"),
    (4900, "Yes"),
    (5041, "Yes"),
    (5184, "Yes"),
    (5329, "Yes"),
    (5476, "Yes"),
    (5625, "Yes"),
    (5776, "Yes"),
    (5929, "Yes"),
    (6084, "Yes"),
    (6241, "Yes"),
    (6400, "Yes"),
    (6561, "Yes"),
    (6724, "Yes"),
    (6889, "Yes"),
    (7056, "Yes"),
    (7225, "Yes"),
    (7396, "Yes"),
    (7569, "Yes"),
    (7744, "Yes"),
    (7921, "Yes"),
    (8100, "Yes"),
    (8281, "Yes"),
    (8464, "Yes"),
    (8649, "Yes"),
    (8836, "Yes"),
    (9025, "Yes"),
    (9216, "Yes"),
    (9409, "Yes"),
    (9604, "Yes"),
    (9801, "Yes"),
    (10000, "Yes"),
]

for n, expected_output in test_cases:
    assert sum_digits(n) == int(expected_output)
```<|endoftext|>
