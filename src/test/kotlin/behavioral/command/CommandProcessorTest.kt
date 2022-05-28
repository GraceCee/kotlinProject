package behavioral.command

import assertk.assertThat
import org.junit.jupiter.api.Test


internal class CommandProcessorTest {
    @Test
    fun addToQueue() {
        //checking if command is adding to the queue
        CommandProcessor()
        assertThat (CommandProcessor().addToQueue(OrderAddCommand(1L)).processCommands())
        assertThat (CommandProcessor().addToQueue(OrderAddCommand(2L)).processCommands())
      
    }
}