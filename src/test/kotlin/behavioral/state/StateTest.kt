package behavioral.state

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test


internal class StateTest {

    @Test
    fun State() {

        val authorizationPresenter = AuthorizationPresenter()

        authorizationPresenter.loginUser("admin")

        assertThat(authorizationPresenter.isAuthorized).isEqualTo(true)
        assertThat(authorizationPresenter.userName).isEqualTo("admin")

        authorizationPresenter.logoutUser()
        println(authorizationPresenter)
        assertThat(authorizationPresenter.isAuthorized).isEqualTo(false)
        assertThat(authorizationPresenter.userName).isEqualTo("Unknown")

    }


}