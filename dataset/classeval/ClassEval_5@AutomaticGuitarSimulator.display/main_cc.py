
class AutomaticGuitarSimulator: 
    def __init__(self, text) -> None:
        """
        Initialize the score to be played
        :param text:str, score to be played
        """
        self.play_text = text

    def display(self, key, value):
        return "Normal Guitar Playing -- Chord: %s, Play Tune: %s" % (key, value)