text = '!klcd!ma:ri'
suffix = '!'
output = text
while text.endswith(suffix):
    output = text[:-len(suffix)]
    text = output
print(output)