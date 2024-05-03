def main():
    a = int(input())
    b = int(input())
    count = 0
    for i in range(a, b+1):
        array = [int(x) for x in str(i)]
        if array[0] == array[-1] and array[1] == array[-2]:
            count += 1
    print(count)

if __name__ == "__main__":
    main()