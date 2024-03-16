def is_rectangle(sides):
    sides.sort()
    if sides[0] == sides[1] and sides[2] == sides[3]:
        return "yes"
    else:
        return "no"

# Sample test case
input_line = input()

try:
    sides = [int(x) for x in input_line.split()]
    if len(sides) == 4:
        print(is_rectangle(sides))
    else:
        print("Invalid input: Exactly 4 numbers required.")

except ValueError:
    print("Invalid input: All inputs must be integers.")