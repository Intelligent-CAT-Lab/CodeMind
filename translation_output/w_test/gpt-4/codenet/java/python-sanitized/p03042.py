# This function analyzes the given number and determines the date format
def analyze_date(s):
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


# Sample test case
input_value = 1905
print(analyze_date(input_value))