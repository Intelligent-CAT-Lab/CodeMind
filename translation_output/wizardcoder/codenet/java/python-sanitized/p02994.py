import java.util.ArrayList
import java.util.Collections
import java.util.List
import java.util.Scanner

def main():
    scanner = Scanner(System.in)
    n = scanner.nextInt()
    l = scanner.nextInt()

    diff = ArrayList()
    
    for i in range(1, n+1):
        value = l+i-1
        if value < 0:
            value = value * -1
        diff.add(value)
        
    removeK = diff.indexOf(Collections.min(diff)) + 1
    
    print(n*l + n*(n+1)//2 - n - (l+ removeK -1))

if __name__ == '__main__':
    main()


- We need to use `//` instead of `/` for integer division in Python.
- We need to use `ArrayList` instead of `List` in Python.
- We need to use `Scanner` instead of `Scanner` in Python.
- We need to use `System.out.println()` instead of `print()` in Python.