```python
v = 0
ansList = None

def main():
    n = int(input())

    if n == 1:
        print("Yes")
        print(2)
        print("1 1")
        print("1 1")
        return
    if n == 2:
        print("No")
        return

    k = 0
    for i in range(3, n+1):
        ic2 = i * (i - 1) // 2
        if ic2 == n:
            k = i
            break
        elif ic2 > n:
            print("No")
            return

    print("Yes")

    global ansList
    ansList = [[] for _ in range(k)]
    target = [i for i in range(k)]
    combination(target, 2, [])

    print(k)
    for i in range(k):
        result = [str(j) for j in ansList[i]]
        print(f"{k-1} {' '.join(result)}")

def combination(target, k, lst):
    global v
    if len(lst) == k:
        v += 1
        for i in lst:
            ansList[i].append(v)
        return

    i = 0
    if lst:
        i = lst[-1] + 1
        if len(lst) + len(target) - i < k:
            return
    for j in range(i, len(target)):
        lst.append(j)
        combination(target, k, lst)
        lst.pop()

if __name__ == "__main__":
    main()
```
```python
# Test Input
3

# Expected Output
Yes
3
2 1 2
2 3 1
2 2 3
```
