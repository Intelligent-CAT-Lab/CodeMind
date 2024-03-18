Here's the Java code translated to Python:

```python
class Task:
    def solve(self, S):
        while len(S) > 3:
            abc = False
            for i in range(len(S) - 2):
                if S[i:i+3] == "ABC":
                    S = S[:i] + "X" + S[i+3:]
                    abc = True
            if not abc:
                print("No")
                return

            check = [False] * 3
            for i in range(len(S)):
                if ord(S[i]) - ord('A') >= 3:
                    continue
                check[ord(S[i]) - ord('A')] = True
            cnt = sum(1 for t in check if t)
            if cnt != 2:
                print("No")
                return
            for i in range(3):
                if not check[i]:
                    c = chr(i + ord('A'))
                    S = S.replace("X", c)
                    break

        if S == "ABC":
            print("Yes")
        else:
            print("No")

# Sample test case
task = Task()
task.solve("ABC")
```

Note that in Python, we don't need the boilerplate code associated with input and output streams, so I omitted the `FastScanner` class and its usage. The `solve` function just takes a string `S` as a parameter now.

To run the code with your own test cases, just create a `Task` object and call its `solve` method with the string you want to test as an argument. The sample test case provided demonstrates this.
