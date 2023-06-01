object Main {
  def main(args: Array[String]): Unit = {
    val translator = new Translator()
    val wordCounter = new WordCounter(translator)

    // Adding words to the WordCounter
    wordCounter.addWords("flower", "flor", "blume")

    // Retrieving the count for a specific word
    val word = "flower"
    val count = wordCounter.getCount(word)

    println(s"The count for '$word' is $count")  }
}