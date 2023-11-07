package squareapp

class SquareApplication {}

fun main(args: Array<String>) {
    val squareAnnouncer = SystemOutSquareAnnouncer()
    squareAnnouncer.announceSquareFor(321)
}

interface SquareAnnouncer {
    fun announceSquareFor(number: Int)
}

class SystemOutSquareAnnouncer : SquareAnnouncer {
    override fun announceSquareFor(number: Int) {
        val square = number * number
        println("$number squared is $square")
    }

}