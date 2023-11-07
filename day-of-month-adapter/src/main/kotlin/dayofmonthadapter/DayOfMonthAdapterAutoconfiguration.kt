package dayofmonthadapter

import numberprovider.NumberProvider
import org.springframework.boot.autoconfigure.AutoConfiguration
import org.springframework.context.annotation.Bean

@AutoConfiguration
class DayOfMonthAdapterAutoconfiguration {
    @Bean
    fun dayOfMonthAdapter() : NumberProvider {
        return DayOfMonthAdapter()
    }
}