package main.scala

import com.google.cloud.translate.Language

class Translator {

  private val translator: TranslatorService = TranslatorServiceFactory.defaultInstance()

  def translate(word: String): String = {
    val translation: Option[String] = translator.translate(word, Language.AUTO_DETECT, Language.ENGLISH)
    translation.getOrElse(word) // If translation is not available will return the original word


  }
}
