package com.example.springbootbankexample.datasource

import com.example.springbootbankexample.model.Bank

interface BankDataSource {

    fun retrieveBanks(): Collection<Bank>
}