package behavioral.command

import org.junit.jupiter.api.Test


internal class CommandProcessorTest {
    @Test
    fun addToQueue() {
        //check if command is adding to queue
        CommandProcessor()
            .addToQueue(OrderAddCommand(1L))
            .addToQueue(OrderAddCommand(2L))
            .addToQueue(OrderPayCommand(2L))
            .addToQueue(OrderPayCommand(1L))
            .processCommands()



      
    }
}