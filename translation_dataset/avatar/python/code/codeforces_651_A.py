a1 , a2 = map ( int , input ( ) . split ( ) )
t = 0
if a1 == 1 and a2 == 1 :
    print ( 0 )
else :
    while a1 > 0 and a2 > 0 :
        if a1 > a2 :
            a2 += 1
            a1 -= 2
        else :
            a2 -= 2
            a1 += 1
        t += 1
    print ( t )

