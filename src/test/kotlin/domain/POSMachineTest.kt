package domain

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.lang.IllegalArgumentException

internal class POSMachineTest {

    private val posMachine: POSMachine = POSMachine(createMarketWithRandomLottoMachine());

    @Test
    fun throwExceptionIfNotEnoughMoney() {
        //given
        val money = 9000;
        val count = 2;
        val expectedErrorMessage = "금액이 부족합니다. 다시 한번 확인해주세요."

        //when
        val exception = assertThrows(IllegalArgumentException::class.java) {
            posMachine.calculate(money, count)
        }

        //then
        assertEquals(expectedErrorMessage, exception.message);
    }

}