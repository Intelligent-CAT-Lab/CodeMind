date = '03-11-2000' 
try:
    date = date.strip()
    month, day, year = date.split('-')
    month, day, year = int(month), int(day), int(year)
    if month < 1 or month > 12:
        print(False) 
    if month in [1,3,5,7,8,10,12] and day < 1 or day > 31:
        print(False) 
    if month in [4,6,9,11] and day < 1 or day > 30:
        print(False) 
    if month == 2 and day < 1 or day > 29:
        print(False) 
except:
    print(False)

print(True)