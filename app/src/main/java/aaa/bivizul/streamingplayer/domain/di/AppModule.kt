package aaa.bivizul.streamingplayer.domain.di

import dagger.Module

@Module(includes = [NetworkModule::class, AppBindModule::class])
class AppModule