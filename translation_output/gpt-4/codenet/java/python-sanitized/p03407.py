import sys

# Equivalent function to solve the problem
def solve():
    a, b, c = map(int, input().split())
    print("Yes" if a + b >= c else "No")

# Function to simulate calling the solve function, similar to the main function in Java
def main():
    solve()

# Equivalent to 'public static void main' in Java
if __name__ == "__main__":
    main()