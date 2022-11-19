package aaa.bivizul.streamingplayer.domain.di

import aaa.bivizul.streamingplayer.presentation.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {

    fun inject(mainActivity: MainActivity)
//    fun inject(mainFragment: MainFragment)
//    fun inject(dofunspoFragment: DofunspoFragment)
//    fun inject(funspoFragment: FunspoFragment)
//    fun inject(funsposListFragment: FunsposListFragment)
//    fun inject(settingsFragment: SettingsFragment)

}