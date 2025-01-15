package com.moali.basehelper.prices.presentation.curreencys_list.components
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Scaffold
import androidx.compose.material.Tab
import androidx.compose.material.TabRow
import androidx.compose.material.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.moali.basehelper.prices.presentation.curreencys_list.CurrencyListState
import com.moali.basehelper.ui.theme.AppTypography
import com.moali.basehelper.ui.theme.Padding
import com.moali.basehelper.ui.theme.Spacing
import basehelper.composeapp.generated.resources.Res
import basehelper.composeapp.generated.resources.coinGold1
import org.jetbrains.compose.resources.painterResource

@Composable
fun CurrencyListView(
    state: CurrencyListState
) {
    val rates = remember {
        listOf(
            "12 عيار" to "258",
            "14 عيار" to "390",
            "18 عيار" to "072",
            "21 عيار" to "585",
            "24 عيار" to "097",
        )
    }

    Scaffold(
        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues)
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Box (
                    modifier = Modifier
                        .clip(RoundedCornerShape(50.dp))
                        .background(MaterialTheme.colorScheme.primary)
                        .padding(4.dp)
                ){
                    TabRow(
                        selectedTabIndex = state.selectedTabIndex,
                        backgroundColor = MaterialTheme.colorScheme.primary,
                        contentColor = Color.White,
                        modifier = Modifier.clip(RoundedCornerShape(50.dp)).width(130.dp),
                        indicator = {  }
                    ) {
                        Tab(
                            selected = false,
                            onClick = {

                            },
                            modifier = Modifier
                                .background(
                                    color = if(state.selectedTabIndex==1) Color(0xFFFFC107) else MaterialTheme.colorScheme.primary,
                                    shape = RoundedCornerShape(90.dp)
                                )
                        ) {
                            Text(
                                "الفضه",
                                color = if(state.selectedTabIndex==1) Color.Black else Color.White,
                                modifier = Modifier.padding(2.dp)
                            )
                        }
                        Tab(
                            selected = false,
                            onClick = { /* TODO */ },
                            modifier = Modifier
                                .background(
                                    color = if(state.selectedTabIndex==0) Color(0xFFFFC107) else MaterialTheme.colorScheme.primary,
                                    shape = RoundedCornerShape(90.dp)
                                )

                        ) {
                            Text(
                                "الذهب",
                                fontWeight = FontWeight.Bold,
                                color = if(state.selectedTabIndex==0) Color.Black else Color.White,
                                modifier = Modifier.padding(2.dp)
                            )
                        }

                    }
                }
                Spacer(modifier = Modifier.height(Spacing.medium))
                NisabCard()
                Spacer(modifier = Modifier.height(Spacing.large))
                FeaturesGrid()
                Spacer(modifier = Modifier.height(16.dp))
                rates.forEach { (type, rate) ->
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = Padding.tiny),
                        shape = RoundedCornerShape(16),
                        elevation = 4.dp
                    ) {
                        Row(
                            modifier = Modifier
                                .padding(horizontal = Padding.large, vertical =Padding.small )
                                .align(Alignment.Start),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Column (
                                horizontalAlignment = Alignment.CenterHorizontally
                            ){
                                Text(
                                    "بيع",
                                    style = AppTypography.small
                                )
                                Spacer(modifier = Modifier.height(Spacing.tiny))
                                Text(
                                    rate,
                                    style = AppTypography.small,
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.primary
                                )
                            }
                            Row (
                                verticalAlignment = Alignment.CenterVertically
                            ){

                                Text(type, fontWeight = FontWeight.Bold)
                                Spacer(modifier = Modifier.width(Spacing.large))
                                Image(
                                    modifier = Modifier
                                        .size(30.dp)
                                        .clip(RoundedCornerShape(50.dp))
                                        .background(Color.White),
                                    painter = painterResource(Res.drawable.coinGold1),
                                    contentDescription = "Logo"
                                )
                            }

                        }
                    }
                }
            }
        }
    )
}


