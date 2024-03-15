Here is the Python equivalent of the Java code provided:

```python
def main():
    # Take user input
    line = input().replace("egg", "e").replace("chicken", "c")
    line = (line.replace("ee", "e e").replace("ee", "e e")
                 .replace("cc", "c c").replace("cc", "c c"))
    
    # Split the line into a list of strings
    strs = line.split(" ")
    
    # Find the longest string
    max_length = 0
    ans = ""
    for s in strs:
        if max_length < len(s):
            max_length = len(s)
            ans = "egg" if s[-1] == 'e' else "chicken"
    
    # Print the answer
    print(ans)

if __name__ == '__main__':
    main()
```
