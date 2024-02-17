text = '-stew---corn-and-beans-in soup-.-'
for item in text.split():
    text = text.replace('-{}'.format(item), ' ').replace('{}-'.format(item), ' ')
print(text.strip('-'))