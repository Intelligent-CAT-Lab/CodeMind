k , n , w = map ( int , "1000 1000000000 1000". strip ( ) . split ( ) )
sum = 0
for i in range ( 1 , w + 1 ) :
    sum += k * i
if sum <= n :
    print ( 0 )
else :
    print ( sum - n )
