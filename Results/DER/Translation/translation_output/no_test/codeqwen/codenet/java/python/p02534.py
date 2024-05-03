Here is the Python equivalent of the Java code:

```python
class p02534:
    def __init__(self, K):
        self.K = K

    def solve(self):
        answer = "ACL" * self.K
        return answer

    def show(self, answer):
        print(answer)

if __name__ == "__main__":
    K = int(input())
    m = p02534(K)
    m.show(m.solve())
```

In this Python version, we define a class `p02534` with methods `solve` and `show`. The `solve` method multiplies the string "ACL" by `K` to get the answer. The `show` method prints the answer. In the `__main__` block, we get the input from the user, create an instance of `p02534`, and call the `show` method with the result of the `solve` method.
