def main():
    # Read integer input from the user
    num = int(input())
    
    # Split the string on ':' and index using the modulo of the input with 7
    print("thu:fri:sat:sun:mon:tue:wed".split(":")[num % 7])

if __name__ == "__main__":
    main()