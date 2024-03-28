class main:
    # Define the function that replicates the functionality of the solve method in the Java code.
    def solve(n, m):
        if n == 2 or m == 2:
            print(0)
        else:
            ans = max(1, n - 2) * max(1, m - 2)
            print(ans)
    
    # Sample test case
    solve(2, 2)  # Expected output: 0