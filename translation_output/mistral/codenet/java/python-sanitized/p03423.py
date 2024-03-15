import sys

def main():
    l = input()
    st = l.split()
    answer = int(st[0]) // convert string to integer
    answer = round(answer/3) # round down to nearest integer
    print(answer)

if __name__ == "__main__":
    main()