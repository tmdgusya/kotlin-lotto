package generator

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue


internal class LottoNumberGeneratorKtTest {

    private val lottoNumberGenerator: LottoNumberGenerator = RandomLottoNumberGenerator();


    @Test
    fun verifyGenerateLottoNumBetweenOneToFortyFive() {
        //given

        //when
        val randomLottoNum: Int = lottoNumberGenerator.getRandomLottoNum();

        //then
        assertTrue(randomLottoNum >= 1);
        assertTrue(randomLottoNum <= 45);
    }

    @Test
    fun verifyLottoNumbersSixSize() {
        //given
        val defaultLottoNumberSize = 6;

        //when
        val lottoNumbers: IntArray = lottoNumberGenerator.generateNumbers();

        //then
        assertEquals(lottoNumbers.size, defaultLottoNumberSize);
    }

}