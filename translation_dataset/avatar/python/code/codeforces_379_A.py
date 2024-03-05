a , b = map ( int , input ( ) . split ( ) )
x = a
h = 0
s = 0
while x > 0 :
    x -= 1
    h += 1
    s += 1
while s // b != 0 :
    h += 1
    s = s - b + 1
print ( h )

