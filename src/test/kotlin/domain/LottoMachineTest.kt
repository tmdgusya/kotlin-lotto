package domain

import generator.RandomLottoNumberGenerator
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class LottoMachineTest {

    private val lottoMachine: LottoMachine = LottoMachine(RandomLottoNumberGenerator());

    @Test
    fun createLottoTest() {
        //then
        val expectedLottoFee: Int = 5000;
        val expectedLottoNumbersSize: Int = 6;

        //when
        val lotto = lottoMachine.createLotto();

        //given
        assertEquals(expectedLottoFee, lotto.fee);
        assertEquals(expectedLottoNumbersSize, lotto.numbers.size);
    }

}