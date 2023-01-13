package com.example.marsphotostest

import com.example.marsphotos.data.MarsPhotoRepositoryImpl
import com.example.marsphotostest.fake.FakeDataSource
import com.example.marsphotostest.fake.FakeMarsApiService
import kotlinx.coroutines.runBlocking
import org.junit.Assert.assertEquals
import org.junit.Test

class MarsViewModelTest {
    @Test
    fun networkMarsPhotosRepository_getMarsPhotos_verifyPhotoList() = runBlocking {
        val repository = MarsPhotoRepositoryImpl(
            marsApiService = FakeMarsApiService()
        )
        assertEquals(FakeDataSource.photosList, repository.getMarsPhotos())
    }
}
