def check_dict_case(dict):
    if len(dict.keys()) == 0:	## dict = CLRJ
        return False
    else:
        state = "start"	## state = CLRJ
        for key in dict.keys():	## key = CLRJ|dict = CLRJ

            if isinstance(key, str) == False:	## key = CLRJ
                state = "mixed"
                break
            if state == "start":	## state = CLRJ
                if key.isupper():	## key = CLRJ
                    state = "upper"
                elif key.islower():	## key = CLRJ
                    state = "lower"	## state = CLRJ
                else:
                    break
            elif (state == "upper" and not key.isupper()) or (state == "lower" and not key.islower()):	## state = CLRJ|key = CLRJ
                    state = "mixed"
                    break
            else:
                break
        return state == "upper" or state == "lower" 	## state = CLRJ
