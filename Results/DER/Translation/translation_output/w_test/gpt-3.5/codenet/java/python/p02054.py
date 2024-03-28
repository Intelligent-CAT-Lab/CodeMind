```python
def main():
    inputs = input().split()
    odd = sum(int(i) % 2 for i in inputs)
    print("Hom" if odd >= 2 else "Tem")

if __name__ == "__main__":
    main()
```
