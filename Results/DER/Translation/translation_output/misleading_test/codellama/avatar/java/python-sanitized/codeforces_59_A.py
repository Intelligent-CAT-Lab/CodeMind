import re

def convert_case(word):
    uppercase = 0
    lowercase = 0
    for ch in word:
        if ch.isupper():
            uppercase += 1
        else:
            lowercase += 1
    if uppercase > lowercase:
        return word.upper()
    elif lowercase > uppercase:
        return word.lower()
    else:
        return word.lower()

test_input = "CDOZDPBVVVHNBJVBYHEOXWFLJKRWJCAJMIFCOZWWYFKVWOGTVJcuusigdqfkumewjtdyitveeiaybwrhomrwmpdipjwiuxfnwuz"
expected_output = "VS?Z]#CVVVH@y@VB=?HO-7(152g1JC~(MyQ0^oWWw]xVx&uO2N#oUVgiDQwK^M;?9TcYuTlq4SQ.cj:|+qlxpsp[PmW .k`NWT'"

print(convert_case(test_input))