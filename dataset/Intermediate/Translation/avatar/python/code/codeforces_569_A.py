T , s , q = map ( int , input ( ) . split ( ) )
v = ( q - 1 ) / q
tm = 1
t = s / ( 1 - v )
while ( T - s ) / v - t > 0 :
    if ( T - s ) / v - t < 1e-10 :
        break
    tm += 1
    s += v * t
    t = s / ( 1 - v )
print ( tm )

