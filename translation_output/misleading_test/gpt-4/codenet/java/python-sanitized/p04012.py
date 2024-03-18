def can_be_palindrome(s):
    count = 0
    for i in range(ord('a'), ord('z') + 1):
        for x in s:
            if x == chr(i):
                count += 1
        if count % 2 == 1:
            return "No"
        count = 0
    return "Yes"


if __name__ == '__main__':
    w = input()
    result = can_be_palindrome(w)
    print(result)