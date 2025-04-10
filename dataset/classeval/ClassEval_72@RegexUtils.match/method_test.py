def test(self):

        ru = RegexUtils()
        res = ru.match(r'\b\d{3}-\d{3}-\d{4}\b', "1234567890")
        return res