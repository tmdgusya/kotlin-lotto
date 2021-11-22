package domain

import generator.RandomLottoNumberGenerator
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class LottoTest {

    @Test
    fun verifyLottoHasSixNumbers() {
        //given
        val lotto: Lotto = Lotto(RandomLottoNumberGenerator());
        val defaultLottoNumberSize = 6;

        //when
        val numbers = lotto.numbers;

        //then
        assertEquals(defaultLottoNumberSize, numbers.size);
    }

    @Test
    fun verifyLottoPrice() {
        val defaultLottoPrice = 5000;
        val lotto: Lotto = Lotto(RandomLottoNumberGenerator());

        assertEquals(defaultLottoPrice, lotto.fee)
    }

}