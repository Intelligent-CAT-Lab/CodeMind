Here's the equivalent code in Python:

```python
def main():
    str_num_list = input().split(" ")
    int_num_list = [int(num) for num in str_num_list]
    int_num_list.sort()

    int_num_small, int_num_middle, int_num_large = int_num_list

    print(f"{int_num_small} {int_num_middle} {int_num_large}")

if __name__ == "__main__":
    main()
```

Note that Python's `sort()` method sorts the list in-place, unlike Java's `Arrays.sort()` which returns a new sorted array. Also, Python automatically reads input as strings, so there's no need to use a `BufferedReader` like in Java. Additionally, Python's multiple assignment makes it easy to unpack the sorted numbers.
