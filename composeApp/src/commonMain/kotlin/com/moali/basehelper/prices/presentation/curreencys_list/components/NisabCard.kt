package com.moali.basehelper.prices.presentation.curreencys_list.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.moali.basehelper.ui.theme.AppTypography
import com.moali.basehelper.ui.theme.Padding
import com.moali.basehelper.ui.theme.Spacing
import basehelper.composeapp.generated.resources.Res
import basehelper.composeapp.generated.resources.mosque
import org.jetbrains.compose.resources.painterResource


@Composable
fun NisabCard() {
    Box(
        modifier = Modifier.fillMaxWidth()
    ) {
        Card(
            backgroundColor = MaterialTheme.colorScheme.primary,
            shape = RoundedCornerShape(12.dp),
            modifier = Modifier.fillMaxWidth().padding(bottom = Padding.large)
        )  {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth().padding(8.dp)
            ) {
                Image(
                    modifier = Modifier
                        .size(70.dp)
                        .clip(RoundedCornerShape(50.dp))
                        .background(Color.White)
                        .padding(Padding.small),
                    painter = painterResource(Res.drawable.mosque),
                    contentDescription = "Logo"
                )
                Column(
                    modifier = Modifier.padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "قيمة نصاب الذهب هي ما يعادل 85 جرامًا من الذهب عيار 24",
                        style = AppTypography.body,
                        color = Color.White,
                        textAlign = TextAlign.Right
                    )

                }
            }
        }
        Row (
            modifier = Modifier.align(Alignment.BottomEnd),
        ){
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(50.dp))
                    .background(Color(0xFFFFC107))
                    .padding(8.dp),
            ){
                Text(
                    "نصاب الذهب",
                    style = AppTypography.body,
                )
            }
            Spacer(modifier = Modifier.width(Spacing.extraLarge))
        }
    }
}
