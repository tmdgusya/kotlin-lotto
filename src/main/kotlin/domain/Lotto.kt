package domain

import generator.RandomLottoNumberGenerator

const val DEFAULT_LOTTO_FEE = 5000

class Lotto(private val randomLottoNumberGenerator: RandomLottoNumberGenerator) {
    val numbers: IntArray = randomLottoNumberGenerator.generateNumbers()
    val fee: Int = DEFAULT_LOTTO_FEE
}