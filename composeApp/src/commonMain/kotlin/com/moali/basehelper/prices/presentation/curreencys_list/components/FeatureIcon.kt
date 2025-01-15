package com.moali.basehelper.prices.presentation.curreencys_list.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.moali.basehelper.ui.theme.AppTypography
import com.moali.basehelper.ui.theme.Spacing
import basehelper.composeapp.generated.resources.Res
import basehelper.composeapp.generated.resources.calc2
import basehelper.composeapp.generated.resources.moneyBag4
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.painterResource

@Composable
fun FeaturesGrid() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        FeatureIcon(
            "حاسبة مصنعية الذهب",
            iconRes = Res.drawable.calc2
        )
        FeatureIcon(
            "احسب قيمة زكاتك",
            iconRes = Res.drawable.moneyBag4
        )
    }
}


@Composable
fun FeatureIcon(label: String, iconRes: DrawableResource) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            painter = painterResource(iconRes), // Replace with actual icon
            contentDescription = label,
            modifier = Modifier.size(48.dp)
        )
        Spacer(modifier = Modifier.height(Spacing.small))
        Text(
            label,
            style = AppTypography.body,
            textAlign = TextAlign.Center
        )
    }
}
