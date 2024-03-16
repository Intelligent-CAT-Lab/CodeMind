import sys

s = sys.stdin.readline().strip()

if int(s) < 1200:
    print("ABC")
else:
    print("ARC")


Next, we convert the input string to an integer using the `int()` function. We then compare the integer to 1200 using the `<` operator. If the integer is less than 1200, we print "ABC" to the console. Otherwise, we print "ARC".