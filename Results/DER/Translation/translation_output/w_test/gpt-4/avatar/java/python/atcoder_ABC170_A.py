Here's the Java code translated to Python:

```python
def main():
    inputs = input().split()
    answer = 0
    
    for i in range(5):
        x = int(inputs[i])
        
        if x == 0:
            answer = i
            break
    
    print(answer + 1)

if __name__ == "__main__":
    main()
```

Now if you test this with the provided test input:
```
1 2 3 4 0
```

It will produce the expected output:
```
5
```
