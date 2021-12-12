package com.rafaelLucasASRamon.criptomoeda

import java.io.Serializable

const val TRANSACTION_AVERAGE_MODEL_KEY = "TRANSACTION_AVERAGE_MODEL"

class CryptoTransactionAverage(
    val code: String,
    val total: Double,
    val average: Double
): Serializable {
}