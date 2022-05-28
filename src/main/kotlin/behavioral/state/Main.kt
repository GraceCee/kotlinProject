package behavioral.state

fun main(){
    val authorizationPresenter = AuthorizationPresenter()

    authorizationPresenter.loginUser("admin")
    println(authorizationPresenter)

    authorizationPresenter.logoutUser()
    println(authorizationPresenter)
}