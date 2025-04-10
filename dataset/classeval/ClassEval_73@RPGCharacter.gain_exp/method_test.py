def test(self):

        character = RPGCharacter("John", 100, 20, 10)
        character.gain_exp(400)
        return character.level,character.exp