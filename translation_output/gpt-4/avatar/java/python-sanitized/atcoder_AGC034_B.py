def solve(s):
    s = s.replace('BC', 'D')
    cnt = 0
    tmp = 0
    for char in s:
        if char == 'A':
            tmp += 1
        elif char == 'D':
            cnt += tmp
        else:
            tmp = 0
    return cnt

# Python equivalent of the main method and reading from stdin, printing to stdout
if __name__ == '__main__':
    s = input()
    result = solve(s)
    print(result)