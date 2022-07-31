package com.weslleyqi0.apprepositories.data.repositories

import com.weslleyqi0.apprepositories.data.model.Repo
import kotlinx.coroutines.flow.Flow

interface RepoRepository {
    suspend fun listRepositories(user: String): Flow<List<Repo>>
}