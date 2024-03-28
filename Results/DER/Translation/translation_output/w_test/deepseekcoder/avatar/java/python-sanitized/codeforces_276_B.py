def solve(s):
    count = [0]*26
    for ch in s:
        count[ord(ch) - ord('a')] += 1

    odd_count = sum(1 for i in count if i % 2)

    if odd_count == 0:
        return "First"
    else:
        if odd_count % 2 == 0:
            return "Second"
        else:
            return "First"

s = input()
print(solve(s))