s = eval(input())
a = int(s[:2])
b = int(s[2:])

if 1 <= a and a <= 12 and 1 <= b and b <=12:
    print("AMBIGUOUS")
elif 1 <= a <=12 and (12 < b or b < 1):
    print("MMYY")
elif (12 < a or a < 1) and 1 <= b <= 12:
    print("YYMM")
else:
    print("NA")