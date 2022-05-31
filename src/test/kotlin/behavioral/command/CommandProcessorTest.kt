package behavioral.command
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*


internal class CommandProcessorTest {


    var commandProcessor = CommandProcessor();
//    private val queue = ArrayList<OrderCommand>()


    @Test
    fun addToQueue(){
        commandProcessor.addToQueue(OrderAddCommand(1))
        assertEquals(1, commandProcessor.queue())
    }

    @Test

    fun checkingNotNull(){

        assertNotNull(commandProcessor)
        assertNotNull((OrderPayCommand(1L)))

    }

    @Test

    //Testing of the command is being processed in the queue
    fun testProcessQueue(){
        commandProcessor.processCommands()
        assertEquals(0,commandProcessor.queue())
    }

}