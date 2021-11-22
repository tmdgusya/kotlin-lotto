package domain

import generator.RandomLottoNumberGenerator

class Lotto(private val randomLottoNumberGenerator: RandomLottoNumberGenerator) {
    private val numbers: IntArray = randomLottoNumberGenerator.generateNumbers()
    private val fee: Int = 5000
}