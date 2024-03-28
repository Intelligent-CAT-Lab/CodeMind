import java.util

def main():
    n = int(input())
    arr = [True for _ in range(n + 3)]
    arr[0] = True
    arr[1] = True
    count = 0
    for i in range(2, arr.length):
        if not arr[i]:
            for j in range(2, int(i ** 2) + 1):
                arr[i * j] = True
            if not arr[i] and not arr[i - 2]:
                count += 1
    print(count * 2)


if __name__ == '__main__':
    main()