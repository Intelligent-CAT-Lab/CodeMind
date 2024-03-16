Below is the translated Python equivalent of the provided Java code:

```python
def main():
    l = int(input())
    k = l
    t = 1
    count = 1
    ans = []
    while l > 1:
        if (l & 1) == 1:
            k -= t
            ans.append("{} {} {}".format(count, 20, k))
        ans.append("{} {} {}".format(count, count + 1, t))
        count += 1
        l >>= 1
        t *= 2
    print(20, len(ans) + 19)
    for i in range(19):
        print(i + 1, i + 2, 0)
    for s in ans:
        print(s)

if __name__ == "__main__":
    main()
```
