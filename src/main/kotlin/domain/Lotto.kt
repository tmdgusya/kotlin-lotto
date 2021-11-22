package domain

import generator.RandomLottoNumberGenerator

class Lotto(private val randomLottoNumberGenerator: RandomLottoNumberGenerator) {
    val numbers: IntArray = randomLottoNumberGenerator.generateNumbers()
    val fee: Int = 5000
}