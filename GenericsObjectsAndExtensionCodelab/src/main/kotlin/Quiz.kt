class Quiz {
    val question1 = Questions<String> ("My name is ______", "kofi", Difficulty.EASY)
    val question2 = Questions<Boolean> ("Kofi is a genius. True or false", true, Difficulty.EASY)
    val question3 = Questions<Int> ("How old is kofi", 23 , Difficulty.EASY)

    companion object StudentProgress {
        var total: Int = 10
        var answered: Int = 3

    }
    fun printQuiz() {
        question1.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
        question2.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
        question3.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
    }
}
val Quiz.StudentProgress.progressText: String
    get() = "${answered} of ${total} answered"

fun Quiz.StudentProgress.printProgressBar() {
    repeat(Quiz.answered) { print("▓") }
    repeat(Quiz.total - Quiz.answered) { print("▒") }
    println()
    println(Quiz.progressText)
}
