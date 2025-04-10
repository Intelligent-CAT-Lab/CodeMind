def test(self):
        self.board_size = 10
        self.gomokuGame = GomokuGame(self.board_size)
        board = [[' ' for _ in range(self.board_size)] for _ in range(self.board_size)]
        board[0][0] = 'X'
        board[0][1] = 'O'
        return self.gomokuGame.make_move(0, 0),self.gomokuGame.make_move(0, 1),board,self.gomokuGame.board