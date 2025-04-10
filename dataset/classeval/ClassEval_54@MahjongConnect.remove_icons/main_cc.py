import random
class MahjongConnect: 
    def __init__(self, BOARD_SIZE, ICONS):
        """
        initialize the board size and the icon list, create the game board
        :param BOARD_SIZE: list of two integer numbers, representing the number of rows and columns of the game board
        :param ICONS: list of string, representing the icons
        >>>mc = MahjongConnect([4, 4], ['a', 'b', 'c'])
        mc.BOARD_SIZE = [4, 4]
        mc.ICONS = ['a', 'b', 'c']
        mc.board = mc.create_board()
        """
        self.BOARD_SIZE = BOARD_SIZE
        self.ICONS = ICONS
        self.board = self.create_board()

    def remove_icons(self, pos1, pos2):
        x1, y1 = pos1
        x2, y2 = pos2
        self.board[x1][y1] = ' '
        self.board[x2][y2] = ' '