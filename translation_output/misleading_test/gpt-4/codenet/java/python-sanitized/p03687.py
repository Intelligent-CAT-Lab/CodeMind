def main():
    s = input()
    ans = 101
    for i in range(26):
        target = chr(i + ord('a'))
        max_dist = 0
        cur_dist = 0
        for char in s:
            if char == target:
                cur_dist = 0
            else:
                cur_dist += 1
                max_dist = max(max_dist, cur_dist)
        ans = min(ans, max_dist)
    
    print(ans)

if __name__ == "__main__":
    main()