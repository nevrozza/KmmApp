package ktor

import io.ktor.client.engine.*

internal actual class HttpEngineFactory actual constructor() {
    fun createEngine(): HttpClientEngineFactory<HttpClientEngineConfig> = Ios
}