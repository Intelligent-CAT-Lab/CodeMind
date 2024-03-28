class main:
    # Reading input from user
    s = input().strip()
    
    # Printing the characters in even positions
    for i in range(0, len(s), 2):
        print(s[i], end="")
    
    # This print() is added to ensure that output ends with a newline, similar to Java's System.out.println().
    print()