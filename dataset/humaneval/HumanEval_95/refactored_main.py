dict = {"p":"pineapple", "b":"banana"}
if len(dict.keys()) == 0:
    result = False
else:
    state = "start"
    for key in dict.keys():

        if isinstance(key, str) == False:
            state = "mixed"
            break
        if state == "start":
            if key.isupper():
                state = "upper"
            elif key.islower():
                state = "lower"
            else:
                break
        elif (state == "upper" and not key.isupper()) or (state == "lower" and not key.islower()):
                state = "mixed"
                break
        else:
            break
    result = state == "upper" or state == "lower" 
print(result)