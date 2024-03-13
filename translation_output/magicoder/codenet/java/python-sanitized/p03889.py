import sys

def main():
    s = sys.stdin.readline().strip()
    arr = list(s)
    for i in range(len(arr)):
        if arr[i] == 'b':
            arr[i] = 'd'
        elif arr[i] == 'd':
            arr[i] = 'b'
        elif arr[i] == 'p':
            arr[i] = 'q'
        elif arr[i] == 'q':
            arr[i] = 'p'
    arr.reverse()
    if s == ''.join(arr):
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()