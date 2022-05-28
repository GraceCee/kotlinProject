package behavioral.state

/**
 *
 * Sealed classes and interfaces represent restricted class hierarchies that provide more control
 * over inheritance. All direct subclasses of a sealed class are known at compile time.
 * No other subclasses may appear after a module with the sealed class is compiled.
 */

sealed class AuthorizationState