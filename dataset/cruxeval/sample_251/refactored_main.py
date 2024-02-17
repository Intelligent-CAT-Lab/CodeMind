messages = [['Marie','Nelson','Oscar']]
phone_code = "+353"
result = []
for message in messages:
    message.extend(phone_code)
    result.append(";".join(message))
print(". ".join(result))