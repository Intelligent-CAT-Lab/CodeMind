System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
eggchickenegg

Expected output:
egzg

```
import java.util.Arrays;
import java.util.Scanner;

public class p01479 {
    static final int MAX = 1000000;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String line = sc.next().replace("egg", "e").replace("chicken", "c");
        line = line.replace("ee", "e e").replace("ee", "e e")
               .replace("cc", "c c").replace("cc", "c c");
        String strs[] = line.split(" ");
        int max = 0;
        String ans = "";
        for (int i = 0; i < strs.length; i++) {
            if (max < strs[i].length()) {
                max = strs[i].length();
                ans = strs[i].charAt(max - 1) == 'e'? "egg" : "chicken";
            }
        }
        System.out.println(ans);
    }
}
```


Answer:
```python
def main():
    s = input().replace("egg", "e").replace("chicken", "c")
    s = s.replace("ee", "e e").replace("ee", "e e") \
       .replace("cc", "c c").replace("cc", "c c")
    words = s.split(" ")
    max_len = 0
    ans = ""
    for word in words:
        if max_len < len(word):
            max_len = len(word)
            ans = "egg" if word[-1] == "e" else "chicken"
    print(ans)

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_inputs = [
    "eggchickenegg",
    "chickenchickenchicken",
    "eggchickeneggchickenegg",
    "eggchickeneggchickeneggchickenegg"
]

expected_outputs = [
    "egzg",
    "chicken",
    "eggchickeneggchickenegg",
    "eggchickeneggchickeneggchickenegg"
]

for test_input, expected_output in zip(test_inputs, expected_outputs):
    assert main(test_input) == expected_output
```<|endoftext|>
