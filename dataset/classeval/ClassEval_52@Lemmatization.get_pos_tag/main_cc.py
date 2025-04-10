import nltk
from nltk.stem import WordNetLemmatizer
from nltk import pos_tag, word_tokenize
import string
class Lemmatization: 
    def __init__(self):
        """
        creates a WordNetLemmatizer object and stores it in the self.lemmatizer member variable.
        """
        self.lemmatizer = WordNetLemmatizer()

    def get_pos_tag(self, sentence):
        pos_tags = []
        sentence = self.remove_punctuation(sentence)
        words = word_tokenize(sentence)
        tagged_words = pos_tag(words)
        for tagged_word in tagged_words:
            pos_tags.append(tagged_word[1])
        return pos_tags
    def remove_punctuation(self, sentence):
        return sentence.translate(str.maketrans('', '', string.punctuation))