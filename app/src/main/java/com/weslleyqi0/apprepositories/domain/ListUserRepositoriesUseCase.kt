package com.weslleyqi0.apprepositories.domain

import com.weslleyqi0.apprepositories.core.UseCase
import com.weslleyqi0.apprepositories.data.model.Repo
import com.weslleyqi0.apprepositories.data.repositories.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(
    private val repository: RepoRepository
) : UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}
