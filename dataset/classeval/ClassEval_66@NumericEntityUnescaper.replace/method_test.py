def test(self):

        unescaper = NumericEntityUnescaper()
        res = unescaper.replace("&#67;&#67;&#67;;")
        return res