def f(messages):
    phone_code = "+353"	## <state>phone_code = CLRJ</state>
    result = []	## <state>result = CLRJ</state>
    for message in messages:	## <state>message = CLRJ | messages = CLRJ</state>
        message.extend(phone_code)	## <state>message = CLRJ | phone_code = CLRJ</state>
        result.append(";".join(message))	## <state>result = CLRJ | message = CLRJ</state>
    return ". ".join(result)	## <state>result = CLRJ</state>
