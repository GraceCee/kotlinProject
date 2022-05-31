package behavioral.state

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*


internal class StateTest {

    val authorizationPresenter = AuthorizationPresenter()


    @Test
    fun isUserAuthorized(){

        authorizationPresenter.loginUser("Grace")
        assertTrue(authorizationPresenter.isAuthorized)

    }

    @Test
    fun isUserNotAuthorized(){
        authorizationPresenter.logoutUser()
        assertFalse(authorizationPresenter.isAuthorized)
    }

    @Test

    fun checkingUsers(){
        authorizationPresenter.loginUser("Grace")
        assertEquals("Grace", authorizationPresenter.userName)

        authorizationPresenter.logoutUser()
        assertEquals("Who You?",authorizationPresenter.userName)
    }
}