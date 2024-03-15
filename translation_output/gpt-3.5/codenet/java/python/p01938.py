```python
import sys

def main():
    list_input = sys.stdin.readline().strip()
    a = 'A'
    sum_count = 0

    for char in list_input:
        if char <= a:
            sum_count += 1
        a = char

    print(sum_count)

if __name__ == "__main__":
    main()
```  
