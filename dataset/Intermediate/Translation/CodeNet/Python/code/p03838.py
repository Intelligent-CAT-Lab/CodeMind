x, y = map(int, input().split())
abs_x = abs(x)
abs_y = abs(y)

if 0 <= x < y:
    print (y - x)
    exit()
if 0 < y < x:
    print (x - y + 2)
    exit()
if y == 0 and 0 < x:
    print (x + 1)
    exit()

if x < y <= 0:
    print (y - x)
    exit()
if y < x < 0:
    print (x - y + 2)
    exit()
if x == 0 and y < 0:
    print (abs_y + 1)
    
if x < 0  < y:
    print (abs(abs_y - abs_x) + 1)
    exit()
if y < 0 < x:
    print (abs(abs_y - abs_x) + 1)
    exit()


