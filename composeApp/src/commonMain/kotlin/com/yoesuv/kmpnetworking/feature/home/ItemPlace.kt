package com.yoesuv.kmpnetworking.feature.home

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yoesuv.kmpnetworking.core.models.PlaceModel

@Composable
fun ItemPlace(placeModel: PlaceModel?, onItemClick: () -> Unit) {
    Box(modifier = Modifier.fillMaxWidth().padding(horizontal = 8.dp, vertical = 4.dp).clickable {
        onItemClick()
    }) {
        Text(
            "${placeModel?.name}", style = TextStyle(
                fontSize = 16.sp,
            )
        )
    }
}