package squareapp

import numberprovider.NumberProvider
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.stereotype.Service
import randomadapter.RandomAdapter

class SquareApplication {}

fun main(args: Array<String>) {
    val applicationContext = AnnotationConfigApplicationContext(ApplicationConfiguration::class.java)
    val squareAnnouncer = applicationContext.getBean(SquareAnnouncer::class.java)
    squareAnnouncer.announceSquare()
}

@Configuration
@ComponentScan
open class ApplicationConfiguration {
    @Bean
    open fun numberProvider() : NumberProvider {
        return RandomAdapter()
    }
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