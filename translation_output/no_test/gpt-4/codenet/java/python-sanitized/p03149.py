def main():
    # Create a list to store the integers
    N = [0] * 4
    # Get input from the user and store it in the list
    for i in range(4):
        N[i] = int(input())
    # Sort the list
    N.sort()
    # Check if the list contains the specific sequence of numbers
    ans = N == [1, 4, 7, 9]
    # Output the result based on the condition
    if ans:
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()