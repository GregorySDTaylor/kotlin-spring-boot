package squareapp

import numberprovider.NumberProvider
import randomadapter.RandomAdapter

class SquareApplication {}

fun main(args: Array<String>) {
    val numberProvider = RandomAdapter()
    val squareAnnouncer = SystemOutSquareAnnouncer(numberProvider)
    squareAnnouncer.announceSquare()
}

interface SquareAnnouncer {
    fun announceSquare()
}

class SystemOutSquareAnnouncer(private val numberProvider: NumberProvider) : SquareAnnouncer {

    override fun announceSquare() {
        val number = numberProvider.provideNumber()
        val square = number * number
        println("$number squared is $square")
    }

}