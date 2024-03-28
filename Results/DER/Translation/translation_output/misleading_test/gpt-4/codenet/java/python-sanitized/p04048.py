def solver():
    n = int_input()
    x = int_input()
    sum = 0
    if x == n - x:
        sum = 3 * x
        print(sum)
        return
    else:
        sum += x + n - x
        sum += calc(x, n - x)
        print(sum)
        return

def calc(x, y, first=False):
    sum = 0
    if x % y == 0:
        if first:
            sum += y
        sum += (x // y * 2 - 1) * y
        return sum
    else:
        if first:
            sum += y
        sum += (x // y * 2) * y
        sum += calc(y, x % y)
        return sum

def int_input():
    # This function mimics the `nl()` function by reading an integer from input.
    while True:
        try:
            # Read input and parse it as an integer.
            return int(input())
        except ValueError:
            # If input is not an integer, continue the loop.
            continue

if __name__ == "__main__":
    solver()