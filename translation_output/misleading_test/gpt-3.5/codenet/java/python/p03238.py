```python
def main():
    n = int(input())
    if n == 1:
        print("Hello World")
    else:
        a, b = map(int, input().split())
        print(a + b)

if __name__ == "__main__":
    main()
``` 

Test input:
1

Expected output:
Hello World
