import sys

def main():
    # Read input from stdin
    input_string = sys.stdin.readline().strip()

    # Calculate the length of the input string
    n = len(input_string)

    # Initialize a set to store the possible permutations of "abc"
    abc = set(["abc", "acb", "bac", "bca", "cab", "cba"])

    # Initialize a variable to store the number of differences between adjacent characters
    diff = 0

    # Iterate over the characters of the input string
    for i in range(n - 1):
        # If the current character is different from the next character, increment the number of differences
        if input_string[i] != input_string[i + 1]:
            diff += 1

    # If the input string is of length 2 or less, print the number of differences
    if n <= 2:
        if input_string[0] == input_string[1]:
            print(1)
        else:
            print(2)

    # If the input string is a permutation of "abc", print "3"
    elif input_string in abc:
        print("3")

    # If the number of differences is 0, print "1"
    elif diff == 0:
        print("1")

    # Otherwise, calculate the number of permutations of the input string
    else:
        # Initialize a variable to store the number of permutations
        ans = 1

        # Iterate over the characters of the input string
        for i in range(n - 1):
            # If the current character is the same as the next character, set the number of permutations to 0
            if input_string[i] == input_string[i + 1]:
                ans = 0

        # Calculate the number of permutations
        ans += pow(3, n - 1, 998244353) + 998244353
        ans += 1L * 3 * 998244353 - dp_no_dpl[n - 1][0][sum] - dp_no_dpl[n - 1][1][sum] - dp_no_dpl[n - 1][2][sum]
        ans %= 998244353

        # Print the number of permutations
        print(ans)

if __name__ == "__main__":
    main()