def test(self):
        self.blackjackGame = BlackjackGame()
        player_hand = ['2S', '4S', '5S']
        dealer_hand = ['2S', 'JS', 'QS']
        return self.blackjackGame.check_winner(player_hand, dealer_hand)