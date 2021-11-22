package generator

class RandomLottoNumberGenerator : LottoNumberGenerator {
    override fun generateNumbers(): IntArray {
        return intArrayOf(getRandomLottoNum(), getRandomLottoNum(), getRandomLottoNum(), getRandomLottoNum(), getRandomLottoNum(), getRandomLottoNum());   
    }
}