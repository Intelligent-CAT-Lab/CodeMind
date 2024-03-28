class main:
    # Python program based on the provided Java code
    
    def main():
        # Read inputs as integers
        x, y = map(int, input().split())
        
        # Check if x is divisible by y
        if x % y == 0:
            print(-1)
        else:
            print(x)
    
    # Call main function
    if __name__ == "__main__":
        main()