package com.moali.basehelper.core.util


fun String.capitalizeFirstLetter(): String {
    return lowercase().replaceFirstChar { if (it.isLowerCase()) it.titlecase() else it.toString() }
}

//
//fun Long.convertLongToFormattedDate(): String {
//    val instant = Instant.fromEpochMilliseconds(this)
//    val localDateTime = instant.toLocalDateTime(TimeZone.currentSystemDefault())
//    val monthAbbreviation = localDateTime.month.name.substring(0, 3)
//    val formattedDate = "${monthAbbreviation} ${localDateTime.dayOfMonth}/${localDateTime.year}"
//    return formattedDate
//}
//
