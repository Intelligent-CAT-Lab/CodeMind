Here is the translated Java code into Python:

```python
# No need to import anything for basic input/output in Python

class p03011:
    @staticmethod
    def main():
        # The Scanner class is replaced with input() function in Python
        P = int(input())
        Q = int(input())
        R = int(input())
        
        # Python simplifies the if-else cascades with a straightforward max approach
        # Since we only need to add the two smallest numbers, we can sort the values
        # and add the first two
        max_value = sum(sorted([P, Q, R])[:2])

        print(max_value)

# To mimic Java's `public static void main` behavior, we call the main method manually
if __name__ == "__main__":
    p03011.main()
```

Please note that as Python is more concise for such tasks, I've used a more Pythonic way to calculate the maximum sum of two of the input integers by sorting the list and taking the sum of the first two elements which will automatically be the smallest two numbers. However, the main structure of the original Java code has been preserved.
