class main:
    import sys
    
    def calculate_answer():
        # Read input from the console
        input_numbers = input().split()
        N = int(input_numbers[0])
        d1 = float(input_numbers[1])
        x = float(input_numbers[2])
        
        ans = 0
        
        # Loop to calculate the answer
        while N > 0:
            ans += d1 + (N - 0.5) * x
            d1 = ((2 * N + 2) * d1 + 5 * x) / (2 * N)
            x = ((N + 2) / N) * x
            N -= 1
        
        # Print the answer
        print(ans)
    
    # Call the function if the script is being run directly
    if __name__ == "__main__":
        calculate_answer()