package apps.fahad.template.data.auth

import javax.inject.Inject

/**
 * Auth repository
 *
 * @property apiDataSource
 * @constructor Create empty Auth repository
 */
class AuthRepository @Inject constructor(
    private val apiDataSource: AuthDataSource
) {


}