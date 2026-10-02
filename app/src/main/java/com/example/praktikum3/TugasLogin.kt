package com.example.praktikum3

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// Palet warna
private val Gold = Color(0xFFFFC857)
private val GoldSoft = Color(0xFFFFE29A)
private val Cyan = Color(0xFF4DD0E1)
private val Night = Color(0xFF0B1620)

@Composable
fun TugasLoginScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        // Background foto (ganti nama file kalau background kamu berbeda)
        Image(
            painter = painterResource(id = R.drawable.img),
            contentDescription = "Background",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.FillBounds
        )

        // Overlay gradien supaya teks lebih terbaca dan terlihat elegan
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    Brush.verticalGradient(
                        colors = listOf(
                            Night.copy(alpha = 0.85f),
                            Night.copy(alpha = 0.35f),
                            Night.copy(alpha = 0.55f),
                            Night.copy(alpha = 0.90f)
                        )
                    )
                )
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(48.dp))

            // Judul
            Text(
                text = "Login",
                fontSize = 36.sp,
                fontWeight = FontWeight.ExtraBold,
                letterSpacing = 4.sp,
                color = Color.Black,
                style = TextStyle(
                    shadow = Shadow(
                        color = Cyan.copy(alpha = 0.6f),
                        offset = Offset(0f, 0f),
                        blurRadius = 24f
                    )
                )
            )

            Spacer(modifier = Modifier.height(6.dp))

            // Garis aksen kecil di bawah judul
            Box(
                modifier = Modifier
                    .size(width = 48.dp, height = 3.dp)
                    .clip(RoundedCornerShape(50))
                    .background(Gold)
            )

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = "Ini adalah halaman login,",
                fontSize = 14.sp,
                letterSpacing = 0.5.sp,
                color = Color.Black.copy(alpha = 0.8f)
            )

            Spacer(modifier = Modifier.height(28.dp))

            Box(
                modifier = Modifier
                    .size(120.dp)
                    .shadow(12.dp, CircleShape, ambientColor = Gold, spotColor = Gold)
                    .border(3.dp, Gold, CircleShape)
                    .padding(3.dp)
                    .clip(CircleShape)
                    .background(Color.White),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.images),
                    contentDescription = "Logo UMY",
                    modifier = Modifier
                        .fillMaxSize()
                        .scale(1.25f),
                    contentScale = ContentScale.Crop
                )
            }

            Spacer(modifier = Modifier.height(28.dp))

            // Nama dan NIM
            Text(
                text = "NAMA",
                fontSize = 13.sp,
                fontWeight = FontWeight.Bold,
                letterSpacing = 4.sp,
                color = Gold
            )

            Spacer(modifier = Modifier.height(4.dp))

            Text(
                text = "Anugrah Putra Rizkia",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(12.dp))

            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(50))
                    .background(Color.White.copy(alpha = 0.12f))
                    .border(1.dp, Gold.copy(alpha = 0.6f), RoundedCornerShape(50))
                    .padding(horizontal = 22.dp, vertical = 8.dp)
            ) {
                Text(
                    text = "20240140229",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    letterSpacing = 2.sp,
                    color = GoldSoft
                )
            }

            Spacer(modifier = Modifier.height(28.dp))

            // Foto lingkaran dengan bingkai gradien dan bayangan
            Box(
                modifier = Modifier
                    .size(210.dp)
                    .shadow(20.dp, CircleShape, ambientColor = Gold, spotColor = Gold)
                    .border(
                        width = 5.dp,
                        brush = Brush.sweepGradient(listOf(Gold, Cyan, Gold, Cyan, Gold)),
                        shape = CircleShape
                    )
                    .padding(7.dp)
                    .clip(CircleShape)
                    .background(Color.White),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.img_1),
                    contentDescription = "Foto Anugrah",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop
                )
            }
        }
    }
}