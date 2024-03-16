```python
def main():
    x = int(input())
    output = []
    
    if 3 <= x <= 10000:
        for a in range(1, x+1):
            b = a
            divisible_by_3 = False
            if a % 3 == 0:
                output.append(str(a))
                continue
            
            while b != 0:
                if b % 10 == 3:
                    output.append(str(a))
                    break
                b //= 10
        
    print(" ".join(output))

if __name__ == "__main__":
    main()
```
