# No import statement is necessary because Python has built-in functions for input.

def main():
    n = float(input())  # Reading input as float, equivalent to Java's nextDouble()

    odd = 0
    not_odd = 0
    for i in range(1, int(n) + 1):  # range in Python is not inclusive, so add 1 to n
        if i % 2 == 0:
            not_odd += 1
        else:
            odd += 1
    
    print(odd / n)

if __name__ == "__main__":
    main()