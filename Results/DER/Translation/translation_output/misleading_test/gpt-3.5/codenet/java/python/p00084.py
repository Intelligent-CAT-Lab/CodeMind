```python
def main():
    while True:
        try:
            line = input()
        except EOFError:
            break
            
        line = line.replace('.', ',').replace(',', ' ')
        tokens = line.split(" ")
        count = 0
        
        for token in tokens:
            n = len(token)
            
            if 3 <= n <= 6:
                if count > 0:
                    print(" ", end="")
                print(token[:n], end="")
                count += 1
                
        if count > 0:
            print()

if __name__ == "__main__":
    main()
```
