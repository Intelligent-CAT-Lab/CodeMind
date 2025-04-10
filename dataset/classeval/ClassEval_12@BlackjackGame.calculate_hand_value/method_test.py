def test(self):

        blackjackGame = BlackjackGame()
        hand = ['JS', 'QS', 'AS', 'AS', 'AS']
        return blackjackGame.calculate_hand_value(hand)