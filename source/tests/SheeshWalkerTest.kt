import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SheeshWalkerTest {
    @Test
    fun `Should return string with exact same speed and name of walker specified in SheeshWalker class`() {
        val speed = 20

        val actual = SheeshWalker(speed)
        val expected = "I`m a sheesh walker, and my speed is $speed km/h"
        assertEquals(expected, actual.walk())
    }
}
