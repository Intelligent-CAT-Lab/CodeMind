Here's the Java code translated into Python, as requested:

```python
def atcoder_ABC042_A():
    num_1 = int(input())
    num_2 = int(input())
    num_3 = int(input())

    # We can simplify the logic by using a set to handle the uniqueness and count of the numbers
    numbers_set = {num_1, num_2, num_3}
    if numbers_set == {5, 7} and [num_1, num_2, num_3].count(5) == 2:
        print("YES")
    else:
        print("NO")

# Call the function if this script is executed directly
if __name__ == "__main__":
    atcoder_ABC042_A()
```

This Python function does the same thing the Java code does: it takes three integers as input and checks whether two of them are 5's and one is 7, printing "YES" if this is the case or "NO" otherwise. I've also optimized the logic slightly by using a set to check if the necessary numbers are present.
