class main:
    def main():
        n, m = map(int, input().split())  # Read input
        base = n * 100 + m * 1800
        print(base << m)  # Print output with left bitwise shift
    
    if __name__ == "__main__":
        main()
    
    # Sample test input: "1 1"
    # Expected output for the sample test case: 3800