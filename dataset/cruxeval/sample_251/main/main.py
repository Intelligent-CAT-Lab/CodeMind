def f(messages):
    phone_code = "+353"
    result = []
    for message in messages:
        message.extend(phone_code)
        result.append(";".join(message))
    return ". ".join(result)