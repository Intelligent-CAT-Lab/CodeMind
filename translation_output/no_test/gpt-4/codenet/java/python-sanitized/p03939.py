# No need to import anything specific in Python for this code

def main():
    # In Python, you can use the built-in input() function to read input
    N = int(input())
    d1 = float(input())
    x = float(input())
    
    ans = 0.0
    
    while N > 0:
        ans += d1 + (N - 0.5) * x
        d1 = ((2 * N + 2) * d1 + 5 * x) / (2 * N)
        x = ((N + 2) / N) * x
        N -= 1
    
    # In Python, you can use print() to output the result
    print(ans)

# This condition checks if the script is being run directly (not being imported)
if __name__ == "__main__":
    main()