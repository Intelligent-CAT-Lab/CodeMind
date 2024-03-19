def check_direction(s):
    check_s = False
    check_n = False
    check_w = False
    check_e = False
    for i in s:
        if i == 'S':
            check_s = True
        elif i == 'N':
            check_n = True
        elif i == 'W':
            check_w = True
        elif i == 'E':
            check_e = True
    if check_s == check_n and check_w == check_e:
        return "Yes"
    else:
        return "No"

s = input()
print(check_direction(s))