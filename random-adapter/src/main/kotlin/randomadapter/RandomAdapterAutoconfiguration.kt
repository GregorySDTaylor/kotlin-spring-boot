package randomadapter

import numberprovider.NumberProvider
import org.springframework.boot.autoconfigure.AutoConfiguration
import org.springframework.context.annotation.Bean

@AutoConfiguration
class RandomAdapterAutoconfiguration {
    @Bean
    fun randomAdapter() : NumberProvider {
        return RandomAdapter()
    }
}