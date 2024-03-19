import sys

input_string = sys.stdin.readline().strip()

if input_string == "A":
    print("T")
elif input_string == "T":
    print("A")
elif input_string == "C":
    print("G")
elif input_string == "G":
    print("C")
else:
    print("Invalid input")