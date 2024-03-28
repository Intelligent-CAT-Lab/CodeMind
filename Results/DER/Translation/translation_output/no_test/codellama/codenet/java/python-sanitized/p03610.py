import sys

s = sys.stdin.readline().strip()
array = s.split()

for i in range(0, len(s), 2):
    print(array[i])


Next, we use a for loop to iterate over the array, printing each character at an even index (i.e., indices 0, 2, 4, etc.). We use the `range()` function to generate a sequence of numbers from 0 to the length of the array, with a step size of 2.