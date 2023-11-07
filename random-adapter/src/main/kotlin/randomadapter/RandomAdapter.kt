package randomadapter

import numberprovider.NumberProvider
import kotlin.random.Random

class RandomAdapter : NumberProvider {

    override fun provideNumber(): Int {
        return Random.nextInt(-46340, 46340)
    }

}