package com.samirankumar11.uikitshowcase.utils.log
import com.samirankumar11.uikitshowcase.BuildConfig
import timber.log.Timber

object AppLogger {

    fun init() {
        if (BuildConfig.DEBUG) {
            Timber.plant(object : Timber.DebugTree() {

                override fun log(
                    priority: Int,
                    tag: String?,
                    message: String,
                    t: Throwable?
                ) {
                    val element = Throwable().stackTrace[5]

                    val formattedMessage = buildString {
                        appendLine("-----------------------------------------------------")
                        appendLine("(${element.fileName}:${element.lineNumber}) fun: ${element.methodName}")
                        appendLine()
                        appendLine(message)
                        appendLine("-----------------------------------------------------")
                    }

                    super.log(priority, tag, formattedMessage, t)
                }
            })
        }
    }

    fun d(message: String) = Timber.d(message)
    fun e(message: String, throwable: Throwable? = null) =
        Timber.e(throwable, message)

    fun i(message: String) = Timber.i(message)
}