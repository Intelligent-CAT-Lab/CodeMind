Below is the translated version of your Java code into Python:

```python
def swap_fruits(s):
    ans = s.replace("apple", "wwwp")
    ans = ans.replace("peach", "wwwa")
    ans = ans.replace("wwwp", "peach")
    ans = ans.replace("wwwa", "apple")
    return ans

if __name__ == "__main__":
    input_str = input()
    output_str = swap_fruits(input_str)
    print(output_str)
```

To mimic the input provided in the Java code, you would run the Python script and enter the sentence: "the cost of one peach is higher than that of one apple." Then, the script would output "the cost of one apple is higher than that of one peach."
