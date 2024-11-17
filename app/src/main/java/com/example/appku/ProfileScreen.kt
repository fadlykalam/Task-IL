package com.example.appku

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun ProfileScreen() {
    CenterAlignedTopAppBar(title = { Text("Profile") })
    Column {
        Image(
            painter = painterResource(id = R.drawable.image_4),
            contentDescription = "Profile",
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .offset(y = 25.dp)
                .requiredWidth(width = 450.dp)
                .requiredHeight(height = 350.dp)
        )
        Text("Nama: Fadly Kalam Mustaqim")
        Text("Email: fadlykalamm012@gmail.com")
        Text("Asal Perguruan Tinggi: STT Terpadu Nurul Fikri")
        Text("Jurusan: Sistem Informasi")
    }
}