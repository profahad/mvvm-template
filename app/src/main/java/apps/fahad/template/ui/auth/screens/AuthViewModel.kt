package apps.fahad.template.ui.auth.screens

import androidx.lifecycle.ViewModel
import apps.fahad.template.data.auth.AuthRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AuthViewModel @Inject constructor(
    private val authRepository: AuthRepository,
) : ViewModel() {}