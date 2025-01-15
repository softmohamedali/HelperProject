//package com.moali.mahly.presentation.screens.home.components
//
//import androidx.compose.foundation.background
//import androidx.compose.foundation.clickable
//import androidx.compose.foundation.layout.Box
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.Spacer
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.layout.width
//import androidx.compose.foundation.lazy.LazyColumn
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.Info
//import androidx.compose.material.icons.filled.Settings
//import androidx.compose.material.icons.filled.Share
//import androidx.compose.material3.Icon
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.draw.clip
//import androidx.compose.ui.text.TextStyle
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//
//
//@Composable
//fun DrawerBody(
//    onItemClick: (MenuItem) -> Unit
//) {
//    Column(
//        modifier = Modifier
//            .background(MaterialTheme.colorScheme.primary)
//            .clip(
//                RoundedCornerShape(
//                    topEnd = 20.dp,
//                    bottomEnd = 20.dp
//                )
//            )
//            .fillMaxSize()
//    ) {
//        DrawerHeader(
//            modifier = Modifier.weight(1f)
//        )
//        LazyColumn(
//            modifier = Modifier
//                .weight(13f)
//        ) {
//            item {
//                DrawerBodyGroup(
//                    title = stringResource(SharedRes.strings.Date_),
//                    onItemClick = onItemClick,
//                    items = listOf(
//                        MenuItem(
//                            id = MenuItemData.CreateBackup.id,
//                            title = stringResource(MenuItemData.CreateBackup.title),
//                            contentDescription = "",
//                            icon = Icons.Default.Backup
//                        ),
//                        MenuItem(
//                            id = MenuItemData.BackupRecovery.id,
//                            title = stringResource(MenuItemData.BackupRecovery.title),
//                            contentDescription = "",
//                            icon = Icons.Default.Backup
//                        ),
//                    )
//                )
//            }
//            item {
//                DrawerBodyGroup(
//                    title =stringResource(SharedRes.strings.setting) ,
//                    onItemClick = onItemClick,
//                    items = listOf(
//                        MenuItem(
//                            id = MenuItemData.SystemSetting.id,
//                            title = stringResource(MenuItemData.SystemSetting.title),
//                            contentDescription = "",
//                            icon = Icons.Default.Settings
//                        ),
//                    )
//                )
//            }
//            item {
//                DrawerBodyGroup(
//                    title =stringResource(SharedRes.strings.About_The_App) ,
//                    onItemClick = onItemClick,
//                    items = listOf(
//                        MenuItem(
//                            id = MenuItemData.AboutTheApp.id,
//                            title = stringResource(MenuItemData.AboutTheApp.title),
//                            contentDescription = "",
//                            icon = Icons.Default.Info
//                        ),
//                        MenuItem(
//                            id = MenuItemData.RateTheApp.id,
//                            title =  stringResource(MenuItemData.RateTheApp.title),
//                            contentDescription = "",
//                            icon = Icons.Default.StarRate
//                        ),
//                        MenuItem(
//                            id = MenuItemData.ShareTheApp.id,
//                            title = stringResource(MenuItemData.ShareTheApp.title),
//                            contentDescription = "",
//                            icon = Icons.Default.Share
//                        ),
//                        MenuItem(
//                            id = MenuItemData.Privacy.id,
//                            title =stringResource( MenuItemData.Privacy.title),
//                            contentDescription = "",
//                            icon = Icons.Default.PrivacyTip
//                        ),
//                        MenuItem(
//                            id = MenuItemData.Help.id,
//                            title = stringResource(MenuItemData.Help.title),
//                            contentDescription = "",
//                            icon = Icons.Default.Help
//                        ),
//                        MenuItem(
//                            id = MenuItemData.ContactWithUs.id,
//                            title =stringResource( MenuItemData.ContactWithUs.title),
//                            contentDescription = "",
//                            icon = Icons.Default.ContactSupport
//                        )
//                    )
//                )
//            }
//        }
//    }
//}
//
//@Composable
//fun DrawerHeader(
//    modifier: Modifier = Modifier
//) {
//    Box(
//        modifier = modifier
//            .background(MaterialTheme.colorScheme.primary)
//            .fillMaxWidth()
//            .padding(12.dp)
//    ) {
//        Text(
//            text =stringResource(SharedRes.strings.app_name) ,
//            fontSize = 20.sp,
//            fontWeight = FontWeight.Bold,
//            color = MaterialTheme.colorScheme.onPrimary
//        )
//    }
//}
//
//@Composable
//fun DrawerBodyGroup(
//    title: String? = null,
//    items: List<MenuItem>,
//    modifier: Modifier = Modifier,
//    itemTextStyle: TextStyle = TextStyle(fontSize = 18.sp),
//    onItemClick: (MenuItem) -> Unit
//) {
//    Column(
//        modifier
//    ) {
//        if (title != null) {
//            Text(
//                modifier = modifier.padding(16.dp),
//                text = title,
//                style = itemTextStyle,
//                color = MaterialTheme.colorScheme.onPrimary.copy(0.5f)
//            )
//        }
//        for (item in items) {
//            Row(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .clickable {
//                        onItemClick(item)
//                    }
//                    .padding(16.dp)
//            ) {
//                Icon(
//                    imageVector = item.icon,
//                    contentDescription = item.contentDescription,
//                    tint = MaterialTheme.colorScheme.onPrimary
//                )
//                Spacer(modifier = Modifier.width(16.dp))
//                Text(
//                    text = item.title,
//                    style = itemTextStyle,
//                    modifier = Modifier.weight(1f),
//                    color = MaterialTheme.colorScheme.onPrimary
//                )
//            }
//        }
//    }
//}