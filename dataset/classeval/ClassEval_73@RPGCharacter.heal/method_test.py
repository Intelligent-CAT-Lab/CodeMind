def test(self):

        character = RPGCharacter("John", 100, 20, 10)
        character.hp = 10
        character.heal()
        return character.hp