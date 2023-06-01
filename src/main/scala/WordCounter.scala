import scala.collection.mutable

class WordCounter(translator: Translator) {
  private val wordMap: mutable.Map[String, Int] = mutable.Map.empty

  def addWords(words: String*): Unit = {
    for (word <- words) {
      if (isAlphabetic(word)) {
        val translatedWord = translator.translate(word)
        val count = wordMap.getOrElse(translatedWord, 0)
        wordMap.put(translatedWord, count + 1)
      }
    }
  }

  def getCount(word: String): Int = {
    val translatedWord = translator.translate(word)
    wordMap.getOrElse(translatedWord, 0)
  }

  private def isAlphabetic(word: String): Boolean = {
    word.matches("[a-zA-Z]+")
  }
}
