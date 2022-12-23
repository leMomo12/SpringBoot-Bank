package com.example.springbootbankexample.datasource.mock

import com.example.springbootbankexample.datasource.BankDataSource
import com.example.springbootbankexample.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource: BankDataSource {

    val banks = listOf(
        Bank("1234", 1.0, 1),
        Bank("1010", 4.0, 0),
        Bank("5647", 0.0, 10)
    )

    override fun retrieveBanks(): Collection<Bank> {
        return banks
    }
}