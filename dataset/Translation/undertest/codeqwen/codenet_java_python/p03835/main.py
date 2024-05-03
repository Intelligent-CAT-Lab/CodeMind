def main():
    # input
    k = int(input())
    s = int(input())

    # search
    count = 0
    for x in range(k+1):
        for y in range(k+1):
            z = s - x - y
            if z >= 0 and z <= k:
                count += 1

    # answer
    print(count)

if __name__ == "__main__":
    main()