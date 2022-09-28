package apps.fahad.template.data.auth

import apps.fahad.template.network.middlewares.BaseDataSource
import javax.inject.Inject

/**
 * Auth data source
 *
 * @property apiService
 * @constructor Create empty Auth data source
 */
class AuthDataSource @Inject constructor(private val apiService: AuthService) : BaseDataSource() {

}