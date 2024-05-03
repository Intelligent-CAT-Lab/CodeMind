Here is the Python equivalent of the Java code:

```python
import sys

class p01636:

    def run(self):
        a = input()
        ans = 0
        for i in range(len(a)):
            head = a[:i]
            tail = a[i:]
            h, t = 0, 0
            if head:
                h = int(head)
            if tail:
                t = int(tail)
            if t < 0:
                continue
            if h > t:
                continue
            if (h + t) % 2 != 0:
                continue
            if (t - h) % 2 != 0:
                continue
            ans += 1
        print(ans)

if __name__ == "__main__":
    p01636().run()
```

This Python code does the same thing as the Java code. It reads a string from the user, then iterates over each character in the string. For each character, it splits the string into two parts: the head and the tail. It then converts the head and tail to integers, and checks if they satisfy the conditions specified in the Java code. If they do, it increments the answer. Finally, it prints the answer.
