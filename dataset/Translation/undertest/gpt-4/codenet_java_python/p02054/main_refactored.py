class main:
    def main():
        # Reading the input as integers
        nums = map(int, input().split())
        # Calculating the number of odd numbers
        odd = sum(x % 2 for x in nums)
        # Printing the result based on the number of odd numbers
        print("Hom" if odd >= 2 else "Tem")
    
    if __name__ == "__main__":
        main()