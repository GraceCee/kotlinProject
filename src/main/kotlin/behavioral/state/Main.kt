package behavioral.state

fun main(){
    val authorizationPresenter = AuthorizationPresenter()

    authorizationPresenter.loginUser("grace")
    println(authorizationPresenter)

    authorizationPresenter.logoutUser()
    println(authorizationPresenter)
}