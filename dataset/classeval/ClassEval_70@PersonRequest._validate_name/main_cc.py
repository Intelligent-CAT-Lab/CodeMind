
class PersonRequest: 
    def __init__(self, name: str, sex: str, phoneNumber: str):
        """
        Initialize PersonRequest object with the provided information.
        :param name: str, the name of the person
        :param sex: str, the sex of the person
        :param phoneNumber: str, the phone number of the person
        """
        self.name = self._validate_name(name)
        self.sex = self._validate_sex(sex)
        self.phoneNumber = self._validate_phoneNumber(phoneNumber)


    def _validate_name(self, name: str) -> str:
        if not name:
            return None
        if len(name) > 33:
            return None
        return name