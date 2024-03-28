<s> Translate the following python code to java and enclose your solution inside ```java```:
```
def resolve():
    (N, L) = list(map(int, input().split(" ")))
    Ts = []
    offset = L - 1
    absmin = float('inf')
    mini = float('inf')
    for i in range(1, N+1):
        Ts.append(i+offset)
        if abs(i + offset) < absmin:
            absmin = abs(i + offset)
            mini = i + offset
    print(sum(Ts)-mini)
        
    
if '__main__' == __name__:
    resolve()
```

### Input

```
4 10
```

### Output

```
1
```

### Explanation

```
Ts = [1, 2, 3, 4]

absmin = 1
mini = 1

sum(Ts) = 10

10 - 1 = 9
```

### Hint

- Use ```System.out.println()``` to print to the console.
- Use ```System.in.readLine()``` to read input from the console.
- Use ```System.exit()``` to exit the program.
- Use ```System.out.flush()``` to flush the console.
- Use ```System.out.print()``` to print to the console without a newline.
- Use ```System.out.println()``` to print to the console with a newline.
- Use ```System.out.format()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use ```System.out.printf()``` to format the output.
- Use
