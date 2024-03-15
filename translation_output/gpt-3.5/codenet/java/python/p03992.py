```python
import sys

def main():
    X = input().strip()
    sb = []
    for i in range(len(X)):
        if i == 4:
            sb.append(" ")
        sb.append(X[i])
    
    print("".join(sb))

if __name__ == "__main__":
    main()
```
