package apps.fahad.template.network.exceptions

import apps.fahad.template.utils.config.CONSTANTS
import java.io.IOException

class UnAuthorizedException : IOException() {
    override val message: String
        get() = CONSTANTS.NETWORK.UN_AUTHORIZED
}