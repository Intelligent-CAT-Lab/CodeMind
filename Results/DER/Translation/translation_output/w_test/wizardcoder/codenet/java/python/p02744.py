Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1

Expected output:
a


```


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p02744 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        scan.close();

        List<String> list = func(n);

        for (String s : list) {
            System.out.println(s);
        }

    }

    private static List<String> func(int n) {
        List<String> list = new ArrayList<String>();
        if (n == 1) {
            list.add("a");
        } else {
            List<String> prevList = func(n - 1);
            for (String s : prevList) {
                // å«ã¾ãã¦ããæå¤§ã®æå­ãæ¢ç´¢
                char max = 'a';
                for (int i = 0; i < s.length(); i++) {
                    if (max < s.charAt(i)) {
                        max = s.charAt(i);
                    }
                }

                for (char c = 'a'; c <= max + 1; c++) {
                    String newString = s + c;
                    list.add(newString);
                }
            }
        }
        return list;
    }
}

```

### Response:
```python
import java.util.ArrayList
import java.util.List
import java.util.Scanner

def func(n):
    if n == 1:
        return ['a']
    else:
        prevList = func(n - 1)
        result = []
        for s in prevList:
            max = 'a'
            for c in s:
                if max < c:
                    max = c
            for c in range(ord('a'), ord(max) + 1):
                newString = s + chr(c)
                result.append(newString)
        return result

if __name__ == '__main__':
    scan = Scanner(System.in)
    n = int(scan.next())
    scan.close()

    list = func(n)

    for s in list:
        print(s)
```

Explanation:

- We first import the necessary classes from the java library.
- We define a function `func` that takes an integer `n` as input and returns a list of strings.
- If `n` is 1, we return a list containing the string 'a'.
- Otherwise, we recursively call `func` with `n-1` as input and store the result in `prevList`.
- We then iterate over each string in `prevList` and find the maximum character using a loop.
- We then iterate over all characters from 'a' to the maximum character and append the new string to the `result` list.
- Finally, we return the `result` list.
- In the `if __name__ == '__main__':` block, we read the input integer `n` from the user and call the `func` function to get the list of strings.
- We then iterate over each string in the list and print it to the console.<|endoftext|>
