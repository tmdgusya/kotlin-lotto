package domain

import generator.RandomLottoNumberGenerator

class LottoMachine(private val randomLottoNumberGenerator: RandomLottoNumberGenerator) {

    public fun createLotto(): Lotto {
        return Lotto(randomLottoNumberGenerator);
    }

}