package com.moali.basehelper.shared.utils

import androidx.compose.runtime.Composable

@Composable
expect fun MyAppTheme(
    darkTheme:Boolean,
    dynamicColor:Boolean,
    content:@Composable ()->Unit
)
