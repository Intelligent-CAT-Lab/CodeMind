import math
import sys

def getinputdata():

    # 配列初期化
    array_result = []
    
    data = input()
    
    array_result.append(data.split(" "))

    flg = 1

    try:
        while flg:

            data = input()

            array_temp = []

            if(data != ""):
                
                array_result.append(data.split(" "))

                flg = 1

            else:

                flg = 0
    finally:


        return array_result

arr_data = getinputdata()

r1 = int(arr_data[0][0])
r2 = int(arr_data[0][1])


print(1/((r2+r1) /(r1*r2)))