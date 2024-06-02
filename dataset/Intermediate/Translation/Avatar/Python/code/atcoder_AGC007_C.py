from decimal import Decimal , getcontext
getcontext ( ) . prec = 200
n , d , x = map ( Decimal , input ( ) . split ( ) )
ans = 0
for i in range ( 1 , int ( n ) + 1 ) :
    i = Decimal ( str ( i ) )
    ans += Decimal ( str ( ( int ( n ) - int ( i ) + 1 ) ) ) / Decimal ( str ( i ) ) * ( d + x * Decimal ( str ( int ( n ) * 2 - 1 ) ) / Decimal ( "2" ) )
print ( ans )

