Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
MRL

Expected output:
JOI


```
class p00435{public static void main(String[]z){String s="";for(char c:new java.util.Scanner(System.in).next().toCharArray())s+=(char)((c-42)%26+65);System.out.println(s);}}
```

### Response:
```python
class p00435:
    def main(self):
        s = ""
        for c in java.util.Scanner(System.in).next().toCharArray():
            s += chr((ord(c) - 42) % 26 + 65)
        print(s)
```

Explanation:

- We define a class `p00435` with a method `main` that takes no arguments.
- We initialize an empty string `s` to store the result.
- We use a `for` loop to iterate over each character in the input string obtained from the scanner.
- For each character, we subtract 42 from its ASCII code to get the corresponding index in the alphabet (A=65, B=66,..., Z=90).
- We take the remainder of this index divided by 26 (the number of letters in the alphabet) to get the corresponding letter in the alphabet (A=0, B=1,..., Z=25).
- We add 65 to this letter's ASCII code to get the corresponding ASCII code for the letter in the output string (A=65, B=66,..., Z=90).
- We convert this ASCII code to a character using the `chr` function and append it to the `s` string.
- Finally, we print the `s` string.<|endoftext|>
