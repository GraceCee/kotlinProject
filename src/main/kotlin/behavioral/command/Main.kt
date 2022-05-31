package behavioral.command

/**
 * The command pattern is used to express a request, including the call to be made and all
 * of its required parameters, in a command object.
 * The command may then be executed immediately or held for later use.
 */


fun main(){
    CommandProcessor()
        .addToQueue(OrderAddCommand(1L))
        .addToQueue(OrderAddCommand(2L))
        .addToQueue(OrderPayCommand(2L))
        .addToQueue(OrderPayCommand(1L))

        .processCommands()





}