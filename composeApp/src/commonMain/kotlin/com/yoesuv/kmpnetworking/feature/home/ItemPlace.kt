package com.yoesuv.kmpnetworking.feature.home

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.yoesuv.kmpnetworking.core.models.PlaceModel

@Composable
fun ItemPlace(placeModel: PlaceModel?, onItemClick: () -> Unit) {
    Box(modifier = Modifier.fillMaxWidth().clickable {
        onItemClick()
    }) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            AsyncImage(
                model = placeModel?.thumbnailUrl,
                contentDescription = placeModel?.name,
                modifier = Modifier.size(60.dp)
            )
            Column(modifier = Modifier.padding(horizontal = 10.dp)) {
                Text(
                    "${placeModel?.name}", style = TextStyle(
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                    )
                )
                Text(
                    "${placeModel?.name}", style = TextStyle(
                        fontSize = 14.sp,
                        color = Color.Black,
                    )
                )
            }
        }
    }
}