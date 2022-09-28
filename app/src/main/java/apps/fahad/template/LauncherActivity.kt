package apps.fahad.template

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import apps.fahad.template.databinding.ActivityLauncherBinding
import apps.fahad.template.ui.auth.AuthActivity
import apps.fahad.template.utils.session.SessionManager
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.firstOrNull

@AndroidEntryPoint
class LauncherActivity : AppCompatActivity() {

    private val activityScope by lazy {
        CoroutineScope(Dispatchers.Main)
    }

    private lateinit var binding: ActivityLauncherBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLauncherBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        initListeners()
    }

    private fun initListeners() {
        activityScope.launch {
            delay(1500)
            SessionManager.isLoginFlow.firstOrNull()?.let {
                when (it) {
                    true -> moveToDashboard()
                    false -> moveToLogin()
                }
            }
        }
    }

    private fun moveToDashboard() {

    }

    private fun moveToLogin() = AuthActivity.createInstance(this).let {
        startActivity(it).apply {
            finishAffinity()
        }
    }

    override fun onPause() {
        activityScope.cancel()
        super.onPause()
    }
}