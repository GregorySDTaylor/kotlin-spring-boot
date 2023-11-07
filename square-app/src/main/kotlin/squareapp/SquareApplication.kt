package squareapp

import numberprovider.NumberProvider
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Service

@SpringBootApplication
class SquareApplication(private val squareAnnouncer : SquareAnnouncer) : ApplicationRunner {
    override fun run(args: ApplicationArguments?) {
        squareAnnouncer.announceSquare()
    }
}

fun main(args: Array<String>) {
    runApplication<SquareApplication>(*args)
}

interface SquareAnnouncer {
    fun announceSquare()
}

@Service
class SystemOutSquareAnnouncer(private val numberProvider: NumberProvider) : SquareAnnouncer {
    override fun announceSquare() {
        val number = numberProvider.provideNumber()
        val square = number * number
        println("$number squared is $square")
    }
}