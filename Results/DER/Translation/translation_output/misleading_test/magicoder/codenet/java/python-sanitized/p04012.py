def is_palindrome(s):
    count = [0] * 26
    for char in s:
        count[ord(char) - ord('a')] += 1
    odd_count = sum(1 for i in count if i % 2 != 0)
    return odd_count <= 1

s = input()
print("Yes" if is_palindrome(s) else "No")