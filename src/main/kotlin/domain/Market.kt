package domain

import generator.RandomLottoNumberGenerator

class Market(
    val lottoMachine: LottoMachine,
    var account: Int = 0
) {

    fun giveLotto(money: Int, count: Int): List<Lotto> {
        deposit(money);
        return createLottoMakeAsManyCount(count);
    }

    private fun createLottoMakeAsManyCount(count: Int): List<Lotto> {
        val lottoList: MutableList<Lotto> = ArrayList<Lotto>();
        for (i in 1..count) {
            lottoList.add(lottoMachine.createLotto())
        }
        return lottoList;
    }

    private fun deposit(money: Int) {
        account += money;
    }

}

fun createMarketWithRandomLottoMachine(): Market {
    return Market(LottoMachine(RandomLottoNumberGenerator()));
}