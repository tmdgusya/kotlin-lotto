package generator

import org.junit.jupiter.api.Test
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

}