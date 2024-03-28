def main():
    # Read input
    S = input()
    
    # Build the new string using slicing
    result = '2018' + S[4:]
    
    # Print the result
    print(result)

# Test case
if __name__ == "__main__":
    main()