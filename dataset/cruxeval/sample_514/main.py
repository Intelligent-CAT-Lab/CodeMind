def f(text):
    for item in text.split():
        text = text.replace('-{}'.format(item), ' ').replace('{}-'.format(item), ' ')
    return text.strip('-')