Here is the Python equivalent of the Java code:

```python
def main():
    monster_hp = int(input())
    serval_atk = int(input())

    mod = monster_hp % serval_atk
    ans = monster_hp // serval_atk

    if mod > 0:
        ans += 1

    print(ans)

if __name__ == "__main__":
    main()
```

In this Python code, we use the `input()` function to get the input from the user. We then convert the input to integers using the `int()` function. The `%` operator is used to find the remainder of the division of `monster_hp` by `serval_atk`, and the `//` operator is used to find the quotient of the division of `monster_hp` by `serval_atk`. If the remainder is greater than 0, we increment `ans` by 1. Finally, we print the value of `ans`.
