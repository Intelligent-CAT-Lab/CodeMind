def solve_polynomial(polynomial):
    arr = list(polynomial)
    num = 0
    plus = True
    si = False
    xs = False
    keis = [0] * 6

    for c in arr:
        if c == '+':
            if xs:
                keis[1] = num if plus else -num
            num = 0
            plus = True
        elif c == '-':
            if xs:
                keis[1] = num if plus else -num
            num = 0
            plus = False
        elif c == '^':
            si = True
            xs = False
        elif c == 'x':
            if num == 0:
                num = 1
            xs = True
        else:
            if si:
                v = int(c)
                keis[v] = num if plus else -num
                si = False
            else:
                num = num * 10 + int(c)

    if plus:
        keis[0] = num
    else:
        keis[0] = -num

    ji = 0
    for i in range(5, -1, -1):
        if keis[i] != 0:
            ji = i
            break

    ans = []
    for i in range(1, abs(keis[0]) + 1):
        if ji <= 0:
            break
        result = 0
        for j in range(6):
            result += (i ** j) * keis[j]
        if result == 0:
            ji -= 1
            ans.append(-i)

        result = 0
        for j in range(6):
            result += (-i ** j) * keis[j]
        if result == 0:
            ji -= 1
            ans.append(i)

    ans.sort()
    sb = ''
    for i in ans:
        sb += "(x"
        if i >= 0:
            sb += "+"
        sb += str(i) + ")"
    
    return sb

# Test case
test_input = "x^2+3x+2"
print(solve_polynomial(test_input))