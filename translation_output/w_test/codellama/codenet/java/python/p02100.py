<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
x^2+3x+2

Expected output:
(x+1)(x+2)


```
import java.util.*;

public class p02100 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		int num = 0;
		boolean plus = true;
		boolean si = false;
		boolean xs = false;
		long[] keis = new long[6];
		for (char c : arr) {
		    if (c == '+') {
		        if (xs) {
		            if (plus) {
		                keis[1] = num;
		            } else {
		                keis[1] = -num;
		            }
		        }
		        num = 0;
		        plus = true;
		    } else if (c == '-') {
		        if (xs) {
		            if (plus) {
		                keis[1] = num;
		            } else {
		                keis[1] = -num;
		            }
		        }
		        num = 0;
		        plus = false;
		    } else if (c == '^') {
		        si = true;
		        xs = false;
		    } else if (c == 'x') {
		        if (num == 0) {
		            num = 1;
		        }
		        xs = true;
		    } else {
		        if (si) {
		            int v = c - '0';
		            if (plus) {
		                keis[v] = num;
		            } else {
		                keis[v] = -num;
		            }
		            si = false;
		        } else {
		            num = num * 10 + c - '0';
		        }
		    }
		}
		if (plus) {
		    keis[0] = num;
		} else {
		    keis[0] = -num;
		}
		int ji = 0;
		for (int i = 5; i >= 0; i--) {
		    if (keis[i] != 0) {
		        ji = i;
		        break;
		    }
		}
		int[] ans = new int[ji];
		for (int i = 1; i <= Math.abs(keis[0]) && ji > 0; i++) {
		    long result = 0;
		    for (int j = 0; j <= 5; j++) {
		        result += (long)Math.pow(i, j) * keis[j];
		    }
		    if (result == 0) {
		        ji--;
		        ans[ji] = -i;
		    }
		    result = 0;
		    for (int j = 0; j <= 5; j++) {
		        result += (long)Math.pow(-i, j) * keis[j];
		    }
		    if (result == 0) {
		        ji--;
		        ans[ji] = i;
		    }
		}
		Arrays.sort(ans);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < ans.length; i++) {
		    sb.append("(x");
		    if (ans[i] >= 0) {
		        sb.append("+");
		    }
		    sb.append(ans[i]).append(")");
		}
		System.out.println(sb);
	}
}


```
[/INST]

Here is the Python code that translates the Java code:
```python
import re

def main():
    # Get the input from the user
    equation = input("Enter the equation: ")

    # Convert the equation to a list of characters
    equation_list = list(equation)

    # Initialize the variables
    num = 0
    plus = True
    si = False
    xs = False
    keis = [0] * 6

    # Iterate through the list of characters
    for c in equation_list:
        # If the character is a plus sign, update the plus variable and reset the num variable
        if c == '+':
            plus = True
            num = 0
        # If the character is a minus sign, update the plus variable and reset the num variable
        elif c == '-':
            plus = False
            num = 0
        # If the character is an exponent, update the si variable and reset the xs variable
        elif c == '^':
            si = True
            xs = False
        # If the character is an x, update the xs variable and increment the num variable
        elif c == 'x':
            xs = True
            num += 1
        # If the character is a digit, update the num variable
        else:
            num = num * 10 + int(c)

    # If the plus variable is True, update the first element of the keis list
    if plus:
        keis[0] = num
    # If the plus variable is False, update the first element of the keis list with a negative sign
    else:
        keis[0] = -num

    # Initialize the ji variable
    ji = 0

    # Iterate through the keis list and find the first non-zero element
    for i in range(5, -1, -1):
        if keis[i] != 0:
            ji = i
            break

    # Initialize the ans list
    ans = [0] * ji

    # Iterate through the ans list and find the factors of the first element of the keis list
    for i in range(1, abs(keis[0]) + 1):
        result = 0

        # Iterate through the keis list and calculate the result
        for j in range(0, 6):
            result += (long)math.pow(i, j) * keis[j]

        # If the result is zero, update the ans list
        if result == 0:
            ans[ji - 1] = -i
            ji -= 1

        # Reset the result variable
        result = 0

        # Iterate through the keis list and calculate the result
        for j in range(0, 6):
            result += (long)math.pow(-i, j) * keis[j]

        # If the result is zero, update the ans list
        if result == 0:
            ans[ji - 1] = i
            ji -= 1

    # Sort the ans list
    ans.sort()

    # Initialize the StringBuilder object
    sb = StringBuilder()

    # Iterate through the ans list and build the output string
    for i in range(len(ans)):
        sb.append("(x")
        if ans[i] >= 0:
            sb.append("+")
        sb.append(ans[i]).append(")")

    # Print the output string
    print(sb)

if __name__ == "__main__":
    main()
```
This code uses the `re` module to convert the input equation to a list of characters, and then uses a series of `if` statements to update the variables and calculate the factors of the equation. The code then uses the `math.pow` function to calculate the result of each factor, and updates the `ans` list with the factors that have a result of zero. Finally, the code sorts the `ans` list and builds the output string using the `StringBuilder` class.</s>
