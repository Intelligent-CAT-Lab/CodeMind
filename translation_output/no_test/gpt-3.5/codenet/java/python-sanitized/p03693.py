def main():
    r = int(input()) * 100
    g = int(input()) * 10
    b = int(input())

    sum_rgb = r + g + b

    if sum_rgb % 4 == 0:
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()