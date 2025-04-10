
class PushBoxGame: 
    def __init__(self, map):
        """
        Initialize the push box game with the map and various attributes.
        :param map: list[str], the map of the push box game, represented as a list of strings. 
            Each character on the map represents a different element, including the following:
            - '#' represents a wall that neither the player nor the box can pass through;
            - 'O' represents the initial position of the player;
            - 'G' represents the target position;
            - 'X' represents the initial position of the box.
        >>> map = ["#####", "#O  #", "# X #", "#  G#", "#####"]   
        >>> game = PushBoxGame(map)                
        """
        self.map = map
        self.player_row = 0
        self.player_col = 0
        self.targets = []
        self.boxes = []
        self.target_count = 0
        self.is_game_over = False
        self.init_game()

    def init_game(self):
        for row in range(len(self.map)):
            for col in range(len(self.map[row])):
                if self.map[row][col] == "O":
                    self.player_row = row
                    self.player_col = col
                elif self.map[row][col] == "G":
                    self.targets.append((row, col))
                    self.target_count += 1
                elif self.map[row][col] == "X":
                    self.boxes.append((row, col))