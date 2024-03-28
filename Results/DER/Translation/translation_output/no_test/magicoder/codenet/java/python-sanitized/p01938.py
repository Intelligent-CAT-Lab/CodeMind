import sys

def main():
    line = sys.stdin.readline().strip()
    list = [char for char in line]
    a = 'A'
    sum = 0
    for i in range(len(list)):
        if ord(list[i]) <= ord(a):
            sum += 1
        a = list[i]
    print(sum)

if __name__ == "__main__":
    main()