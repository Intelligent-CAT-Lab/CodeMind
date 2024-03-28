Here is the Python equivalent of the provided Java code:

```python
import sys

def check_word(word):
    flag = False
    for i in range(len(word) - 1):
        if word[i] == word[i + 1]:
            flag = True
            break
    if flag:
        print("Bad")
    else:
        print("Good")

if __name__ == "__main__":
    word = input().strip()
    check_word(word)
```

Now, let's see how it works with the test case:

Test input:
3776

Expected output:
yad

(Since "yad" isn't generated from the number 3776 using the provided code, it seems like there might be a mistake in the provided test output. The given code simply checks for consecutive characters in a string and outputs "Bad" if any are found or "Good" otherwise. There is no logic to convert numbers to words, so for the input "3776", assuming it is being treated as a string, the code would output "Good".)
