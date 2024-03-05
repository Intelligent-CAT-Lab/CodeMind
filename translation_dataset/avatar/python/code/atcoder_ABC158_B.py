N , A , B = map ( int , input ( ) . split ( ) )
ans = N // ( A + B ) * A
rem = N % ( A + B )
ans += min ( rem , A )
print ( ans )

