ip = input ( )
st = " "
if len ( ip ) != 1 :
    if ip [ 0 ] == "9" :
        st = "9"
        ip = ip [ 1 : ]
    for i in ip :
        if int ( i ) > 4 :
            n = 9 - int ( i )
            st += str ( n )
        else :
            st += i
else :
    st = ip
print ( int ( st ) )

