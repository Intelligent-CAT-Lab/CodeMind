a = 3
b = 4
c = 5
if a + b <= c or a + c <= b or b + c <= a:
    print(-1)
else: 
    s = (a + b + c)/2    
    area = (s * (s - a) * (s - b) * (s - c)) ** 0.5
    area = round(area, 2)
    print(area)