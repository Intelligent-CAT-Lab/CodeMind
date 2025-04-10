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

    def lemmatize_sentence(self, sentence):
        lemmatized_words = []
        sentence = self.remove_punctuation(sentence)
        words = word_tokenize(sentence)
        tagged_words = pos_tag(words)
        for word, tag in tagged_words:
            if tag.startswith('V'):
                lemmatized_word = self.lemmatizer.lemmatize(word, pos='v')
            elif tag.startswith('J'):
                lemmatized_word = self.lemmatizer.lemmatize(word, pos='a')
            elif tag.startswith('R'):
                lemmatized_word = self.lemmatizer.lemmatize(word, pos='r')
            else:
                lemmatized_word = self.lemmatizer.lemmatize(word)
            lemmatized_words.append(lemmatized_word)
        return lemmatized_words
    def remove_punctuation(self, sentence):
        return sentence.translate(str.maketrans('', '', string.punctuation))