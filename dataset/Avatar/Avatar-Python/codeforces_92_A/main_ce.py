import sys
input = sys . stdin . readline
n , m = map ( int , "24 7440". split ( ) )
i = 0
while True :
    if i + 1 > m :
        ans = m
        break
    m -= i + 1
    i += 1
    i %= n
print ( ans )
