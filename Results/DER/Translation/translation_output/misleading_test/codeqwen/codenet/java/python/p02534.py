Here is the Python equivalent of the Java code:

```python
class p02534:
    def __init__(self, K):
        self.K = K

    def solve(self):
        answer = ""
        for i in range(self.K):
            answer += "ACL"
        return answer

    def show(self, answer):
        print(answer)

if __name__ == "__main__":
    K = int(input())
    m = p02534(K)
    m.show(m.solve())
```

This Python code does the same thing as the Java code. It reads an integer from the user, creates an instance of the `p02534` class with this integer, calls the `solve` method to generate the answer, and then calls the `show` method to print the answer.
