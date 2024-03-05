A , B , C , D = map ( int , input ( ) . split ( ) )
m = 998244353
d = [ [ 0 ] * ( D + 1 ) for _ in range ( C + 1 ) ]
d [ A ] [ B ] = 1
for i in range ( A , C + 1 ) :
    for j in range ( B , D + 1 ) :
        d [ i ] [ j ] += ( d [ i ] [ j - 1 ] * i + d [ i - 1 ] [ j ] * j - d [ i - 1 ] [ j - 1 ] * ( i - 1 ) * ( j - 1 ) ) % m
print ( d [ C ] [ D ] )

