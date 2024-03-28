```python
class p02534:
    def __init__(self, sc):
        self.sc = sc
        self.K = int(sc.next())

    def solve(self):
        answer = ""
        for i in range(self.K):
            answer += "ACL"
        
        return answer

    def show(self, answer):
        print(answer)


if __name__ == "__main__":
    sc = [int(x) for x in input().split()]
    m = p02534(sc)
    m.show(m.solve())
```
