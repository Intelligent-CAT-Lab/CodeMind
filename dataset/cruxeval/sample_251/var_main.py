def f(messages):
    phone_code = "+353"	## {"phone_code" : ''}
    result = []	## {"result" : ''}
    for message in messages:	## {"message" : '',"messages" : ''}
        message.extend(phone_code)	## {"message" : '',"phone_code" : ''}
        result.append(";".join(message))	## {"result" : '',"message" : ''}
    return ". ".join(result)	## {"result" : ''}
