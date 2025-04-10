def test(self):
        self.game_map = [
            "#####",
            "#O  #",
            "# X #",
            "#  G#",
            "#####"
        ]
        self.game = PushBoxGame(self.game_map)
        self.game.move('s')
        return self.game.player_col,self.game.player_row,self.game.is_game_over