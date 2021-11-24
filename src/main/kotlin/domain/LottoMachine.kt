package domain

import generator.RandomLottoNumberGenerator

class LottoMachine(private val randomLottoNumberGenerator: RandomLottoNumberGenerator) {

    fun createLotto(): Lotto {
        return Lotto(randomLottoNumberGenerator);
    }

}