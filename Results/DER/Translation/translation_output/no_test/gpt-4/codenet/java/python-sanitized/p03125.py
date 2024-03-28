# No need for imports in Python for this basic functionality

def main():
    # In Python, you can use input() to read input from the standard input (console)
    a = int(input())
    b = int(input())

    # Python's ternary conditional operator is "x if condition else y"
    print(a + b if b % a == 0 else b - a)

# This 'if' block ensures the main function is called only when the script is executed directly
# When imported as a module, the code inside this block won't be executed
if __name__ == '__main__':
    main()