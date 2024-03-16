# no need to import a scanner, Python has built-in input function

def p02811():
    K = int(input())
    X = int(input())

    if X <= 500 * K:
        print("Yes")
    else:
        print("No")

# It is not common in Python to encapsulate code with a class just for script behavior,
# so we'll just call the method directly or wrap the call under a conditional
# that asks whether this module is the main program

if __name__ == "__main__":
    p02811()