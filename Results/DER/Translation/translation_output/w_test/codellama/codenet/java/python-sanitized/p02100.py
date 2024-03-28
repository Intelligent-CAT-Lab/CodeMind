import re

def main():
    # Get the input from the user
    equation = input("Enter the equation: ")

    # Convert the equation to a list of characters
    equation_list = list(equation)

    # Initialize the variables
    num = 0
    plus = True
    si = False
    xs = False
    keis = [0] * 6

    # Iterate through the list of characters
    for c in equation_list:
        # If the character is a plus sign, update the plus variable and reset the num variable
        if c == '+':
            plus = True
            num = 0
        # If the character is a minus sign, update the plus variable and reset the num variable
        elif c == '-':
            plus = False
            num = 0
        # If the character is an exponent, update the si variable and reset the xs variable
        elif c == '^':
            si = True
            xs = False
        # If the character is an x, update the xs variable and increment the num variable
        elif c == 'x':
            xs = True
            num += 1
        # If the character is a digit, update the num variable
        else:
            num = num * 10 + int(c)

    # If the plus variable is True, update the first element of the keis list
    if plus:
        keis[0] = num
    # If the plus variable is False, update the first element of the keis list with a negative sign
    else:
        keis[0] = -num

    # Initialize the ji variable
    ji = 0

    # Iterate through the keis list and find the first non-zero element
    for i in range(5, -1, -1):
        if keis[i] != 0:
            ji = i
            break

    # Initialize the ans list
    ans = [0] * ji

    # Iterate through the ans list and find the factors of the first element of the keis list
    for i in range(1, abs(keis[0]) + 1):
        result = 0

        # Iterate through the keis list and calculate the result
        for j in range(0, 6):
            result += (long)math.pow(i, j) * keis[j]

        # If the result is zero, update the ans list
        if result == 0:
            ans[ji - 1] = -i
            ji -= 1

        # Reset the result variable
        result = 0

        # Iterate through the keis list and calculate the result
        for j in range(0, 6):
            result += (long)math.pow(-i, j) * keis[j]

        # If the result is zero, update the ans list
        if result == 0:
            ans[ji - 1] = i
            ji -= 1

    # Sort the ans list
    ans.sort()

    # Initialize the StringBuilder object
    sb = StringBuilder()

    # Iterate through the ans list and build the output string
    for i in range(len(ans)):
        sb.append("(x")
        if ans[i] >= 0:
            sb.append("+")
        sb.append(ans[i]).append(")")

    # Print the output string
    print(sb)

if __name__ == "__main__":
    main()