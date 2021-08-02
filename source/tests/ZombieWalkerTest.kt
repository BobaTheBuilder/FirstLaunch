import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ZombieWalkerTest {
    @Test
    fun `Should return string with exact same speed and name of walker specified in ZombieWalker class`() {
        val speed = 30

        val actual = ZombieWalker(speed).walk()
        val expected = "I`m a zombie walker, and my speed is $speed km/h"
        assertEquals(expected, actual)
    }
}
