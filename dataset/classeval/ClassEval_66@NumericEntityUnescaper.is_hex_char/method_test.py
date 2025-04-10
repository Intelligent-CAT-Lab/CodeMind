def test(self):

        unescaper = NumericEntityUnescaper()
        res = unescaper.is_hex_char('F')
        return res