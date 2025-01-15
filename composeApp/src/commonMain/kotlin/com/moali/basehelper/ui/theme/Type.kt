package com.moali.basehelper.ui.theme

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

object AppTypography {
    val h1 = TextStyle(
        fontSize = 32.sp,
        fontWeight = FontWeight.Bold
    )
    val h2 = TextStyle(
        fontSize = 24.sp,
        fontWeight = FontWeight.SemiBold
    )
    val body = TextStyle(
        fontSize = 16.sp,
        fontWeight = FontWeight.Normal
    )

    val small = TextStyle(
        fontSize = 12.sp,
        fontWeight = FontWeight.Light
    )

    val mini = TextStyle(
        fontSize = 10.sp,
        fontWeight = FontWeight.Light
    )
}


object Spacing {
    val tiny = 4.dp
    val small = 8.dp
    val medium = 16.dp
    val large = 24.dp
    val extraLarge = 32.dp
    val xextraLarge = 38.dp
}


object Padding {
    val tiny = 4.dp
    val small = 8.dp
    val medium = 16.dp
    val large = 24.dp
    val extraLarge = 32.dp
    val xextraLarge = 38.dp
}

