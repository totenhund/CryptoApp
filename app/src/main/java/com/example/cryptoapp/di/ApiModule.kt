package com.example.cryptoapp.di


import com.example.cryptoapp.common.Constants
import com.example.cryptoapp.data.api.CoinApi
import com.example.cryptoapp.data.repositories.CoinRepositoryImpl
import com.example.cryptoapp.domain.respositories.CoinRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class ApiModule  {

    @Provides
    @Singleton
    fun provideRetrofit(): Retrofit =
        Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(getHttpClient())
            .build()

    @Provides
    @Singleton
    fun provideCoinApi(retrofit: Retrofit): CoinApi = retrofit.create(CoinApi::class.java)

    @Provides
    @Singleton
    fun provideCoinApiRepository(coinApi: CoinApi): CoinRepository = CoinRepositoryImpl(coinApi)


    private fun getHttpClient(): OkHttpClient {
        return OkHttpClient.Builder().addInterceptor(
            HttpLoggingInterceptor().apply {
                level = HttpLoggingInterceptor.Level.BODY
            }
        ).build()
    }

}