package nicestring

fun String.isNice(): Boolean {
    return listOf(nonBuBaBe(), atLeast3Vowels(), containsADoubleLetter()).count { it } >= 2
}

private fun String.nonBu(): Boolean = !this.contains("bu")
private fun String.nonBa(): Boolean = !this.contains("ba")
private fun String.nonBe(): Boolean = !this.contains("be")
fun String.nonBuBaBe(): Boolean = (this.nonBu() && this.nonBa() && this.nonBe())

private fun String.countVowels(): Int = this.filter { it in listOf('a', 'e', 'i', 'o', 'u') }.count()
fun String.atLeast3Vowels(): Boolean = this.countVowels() >= 3

fun String.containsADoubleLetter(): Boolean = this.zipWithNext().any { it -> it.first == it.second }