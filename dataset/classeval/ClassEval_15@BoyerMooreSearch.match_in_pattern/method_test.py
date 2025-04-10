def test(self):

        boyerMooreSearch = BoyerMooreSearch("ABAABA", "ABAB")
        return boyerMooreSearch.match_in_pattern('B')