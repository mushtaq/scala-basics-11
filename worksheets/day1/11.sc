import data.AliceData

val words = AliceData.bookText.split(AliceData.bookRegex).toList

val stopWords = AliceData.stopWordText.split(AliceData.stopWordRegex).toSet

words
  .filterNot(stopWords)
  .groupBy(identity)
  .mapValues(_.length)
  .toList
  .sortBy(t => -t._2)
  .take(10)

