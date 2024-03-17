Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 7 9 4

Expected output:
YES


```
import java.util.Arrays;
import java.util.Scanner;

public class p03149 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N[] = new int[4];
		for (int i = 0; i < 4; i++) {
			N[i] = sc.nextInt();
		}
		boolean ans  = false;
		Arrays.sort(N);
		if (N[0] == 1 && N[1] ==4 && N[2]==7 && N[3]==9) {
			ans = true;
		}
		if (ans) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}

```

### Response:
```python
import java.util.Arrays;
import java.util.Scanner;

public class p03149 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N[] = new int[4];
		for (int i = 0; i < 4; i++) {
			N[i] = sc.nextInt();
		}
		boolean ans  = false;
		Arrays.sort(N);
		if (N[0] == 1 && N[1] ==4 && N[2]==7 && N[3]==9) {
			ans = true;
		}
		if (ans) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
```

The given java code is a simple program that takes input from the user and checks if the input is a valid permutation of the numbers 1, 4, 7, and 9. The program uses the `Arrays.sort()` method to sort the input array in ascending order. If the sorted array is equal to the expected array, the program sets the `ans` variable to `true`. Finally, the program prints "YES" if `ans` is `true`, and "NO" otherwise.

The equivalent python code can be written as follows:

```python
import java.util.Arrays;
import java.util.Scanner;

def main():
    sc = Scanner(System.in)
    N = [0] * 4
    for i in range(4):
        N[i] = sc.nextInt()
    ans = False
    Arrays.sort(N)
    if N == [1, 4, 7, 9]:
        ans = True
    if ans:
        print("YES")
    else:
        print("NO")

if __name__ == '__main__':
    main()
```

In the above code, we have used a list `N` of size 4 to store the input values. We have used a for loop to read the input values from the user and store them in the list `N`. We have used the `Arrays.sort()` method to sort the list `N` in ascending order. We have then checked if the sorted list is equal to the expected list `[1, 4, 7, 9]`. If it is, we set the `ans` variable to `True`. Finally, we have printed "YES" if `ans` is `True`, and "NO" otherwise.<|endoftext|>
