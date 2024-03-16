Here is the translated Python code:

```python
import sys

def main():
    # 入力 (read the input)
    work = input().split()

    W = int(work[0])
    H = int(work[1])
    x = int(work[2])
    y = int(work[3])
    r = int(work[4])
    
    # 判断処理 (judgment process)
    if (x - r) >= 0 and (x + r) <= W:
        if (y - r) >= 0 and (y + r) <= H:
            judge = "Yes"
        else:
            judge = "No"
    else:
        judge = "No"
    
    # 出力 (output)
    print(judge)

if __name__ == "__main__":
    main()
```

I've translated the comments to their approximate meaning in English within the parentheses since the original Japanese characters in the comments might not display correctly in some environments. The Python version uses the built-in `input()` function to read from standard input, and splits the input using `split()`. The rest of the logic follows closely to the Java version. Note that exception handling around I/O is usually not necessary when using `input()` in Python scripts, as it will result in the script being terminated if an IOError occurs, thus I've omitted it.
