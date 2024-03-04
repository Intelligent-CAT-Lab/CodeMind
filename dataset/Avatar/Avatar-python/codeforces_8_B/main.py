from collections import deque
path = input ( )
coord = set ( [ ( 0 , 0 ) ] ) ; temp = ( 0 , 0 )
for c in path :
    if c == 'L' : temp = ( temp [ 0 ] , temp [ 1 ] - 1 )
    elif c == 'R' : temp = ( temp [ 0 ] , temp [ 1 ] + 1 )
    elif c == 'U' : temp = ( temp [ 0 ] - 1 , temp [ 1 ] )
    else : temp = ( temp [ 0 ] + 1 , temp [ 1 ] )
    if temp in coord : print ( 'BUG' ) ; exit ( )
    coord . add ( temp )
coord . remove ( ( 0 , 0 ) )
que = deque ( [ ( 0 , 0 ) ] )
while que :
    if len (que) > 1 : print ('BUG') ; exit ( )
    i,j = que.popleft ( )
    for p,q in ( i + 1,j ) , ( i - 1,j ) , ( i , j + 1 ) , ( i , j - 1 ) :
        if ( p , q ) in coord :
            coord . remove ( ( p , q ) )
            que += ( p , q ) ,
print ('OK')

