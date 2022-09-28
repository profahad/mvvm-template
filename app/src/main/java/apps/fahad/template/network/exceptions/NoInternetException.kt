package apps.fahad.template.network.exceptions

import apps.fahad.template.utils.config.CONSTANTS
import java.io.IOException

class NoInternetException : IOException() {
    override val message: String
        get() = CONSTANTS.NETWORK.INTERNET_CONNECTIVITY
}