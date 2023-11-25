package com.dev.compositiongame.domain.useCases

import com.dev.compositiongame.domain.entity.GameSettings
import com.dev.compositiongame.domain.entity.Level
import com.dev.compositiongame.domain.repository.GameRepository

class GetGameSettingsUseCase(private val repository: GameRepository) {
    operator fun invoke(level: Level):GameSettings{
        return repository.getGameSettings(level)
    }
}