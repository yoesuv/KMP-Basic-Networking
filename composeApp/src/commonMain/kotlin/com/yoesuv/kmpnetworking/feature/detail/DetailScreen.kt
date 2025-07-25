package com.yoesuv.kmpnetworking.feature.detail

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import coil3.compose.AsyncImage
import com.yoesuv.kmpnetworking.core.theme.AppColors
import com.yoesuv.kmpnetworking.feature.components.AppTopBar
import kmpnetworking.composeapp.generated.resources.Res
import kmpnetworking.composeapp.generated.resources.detail_place
import kmpnetworking.composeapp.generated.resources.placeholder_image
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailScreen(
    nav: NavHostController,
    name: String,
    description: String,
    imageUrl: String
) {
    Scaffold(
        containerColor = AppColors.EggShell,
        topBar = {
            AppTopBar(
                title = stringResource(Res.string.detail_place),
                canBack = true,
                navigateUp = {
                    nav.navigateUp()
                }
            )
        }
    ) { innerPadding ->
        Column(modifier = Modifier.padding(innerPadding)) {
            // You can use the parameters here to build your UI later
            AsyncImage(
                model = imageUrl,
                contentDescription = name,
                placeholder = painterResource(Res.drawable.placeholder_image),
                error = painterResource(Res.drawable.placeholder_image),
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxWidth().height(240.dp)
            )
            Text(
                name, style = TextStyle(
                    fontSize = 18.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.Black,
                ),
                modifier = Modifier.padding(horizontal = 16.dp).padding(top = 24.dp)
            )
            Text(
                description, style = TextStyle(
                    fontSize = 16.sp,
                    color = Color.Black
                ),
                modifier = Modifier.padding(horizontal = 16.dp).padding(top = 8.dp)
            )
            // The imageUrl and description are available for use in your UI
        }
    }
}