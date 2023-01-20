package ktor

import io.ktor.client.engine.*

internal expect class HttpEngineFactory actual constructor() {
    fun createEngine(): HttpClientEngineFactory<HttpClientEngineConfig>
}