def snake_to_camel(word):
        import re
        return ''.join(x.capitalize() or '_' for x in word.split('_'))
snake_to_camel('python_program')