Here's the translated code from Java to Python:

```python
# No import needed for basic input in Python

# Defining a function isn't necessary in Python for this simple script,
# but we'll stay true to the structure of the original Java code.

def main():
    x = int(input())
    y = int(input())
    z = int(input())  # This variable 'z' is not used in the original Java code, so it's also unnecessary in Python
    
    print((x * y) // 2)  # We use integer division // because the original Java code implies integer arithmetic

# Unlike in Java, in Python we don't always need a class or method to execute code, but if we want to
# emulate the "main" method behavior, we check if this module is being run directly.

if __name__ == "__main__":
    main()
```

Note that in Python we can omit declarations of types, and we often directly use built-in functions like `input()` and `print()` instead of creating Scanner objects or using System.out.println(). Also, Python uses indentation to define the scope of blocks of code instead of braces {}. I included the `z` variable to make it faithful to the original code, but since it is not used, it could be removed for a cleaner Python script. Additionally, I've used `//` for integer division to mimic the integer arithmetic behavior of Java since by default Python's `/` operator performs floating-point division even with integer operands.
