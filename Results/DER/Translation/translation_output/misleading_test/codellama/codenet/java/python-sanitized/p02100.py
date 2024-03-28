import re

def main():
    # Get the input from the user
    equation = input("Enter the equation: ")

    # Split the equation into its components
    components = equation.split(" ")

    # Initialize the variables
    num = 0
    plus = True
    si = False
    xs = False
    keis = [0] * 6

    # Iterate over the components of the equation
    for component in components:
        # If the component is a number, add it to the current number
        if component.isdigit():
            num = num * 10 + int(component)
        # If the component is a plus or minus sign, update the plus flag
        elif component in ["+", "-"]:
            plus = component == "+"
        # If the component is an exponent, update the si flag
        elif component == "^":
            si = True
        # If the component is an x, update the xs flag
        elif component == "x":
            xs = True
        # If the component is a variable, update the keis array
        else:
            if si:
                keis[int(component) - 1] = num
                si = False
            else:
                num = num * 10 + int(component)

    # If the last component was a plus or minus sign, update the keis array
    if plus:
        keis[0] = num
    else:
        keis[0] = -num

    # Initialize the answer array
    ans = [0] * 6

    # Iterate over the possible values of the variable
    for i in range(1, 6):
        # Calculate the result of the equation for the current value of the variable
        result = 0
        for j in range(0, 6):
            result += keis[j] * i ** j

        # If the result is zero, add the current value of the variable to the answer array
        if result == 0:
            ans[i - 1] = i

    # Sort the answer array
    ans.sort()

    # Build the output string
    output = ""
    for i in range(len(ans)):
        output += "("
        if ans[i] >= 0:
            output += "+"
        output += str(ans[i]) + ")"

    # Print the output
    print(output)

if __name__ == "__main__":
    main()