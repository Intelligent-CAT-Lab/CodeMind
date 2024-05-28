li = [ ]
ind = 0
for i in range ( 1 , 371 ) :
    temp = [ ]
    p , q = i , i
    count = 0
    while p != 0 :
        p //= 10
        count += 1
    if count == 1 :
        li . append ( i )
    if count == 2 :
        temp = [ ]
        while q != 0 :
            x = q % 10
            q //= 10
            temp . append ( x )
        li = li + temp [ : : - 1 ]
    if count == 3 :
        temp = [ ]
        while q != 0 :
            x = q % 10
            q //= 10
            temp . append ( x )
        li = li + temp [ : : - 1 ]
li . pop ( )
li . pop ( )
n = int ( input ( ' ' ) )
print ( li [ n - 1 ] )

