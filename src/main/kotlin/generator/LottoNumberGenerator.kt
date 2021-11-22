package generator

import kotlin.random.Random

interface LottoNumberGenerator {
    fun generateNumbers(): IntArray;
}

fun LottoNumberGenerator.getRandomLottoNum(): Int {
    val lottoNumRange = (1..45)
    return lottoNumRange.random();
}