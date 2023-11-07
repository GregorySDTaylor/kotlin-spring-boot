package dayofmonthadapter

import numberprovider.NumberProvider
import java.util.*

class DayOfMonthAdapter : NumberProvider {

    override fun provideNumber(): Int {
        return Calendar.getInstance().get(Calendar.DAY_OF_MONTH)
    }

}