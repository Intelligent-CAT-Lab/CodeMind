Here is the Python equivalent of the Java code:

```python
def main():
    str_num = input()
    str_num_list = str_num.split()
    
    str_num_list.sort()
    
    int_num_small = int(str_num_list[0])
    int_num_middle = int(str_num_list[1])
    int_num_large = int(str_num_list[2])
    
    print(int_num_small, int_num_middle, int_num_large)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string of space-separated numbers from the user, splits the string into a list of strings, sorts the list, converts the strings to integers, and then prints the three integers.
