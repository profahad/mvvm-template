package apps.fahad.template.network.exceptions

import apps.fahad.template.utils.config.CONSTANTS
import java.lang.Exception

class UnKnownException : Exception() {
    override val message: String
        get() = CONSTANTS.NETWORK.UNKNOWN_ERROR
}