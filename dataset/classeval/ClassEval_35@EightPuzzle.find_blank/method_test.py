def test(self):

        state = [[2, 3, 4], [5, 8, 1], [6, 8, 7]]
        eightPuzzle = EightPuzzle(state)
        return eightPuzzle.find_blank(state)