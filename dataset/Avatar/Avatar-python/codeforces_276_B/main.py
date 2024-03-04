s = list ( input ( ) )
x = True
dt = { }
for i in s :
    if i in dt :
        dt [ i ] += 1
    else :
        dt [ i ] = 1
cnt = 0
x = True
for key , value in dt . items ( ) :
    if value % 2 != 0 and cnt < 1 :
        cnt += 1
    elif value % 2 != 0 and cnt >= 1 :
        x = False
        break
if x :
    print ( "First" )
elif not x and len ( s ) % 2 == 0 :
    print ( "Second" )
elif not x and len ( s ) % 2 != 0 :
    print ( "First" )

