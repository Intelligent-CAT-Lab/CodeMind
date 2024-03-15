# No import needed as we are using built-in input function for Python

def main():
    h = int(input())
    w = int(input())
    a = int(input())
    b = int(input())
    
    # Using list comprehensions to create s1 and s2
    s1 = ''.join(['0' if j < a else '1' for j in range(w)])
    s2 = ''.join(['1' if j < a else '0' for j in range(w)])
    
    # Printing the patterns
    for i in range(h):
        if i < b:
            print(s1)
        else:
            print(s2)
            
if __name__ == "__main__":
    main()