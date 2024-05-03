Here is the Python equivalent of the Java code:

```python
def main():
    monster_hp, serval_atk = map(int, input().split())

    mod = monster_hp % serval_atk
    ans = monster_hp // serval_atk

    if mod > 0:
        ans += 1

    print(ans)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the user, calculates the number of servals that can defeat the monster, and then prints the result. The `//` operator is used for integer division in Python, which is equivalent to `/` in Java.
