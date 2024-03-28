Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000 900 850

Expected output:


```
import java.util.*;

public class p02149 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int idx = 0;
		for (int i = 0; i < 3; i++) {
		    int x = sc.nextInt();
		    if (max < x) {
		        max = x;
		        idx = i;
		    }
		}
		System.out.println((char)('A' + idx));
	}
}


```

### Response:

```python
import java.util.*;

public class p02149 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int idx = 0;
        for (int i = 0; i < 3; i++) {
            int x = sc.nextInt();
            if (max < x) {
                max = x;
                idx = i;
            }
        }
        System.out.println((char)('A' + idx));
    }
}
```

The given java code reads three integers from the user and finds the maximum value among them. It then prints the corresponding letter of the alphabet (A, B, or C) based on the index of the maximum value.

In Python, we can achieve the same functionality using the `max` function to find the maximum value and the `chr` function to convert the index to the corresponding letter of the alphabet. Here's the modified code:

```python
import java.util.*;

public class p02149 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }
        int max = max(arr);
        int idx = arr.indexOf(max);
        System.out.println(chr(idx + 65));
    }
}
```

In this code, we first declare an array `arr` of size 3 to store the input integers. We then use the `max` function to find the maximum value in the array and the `indexOf` method to find the index of the maximum value. Finally, we use the `chr` function to convert the index to the corresponding letter of the alphabet (A, B, or C) and print it to the console.<|endoftext|>
