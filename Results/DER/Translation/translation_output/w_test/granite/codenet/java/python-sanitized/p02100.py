def factorize(poly):
    coeffs = [0] * 6
    plus = True
    si = False
    xs = False
    num = 0
    for c in poly:
        if c == '+':
            if xs:
                if plus:
                    coeffs[1] = num
                else:
                    coeffs[1] = -num
            num = 0
            plus = True
        elif c == '-':
            if xs:
                if plus:
                    coeffs[1] = num
                else:
                    coeffs[1] = -num
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
                v = ord(c) - ord('0')
                if plus:
                    coeffs[v] = num
                else:
                    coeffs[v] = -num
                si = False
            else:
                num = num * 10 + ord(c) - ord('0')
    if plus:
        coeffs[0] = num
    else:
        coeffs[0] = -num
    degree = 0
    for i in range(5, -1, -1):
        if coeffs[i]!= 0:
            degree = i
            break
    ans = []
    for i in range(1, abs(coeffs[0]) + 1):
        result = 0
        for j in range(6):
            result += pow(i, j) * coeffs[j]
        if result == 0:
            ans.append(-i)
        result = 0
        for j in range(6):
            result += pow(-i, j) * coeffs[j]
        if result == 0:
            ans.append(i)
    ans.sort()
    factors = []
    for i in range(len(ans)):
        factors.append("(x")
        if ans[i] >= 0:
            factors.append("+")
        factors.append(str(ans[i]))
        factors.append(")")
    return "".join(factors)