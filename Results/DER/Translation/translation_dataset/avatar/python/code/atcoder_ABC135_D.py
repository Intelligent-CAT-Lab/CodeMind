import math
s = list ( map ( str , input ( ) . split ( ) ) )
s = s [ 0 ]
n = len ( s )
now = 1
amari = [ ]
for i in range ( len ( s ) ) :
    amari . append ( now )
    now = ( now * 10 ) % 13
ans = [ [ 0 for i in range ( 13 ) ] for j in range ( 2 ) ]
ans [ 0 ] [ 0 ] = 1
ans [ 1 ] [ 0 ] = 1
for i in range ( len ( s ) ) :
    now = s [ n - 1 - i ]
    ans [ ( i + 1 ) % 2 ] = [ 0 for i in range ( 13 ) ]
    if ( now == " ? " ) :
        for k in range ( 10 ) :
            plus = ( amari [ i ] * k ) % 13
            for j in range ( 13 ) :
                ans [ ( i + 1 ) % 2 ] [ ( j + plus ) % 13 ] += ans [ i % 2 ] [ j ]
                ans [ ( i + 1 ) % 2 ] [ ( j + plus ) % 13 ] %= 1000000007
    else :
        now = int ( now )
        plus = ( amari [ i ] * now ) % 13
        for j in range ( 13 ) :
            ans [ ( i + 1 ) % 2 ] [ ( j + plus ) % 13 ] = ans [ i % 2 ] [ j ]
    last = ( i + 1 ) % 2
print ( ans [ last ] [ 5 ] )

