package com.example.marsphotos.fake

import com.example.marsphotos.data.MarsPhotoRepository
import com.example.marsphotos.network.MarsPhoto

class FakeMarsPhotoRepository : MarsPhotoRepository {
    override suspend fun getMarsPhotos(): List<MarsPhoto> {
        return FakeDataSource.photosList
    }
}
