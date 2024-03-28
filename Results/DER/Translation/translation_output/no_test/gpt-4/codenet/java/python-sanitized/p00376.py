# No need to import any specific module for basic console input/output in Python

def main():
    # In Python, we typically use the input() function to receive console input
    a = int(input())
    b = int(input())
    
    # Python's built-in abs() function is used to find the absolute value
    ans = abs(a - b)
    
    # Using print() function to output the result to the console in Python
    print(ans)

if __name__ == "__main__":
    main()