a = int ( "733035")
for i in range ( a , 0 , - 1 ) :
    if a % i == 0 :
        print ( i , end = ' ▁ ' )
        a = i
