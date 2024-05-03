def f(messages):
    phone_code = "+353"	## phone_code = CLRJ
    result = []	## result = CLRJ
    for message in messages:	## message = CLRJ | messages = CLRJ
        message.extend(phone_code)	## message = CLRJ | phone_code = CLRJ
        result.append(";".join(message))	## result = CLRJ | message = CLRJ
    return ". ".join(result)	## result = CLRJ
