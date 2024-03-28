Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
MRL

Expected output:
JI

```
class p00435{public static void main(String[]z){String s="";for(char c:new java.util.Scanner(System.in).next().toCharArray())s+=(char)((c-42)%26+65);System.out.println(s);}}
```

### Response:
```python
class p00435:
    def main(self, z):
        s = ""
        for c in java.util.Scanner(System.in).next().toCharArray():
            s += chr((ord(c) - 42) % 26 + 65)
        print(s)
```

Explanation:

- We define a class `p00435` with a method `main` that takes in a list of strings `z`.
- We initialize an empty string `s` to store the result.
- We use a for loop to iterate over each character in the input string obtained from the scanner.
- We use the `ord` function to get the ASCII value of the character and subtract 42 from it to get the index of the character in the alphabet.
- We use the modulo operator `%` to get the remainder of the division by 26.
- We add 65 to the remainder to get the ASCII value of the corresponding character in the alphabet.
- We use the `chr` function to convert the ASCII value to its corresponding character and append it to the `s` string.
- Finally, we print the `s` string.<|endoftext|>
