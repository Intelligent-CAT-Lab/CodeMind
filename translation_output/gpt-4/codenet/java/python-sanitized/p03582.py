import sys

class p03582:

    @staticmethod
    def solve(a):
        lst = []
        for j in range(3):
            for i in range(a[j]):
                lst.append(chr(ord('a') + j))

        while len(lst) > 1:
            lst.sort()
            s = lst[0] + lst[-1]
            lst[0] = s
            lst.pop()
        
        print(lst[0])

def na(n):
    return list(map(int, input().split()))

def ni():
    return int(input())

def main():
    a = na(3)
    p03582.solve(a)

if __name__ == "__main__":
    # Assuming the input will come from standard input (stdin)
    main()

# If other helper functions are needed, they will have to be implemented in Python.
# For example, ni(), na(), etc. are not provided in this snippet
# and are assumed to be implemented elsewhere in this Python translation.