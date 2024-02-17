text = '244, 105, -90'
if ',' in text:
    before, _, after = text.partition(',')
    print(after + ' ' + before)
else:
    print(',' + text.partition(' ')[-1] + ' 0')