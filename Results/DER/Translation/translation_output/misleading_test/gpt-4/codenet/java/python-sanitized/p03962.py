def main():
    # Read the input from the user splitting the input by space and casting to integers
    paint_cans = set(map(int, input().split()))
    
    # Print the size of the set
    print(len(paint_cans))

# Call the main function
if __name__ == "__main__":
    main()