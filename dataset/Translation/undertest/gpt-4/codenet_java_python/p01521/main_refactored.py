class main:
    def main():
        s = input()  # Read input from the user
        print('x' if s[0] == 'x' and s[-1] == 'x' else 'o')
    
    # Run the main function
    if __name__ == "__main__":
        main()