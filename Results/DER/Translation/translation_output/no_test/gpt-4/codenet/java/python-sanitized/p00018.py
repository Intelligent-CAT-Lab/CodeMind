def strkn(ans):
    # Sort the list in reverse order (equivalent to reverseOrder in Java)
    ans.sort(reverse=True)
    # Join the elements in the list as strings with a space between them
    result = " ".join(str(num) for num in ans)
    return result

def main():
    # Initialize a list with 5 values of 1
    ans = [1, 1, 1, 1, 1]
    count = 0
    
    # Python doesn't have a direct equivalent to Scanner.hasNext(),
    # Instead, we can use a try-except block to handle the end of input
    try:
        while True:
            # Reads the next integer from input
            num = int(input())
            # Update the value in the list with the new number
            ans[count] = num
            count += 1
            # If we've read 5 numbers, output the result and exit the loop
            if count == 5:
                print(strkn(ans))
                break
    except EOFError:
        # End of input reached, handle this if necessary
        pass

# Call the main function if this script is executed
if __name__ == "__main__":
    main()