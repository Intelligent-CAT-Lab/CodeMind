# Since Python does not have built-in file reading classes like Java, I am assuming that we are reading from standard input

def main():
    n = int(input())
    
    o = 0
    e = 0
    
    for i in range(1, n+1):
        if i % 2 == 1:
            o += 1
        else:
            e += 1
    
    print(o * e)

# Since the FScanner class and the disp methods are not used in the main logic, 
# they do not need to be translated for this example.

# Test Case
if __name__ == "__main__":
    main()