package com.raywenderlich.android.cocktails.game.model

class Game(highest: Int = 0) {

    var currentScore = 0
    var highestScore = highest

    fun incrementScore() {
        currentScore++
        if (currentScore > highestScore) {
            highestScore = currentScore
        }
    }
}
