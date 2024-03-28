# No need to import a specific Scanner class in Python as we use the built-in input function
def main():
    # In Python, we use input to get user input. To get an integer, we need to convert it using int()
    a = int(input())
    b = int(input()) 
    if b >= a:
        print(a)
    else:
        print(a - 1)

# It's common to use this if statement to ensure the main function runs when the script is executed directly
if __name__ == "__main__":
    main()