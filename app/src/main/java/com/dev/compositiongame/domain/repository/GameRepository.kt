package com.dev.compositiongame.domain.repository

import com.dev.compositiongame.domain.entity.GameSettings
import com.dev.compositiongame.domain.entity.Level
import com.dev.compositiongame.domain.entity.Question

interface GameRepository {
    fun generateQuestion(maxSumValue:Int, countOfOptions:Int):Question
    fun getGameSettings(level: Level):GameSettings
}