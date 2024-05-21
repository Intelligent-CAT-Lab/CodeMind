def min_distance(s):
    ans = 101
    for i in range(26):
        target = chr(ord('a') + i)
        max_dist = 0
        cur_dist = 0
        for j in range(len(s)):
            if s[j] == target:
                cur_dist = 0
            else:
                cur_dist += 1
                max_dist = max(max_dist, cur_dist)
        ans = min(ans, max_dist)
    return ans