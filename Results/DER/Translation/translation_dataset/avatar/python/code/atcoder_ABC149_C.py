import math
N = int ( input ( ) )
def hoge ( n ) :
    if n == 2 :
        return True
    for x in range ( 2 , int ( math . sqrt ( n ) + 2 ) ) :
        if n % x == 0 :
            return False
    return True
while True :
    if hoge ( N ) :
        print ( N )
        exit ( )
    N += 1

