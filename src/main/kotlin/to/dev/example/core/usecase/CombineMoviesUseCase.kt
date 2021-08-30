package to.dev.example.core.usecase

class CombineMoviesUseCase {
}

//eg:
//class VerifyPasswordResetCodeUseCase @Inject constructor(
//    private val userService: UserService,
//    val passwordResetWorkerAppConfiguration: PasswordResetWorkerAppConfiguration
//) {
//
//    private companion object {
//        const val SMS = "sms"
//        const val DEFAULT_CONNECTION = "Username-Password-Authentication"
//    }
//
//    fun invoke(email: String, code: String): String {
//        if (userService.getFailedResetCount(email) >= passwordResetWorkerAppConfiguration.maximumFailed2faAttempts) {
//            throw UserBlockedException(message = "Too many attempts")
//        }
//        val users = userService.getAllUserIdentites(email)
//        val smsIdentities = users.filter { it.connection == SMS }
//        val userIdentity = users.filter { it.connection == DEFAULT_CONNECTION }
//
//
//        when {
//            userIdentity.isEmpty() -> throw BadRequestException(message = "Cannot find a valid user")
//            smsIdentities.isEmpty() -> throw BadRequestException(message = "2FA is not initialised")
//            else -> userService.verifyTwoFactor(phone = smsIdentities.first().username,
//                code = code, email = email)
//        }
//
//        userService.clearFailedResetCount(email)
//        return userService.getPasswordChangeUrl(userIdentity.first().userId)
//
//    }
//}