package apps.fahad.template.network.exceptions

import apps.fahad.template.utils.config.CONSTANTS
import java.io.IOException

class InternalServerException : IOException() {
    override val message: String
        get() = CONSTANTS.NETWORK.INTERNAL_SERVER_ERROR
}
