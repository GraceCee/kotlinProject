package behavioral.state

fun main(){
    val authorizationPresenter = AuthorizationPresenter()

    authorizationPresenter.loginUser("Grace")
    println(authorizationPresenter)

    authorizationPresenter.logoutUser()
    println(authorizationPresenter)
}