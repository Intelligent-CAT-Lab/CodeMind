def check_date_format(s):
    yy = s // 100
    mm = s % 100

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

# Main part of the program
if __name__ == "__main__":
    s = int(input())
    result = check_date_format(s)
    print(result)