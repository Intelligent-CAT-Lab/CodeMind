def main():
    a, b, c = map(int, input().split())

    sum_list = [a, b, c]
    sum_list.sort()

    print(sum_list[0] + sum_list[1])

if __name__ == "__main__":
    main()