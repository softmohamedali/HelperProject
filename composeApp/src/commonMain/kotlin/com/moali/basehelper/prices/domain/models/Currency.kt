package com.moali.basehelper.prices.domain.models

data class Currency(
    val id:String,
    val rank:Int,
    val name:String,
    val symbol:String,
    val marketCap:Double,
    val price:Double,
    val changePercent24HR:Double
) {
}