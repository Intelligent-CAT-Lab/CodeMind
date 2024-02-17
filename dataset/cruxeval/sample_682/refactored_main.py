text = 'hypernimovichyp'
length = 2
index = 2
ls = text.rsplit(None, index)
print('_'.join([l[:length] for l in ls]))