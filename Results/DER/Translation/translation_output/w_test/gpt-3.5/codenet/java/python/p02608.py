```python
def main():
    n = int(input())
    eratosu = [0] * 100000
    for i in range(1, 101):
        for j in range(1, 101):
            for k in range(1, 101):
                if i * i + j * j + k * k >= 100000:
                    continue
                result = i * i + j * j + k * k + i * j + j * k + k * i
                eratosu[result] += 1

    output = ""
    for i in range(1, n + 1):
        output += str(eratosu[i]) + "\n"

    print(output)

if __name__ == "__main__":
    main()
```
Test Input:
```
20
```

Expected Output:
```
0
0
0
0
0
1
0
0
0
0
3
0
0
0
0
0
3
3
0
0
```
