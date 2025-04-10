def test(self):

        camelize_map = CamelCaseMap()
        camelize_map['first_name'] = 'John'
        camelize_map.__delitem__('firstName')
        return 