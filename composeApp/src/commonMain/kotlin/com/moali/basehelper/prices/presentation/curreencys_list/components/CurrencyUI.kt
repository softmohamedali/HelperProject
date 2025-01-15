package com.moali.basehelper.prices.presentation.curreencys_list.components

import com.moali.basehelper.prices.domain.models.Currency

data class CurrencyUI(
    val id:String,
    val rank:Int,
    val name:String,
    val symbol:String,
    val marketCap:DisplayableNumber,
    val price:DisplayableNumber,
    val changePercent24HR:DisplayableNumber
)


data class DisplayableNumber(
    val value:Double,
    val formated:String
)


fun Currency.toCurrencyUI():CurrencyUI{
    return CurrencyUI(
        id = id,
        rank=rank,
        name=name,
        symbol =symbol,
        marketCap =marketCap.toDisplayableNumber(),
        price = price.toDisplayableNumber(),
        changePercent24HR = changePercent24HR.toDisplayableNumber()
    )
}

fun Double.toDisplayableNumber():DisplayableNumber{
    val formatter=formatDouble(this)
    return DisplayableNumber(
        this,
        formatter
    )
}



fun formatDouble(number: Double): String {
    val parts = number.toString().split(".")
    val integerPart = parts[0].reversed().chunked(3).joinToString(",").reversed()
    val decimalPart = if (parts.size > 1) ".${parts[1]}" else ""
    return integerPart + decimalPart
}