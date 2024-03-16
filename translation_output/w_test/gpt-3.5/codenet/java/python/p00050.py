```python
def main():
    str = input()
    ans = str.replace("apple", "wwwp")
    ans = ans.replace("peach", "wwwa")
    ans = ans.replace("wwwp", "peach")
    ans = ans.replace("wwwa", "apple")
    print(ans)

if __name__ == "__main__":
    main()
```
