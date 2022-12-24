package com.example.springbootbankexample.service

import com.example.springbootbankexample.datasource.BankDataSource
import com.example.springbootbankexample.model.Bank
import org.springframework.stereotype.Service

@Service
class BankService(private val dataSource: BankDataSource) {
    fun getBanks(): Collection<Bank>  = dataSource.retrieveBanks()

    fun getBank(accountNumber: String): Bank = dataSource.retrieveBank(accountNumber)
}