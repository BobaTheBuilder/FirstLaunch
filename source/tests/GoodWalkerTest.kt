import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class GoodWalkerTest {
    @Test
    fun `Should return string with exact same speed and name of walker specified in GoodWalker class`() {
        val speed = 10

        val actual = GoodWalker(speed)
        val expected = "I`m a good walker, and my speed is $speed km/h"
        assertEquals(expected, actual.walk())
    }
}
