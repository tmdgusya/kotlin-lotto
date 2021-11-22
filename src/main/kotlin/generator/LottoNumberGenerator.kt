package generator

interface LottoNumberGenerator {
    fun generateNumbers(): IntArray;
}

fun LottoNumberGenerator.getRandomLottoNum(): Int {
    val lottoNumRange = (1..45)
    return lottoNumRange.random();
}