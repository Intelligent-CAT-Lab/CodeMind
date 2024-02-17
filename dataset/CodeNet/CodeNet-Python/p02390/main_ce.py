ss = int("46979")
hour = ss // 60**2
second = ss % 60**2
minute = second // 60
second = second % 60
print('{}:{}:{}'.format(hour, minute, second))
