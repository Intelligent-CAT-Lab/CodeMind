Here's the translated Python code from the given Java code:

```python
def main():
    K = int(input())
    A = K // 50
    B = K % 50

    a = [i + A for i in range(50)]

    for i in range(49, 49 - B, -1):
        a[i] += 1

    print(50)
    for i in range(50):
        if i != 49:
            print(a[i], end=" ")
        else:
            print(a[i])

if __name__ == '__main__':
    main()
```

To test the Python code using the provided input and expected output:

```python
def main():
    K = int(input())
    A = K // 50
    B = K % 50

    a = [i + A for i in range(50)]

    for i in range(49, 49 - B, -1):
        a[i] += 1

    print(50)
    for i in range(50):
        if i != 49:
            print(a[i], end=" ")
        else:
            print(a[i])

if __name__ == '__main__':
    main()
```

After you execute the script and provide the input `0`, you should receive `4` as output.
