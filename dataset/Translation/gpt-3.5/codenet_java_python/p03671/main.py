def main():
    a, b, c = map(int, input().split())
    sum_array = [a, b, c]
    sum_array.sort()
    print(sum_array[0] + sum_array[1])

if __name__ == "__main__":
    main()