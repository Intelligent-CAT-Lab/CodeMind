def test(self):
        self.blackjackGame = BlackjackGame()
        self.deck = self.blackjackGame.deck

        return len(self.deck)