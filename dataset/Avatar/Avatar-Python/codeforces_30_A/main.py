M = list ( map (int, input().split ( ' ' ) ) )
a = M [ 0 ]
b = M [ 1 ]
n = M [ 2 ]
if a != 0 :
    if b % a != 0 :
        print ( 'No▁solution' )
    else :
        b = b // a
        x , y = 0 , - 2000
        if b >= 0 :
            while y < b :
                y = pow ( x , n )
                x = x + 1
            if y > b :
                print ( 'No▁solution' )
            else :
                print ( x - 1 )
        else :
            if n % 2 == 0 :
                print ( 'No▁solution' )
            else :
                x = - 1
                y = 2000
                while y > b :
                    y = pow ( x , n )
                    x = x - 1
                if y < b :
                    print ( 'No▁solution' )
                else :
                    print ( x + 1 )
else :
    if b == 0 :
        print ( 5 )
    else :
        print ( 'No▁solution' )

