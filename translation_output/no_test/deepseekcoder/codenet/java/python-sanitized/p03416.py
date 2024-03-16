import sys

def main():
    a, b = map(int, sys.stdin.readline().split())
    count = 0
    for i in range(a, b+1):
        array = [int(d) for d in str(i)]
        if len(array) < 5:
            array = [0]*(5-len(array)) + array
        if array[0] == array[4] and array[1] == array[3]:
            count += 1
    print(count)

if __name__ == "__main__":
    main()