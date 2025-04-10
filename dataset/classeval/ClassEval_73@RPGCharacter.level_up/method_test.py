def test(self):

        character = RPGCharacter("John", 100, 20, 10)
        character.level_up()
        return character.level,character.exp,character.hp,character.attack_power,character.defense