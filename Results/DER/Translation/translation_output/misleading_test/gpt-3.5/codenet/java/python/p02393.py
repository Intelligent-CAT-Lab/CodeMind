```python
def main():
    str_num = input().split()
    str_num.sort()

    int_num_small = int(str_num[0])
    int_num_middle = int(str_num[1])
    int_num_large = int(str_num[2])

    print(int_num_small, int_num_middle, int_num_large)

if __name__ == "__main__":
    main()
```
