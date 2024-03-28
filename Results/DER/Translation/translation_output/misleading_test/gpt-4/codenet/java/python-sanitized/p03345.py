def main():
    # Reading the input as a list of integers
    a, b, c, k = map(int, input().split())
    
    # Calculating the initial answer
    ans = a - b
    
    # Check if the answer is greater than 10^18
    if abs(ans) > 10**18:
        print("Unfair")
        return
    
    # If k is even, the answer remains the same
    # If k is odd, the answer is negated
    if k % 2 == 0:
        print(ans)
    else:
        print(ans * -1)

# Running the main function
if __name__ == "__main__":
    main()