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