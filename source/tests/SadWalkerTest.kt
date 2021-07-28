import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SadWalkerTest {
    @Test
    fun `Should return string with exact same speed and name of walker specified in SadWalker class`() {
        val speed = 15

        val actual = SadWalker(speed)
        val expected = "I`m a sad walker, and my speed is $speed km/h"
        assertEquals(expected, actual.walk())
    }
}
