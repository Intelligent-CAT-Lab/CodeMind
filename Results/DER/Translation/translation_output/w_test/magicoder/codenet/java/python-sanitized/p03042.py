# Python code

def check_date(S):
    yy = S // 100
    mm = S % 100

    if 1 <= yy <= 12:
        if 1 <= mm <= 12:
            return "AMBIGUOUS"
        else:
            return "MMYY"
    else:
        if 1 <= mm <= 12:
            return "YYMM"
        else:
            return "NA"

# Test input
S = 1905
print(check_date(S))