import sys

def main():
    a, b = map(int, sys.stdin.readline().split())
    if a == 1:
        if b!= 1:
            print("Alice")
    if b == 1:
        if a!= 1:
            print("Bob")
    if a > b and a!= 1 and b!= 1:
        print("Alice")
    if a < b and a!= 1 and b!= 1:
        print("Bob")
    if a == b:
        print("Draw")

if __name__ == "__main__":
    main()