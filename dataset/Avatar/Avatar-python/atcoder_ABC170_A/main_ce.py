a = list ( map ( int , "1 2 3 4 0". split ( ) ) )
for e , i in enumerate ( a ) :
    if i == 0 :
        print ( e + 1 )
        break
