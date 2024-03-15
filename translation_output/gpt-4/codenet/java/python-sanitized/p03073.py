# main method in Python does not require an explicit declaration
if __name__ == "__main__":
    tail = input()  # Reading input in Python
    n = len(tail)  # Getting the length of the input string
    count = 0
    for i in range(n):
        # Python allows direct comparison of string and integer with the == operator
        if i % 2 == 0 and tail[i] == "0":
            count += 1
        if i % 2 == 1 and tail[i] == "1":
            count += 1
    n -= count
    # using the min function to print the smaller of the two, count and n
    print(min(count, n))