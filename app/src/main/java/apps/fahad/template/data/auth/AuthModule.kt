package apps.fahad.template.data.auth

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AuthModule {

    @Provides
    fun provideApiService(retrofit: Retrofit): AuthService =
        retrofit.create(AuthService::class.java)

    @Singleton
    @Provides
    fun provideApiDataSource(authService: AuthService) = AuthDataSource(authService)

    @Singleton
    @Provides
    fun provideApiRepository(
        authDataSource: AuthDataSource,
    ) = AuthRepository(authDataSource)
}