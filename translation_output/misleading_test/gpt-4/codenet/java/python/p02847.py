Here's the Java code translated to Python:

```python
def main():
    days = ["MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"]
    in_day = input()  # Receives test input
    idx = days.index(in_day)
    ans = ((6 - idx + 7) % 7)
    if ans == 0:
        print(7)
    else:
        print(ans)

if __name__ == "__main__":
    main()
```

To run the provided test case:

```shell
# Run this python code and input "SAT" when prompted
```
