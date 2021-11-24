package domain

class POSMachine(val market: Market) {

    fun calculate(money: Int, count: Int): List<Lotto> {
        if(isNotEnoughMoney(money, count)) {
            throw IllegalArgumentException("금액이 부족합니다. 다시 한번 확인해주세요.")
        }
        return market.giveLotto(money, count);
    }

    private fun isNotEnoughMoney(money: Int, count: Int): Boolean {
        val price = DEFAULT_LOTTO_FEE * count;
        return price > money;
    }

}