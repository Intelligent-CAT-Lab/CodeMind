def test(self):

        ru = RegexUtils()
        pat = ru.generate_phone_number_pattern()
        res = ru.match(pat, '123-456-789')
        return res