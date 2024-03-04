
ABC = tuple(map(int , input( ).split ( )))
if ABC.count(5) == 2 :
    print ( 'YES' if sum ( ABC ) == 17 else 'NO' )
else :
    print ( 'NO' )

