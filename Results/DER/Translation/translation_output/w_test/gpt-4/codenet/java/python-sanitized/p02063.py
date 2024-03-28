import datetime

# Record the start time
startTime = datetime.datetime.now()

# Read two long integers from the input
A, B = map(int, input().split())

# Infinite loop that goes over all the numbers greater than B
i = B + 1
while True:
    # If i is a multiple of 256 and more than 3500 milliseconds have passed, break the loop
    if (i & 0xFF) == 0 and (datetime.datetime.now() - startTime).total_seconds() * 1000 > 3500:
        break
    # Calculate counts ca and cb based on the problem logic
    ca = i // A + i % A
    remb = i % B
    cb = i // B + remb // A + remb % A
    # If ca is less than cb, print i and exit the loop
    if ca < cb:
        print(i)
        break
    i += 1
else:
    print(-1)