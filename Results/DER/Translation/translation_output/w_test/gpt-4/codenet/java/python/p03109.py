Here's the equivalent Python code for the Java code provided:

```python
def what_era(date_str):
    time = date_str[5:]
    if time[0] == '1' or int(time[1]) > 4:
        return "TBD"
    else:
        return "Heisei"

# Sample Test Case
print(what_era("2019/04/30"))
```

When you run this Python function with the test input "2019/04/30", it should produce the expected output "Heisei".
