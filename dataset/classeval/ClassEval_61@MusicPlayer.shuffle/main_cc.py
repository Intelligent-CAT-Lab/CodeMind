import random
class MusicPlayer: 
    def __init__(self):
        """
        Initializes the music player with an empty playlist, no current song, and a default volume of 50.
        """
        self.playlist = []
        self.current_song = None
        self.volume = 50

    def shuffle(self):
        if self.playlist:
            import random
            random.shuffle(self.playlist)
            return True
        else:
            return False
    def play(self):
        if self.playlist and self.current_song:
            return self.playlist[0]
        elif len(self.playlist): 
            return False