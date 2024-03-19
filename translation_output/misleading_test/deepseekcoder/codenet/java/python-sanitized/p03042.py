def date_format(S):
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
print(date_format(1905))  # Expected output: YYMM