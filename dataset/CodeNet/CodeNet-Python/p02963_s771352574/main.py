
sosu = [2]
now = 3

while now ** 2 <= 10 ** 9:

    for i in sosu:

        flag = True
        if now % i == 0:
            flag = False
            break

    if flag:
        sosu.append(now)

    now += 1

#print (sosu)

sosu.insert(0,1)



S = int(input())

lis = []


r = int(S ** 0.5)

st1 = r
st2 = r
mode = 0

while True:

    if st1 * st2 - S >= 0:

        cd = ( st1 * st2 ) - S

        for i in sosu:

            flag = False

            if cd % i == 0 and cd // i <= 10 ** 9 and st1 <= 10 ** 9 and st2 <= 10 ** 9:

                print (0,0,st1,cd // i,i,st2)
                flag = True
                break

    if flag:
        break

    if st2 == 10 ** 9 and st1 == 10 ** 9:
        mode = 1
        st1 = 10 ** 9
        st2 = r

    if mode == 1 and st1 * st2 < S:
        st1 -= 1
        st2 = r

    elif mode == 1:
        st2 -= 1

    elif st1 >= 10 ** 9:
        st2 += 1
        st1 = r

    else:
        st1 += 1




    


