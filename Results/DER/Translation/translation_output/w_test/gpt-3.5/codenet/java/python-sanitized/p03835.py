def main():
    k, s = map(int, input().split())
    
    # search
    count = 0
    for x in range(k+1):
        for y in range(k+1):
            z = s - x - y
            if 0 <= z <= k:
                count += 1
    
    # answer
    print(count)

if __name__ == "__main__":
    main()