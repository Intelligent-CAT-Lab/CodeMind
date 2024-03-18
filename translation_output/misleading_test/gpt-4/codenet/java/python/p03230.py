Below is the translated version of the provided Java code into Python:

```python
def combination(target, k, lst):
    global v, ans_list
    if len(lst) == k:
        v += 1
        for i in lst:
            ans_list[i].append(v)
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

    global v, ans_list
    v = 0
    ans_list = [list() for _ in range(k)]
    target = list(range(k))
    combination(target, 2, [])

    print(k)
    for i in range(k):
        print(k-1, end=' ')
        print(' '.join(map(str, ans_list[i])))


if __name__ == '__main__':
    main()
```

This Python code preserves the logic and structure of the original Java code, using global variables to access shared data within the functions, as well as similarly translating the combination generation and output formatting sections. The Python code reads input from the console and prints the expected output formatted as in the Java code.
