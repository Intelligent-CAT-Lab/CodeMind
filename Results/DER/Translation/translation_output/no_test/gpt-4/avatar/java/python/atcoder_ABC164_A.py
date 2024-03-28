```python
def atcoder_ABC164_A():
    # Reading a line of input from the user and splitting it into a list
    numlist = input().split(" ")
    
    # Parsing the strings into integers
    Sheep = int(numlist[0])
    Wolve = int(numlist[1])
    
    # Checking if the number of wolves is greater than or equal to the number of sheep
    if Wolve >= Sheep:
        print("unsafe")
    else:
        print("safe")

# Calling the function if running this script
if __name__ == "__main__":
    atcoder_ABC164_A()
```

In this Python version of the code, I replaced the Java Scanner with Python's `input()` function for reading user input. Then I used the `split` method directly on the result of `input()`, without needing to store it in a list first, because Python lists are more versatile and do not require initialization as in Java. Lastly, I removed the `throws Exception` because Python does not require you to explicitly declare thrown exceptions.
