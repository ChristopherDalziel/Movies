package to.dev.example

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test


class MainAppTest {
    @Test
    fun`Given value a and value b, When ADD is called, Then a combination of the two values should be returned`() {
       val result = CalculatorComponent().add(10.00, 10.00)
        assertThat(result).isEqualTo(10.00 + 10.00)
    }

    @Test
    fun`Given value a and value b, When SUBTRACT is called, Then a valueA is taken away from valueB`() {
        val result = CalculatorComponent().subtract(10.00, 5.00)
        assertThat(result).isEqualTo(10.00 - 5.00)
    }

    @Test
    fun`Given value a and value b, When MULTIPLY is called, Then a valueA is taken away from valueB`() {
        val result = CalculatorComponent().multiply(10.00, 10.00)
        assertThat(result).isEqualTo(10.00 * 10.00)
    }

    @Test
    fun`Given value a and value b, When DIVIDE is called, Then a valueA is taken away from valueB`() {
        val result = CalculatorComponent().divide(5.00, 2.50)
        assertThat(result).isEqualTo(5.00 / 2.50)
    }
}