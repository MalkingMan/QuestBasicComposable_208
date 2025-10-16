package com.example.tataletak

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.unit.dp
import androidx.compose.ui.draw.shadow
import androidx.compose.foundation.shape.CircleShape



@Composable
fun TataletakColumn(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(20.dp)) {
        Text(text = "Komponen1")
        Text(text = "Komponen2")
        Text(text = "Komponen3")
        Text(text = "Komponen4")
    }
}

@Composable
fun TataletakRow(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(text = "Komponen1")
        Text(text = "Komponen2")
        Text(text = "Komponen3")
        Text(text = "Komponen4")
    }
}

@Composable
fun TataletakBox(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Box 1")
        Text(text = "Column 1")
        Text(text = "Row 1")
        Text(text = "Box 2")
        Text(text = "Column 2")
    }
}

@Composable
fun TataletakColumnRow(modifier: Modifier = Modifier) {
    Column {
        // Baris 1
        Row(
            modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(text = "Komponen1Baris1")
            Text(text = "Komponen2Baris1")
            Text(text = "Komponen3Baris1")
        }

        // Baris 2
        Row(
            modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(text = "Komponen1Baris2")
            Text(text = "Komponen2Baris2")
            Text(text = "Komponen3Baris2")
        }
    }
}

@Composable
fun TataletakRowColumn(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        // Kolom 1
        Column {
            Text(text = "Komponen1Kolom1")
            Text(text = "Komponen2Kolom1")
            Text(text = "Komponen3Kolom1")
        }

        // Kolom 2
        Column {
            Text(text = "Komponen1Kolom2")
            Text(text = "Komponen2Kolom2")
            Text(text = "Komponen3Kolom2")
        }
    }
}

@Composable
fun TataletakBoxColumnRow(modifier: Modifier = Modifier) {
    val logo = painterResource(id = R.drawable.notasibalok)
    val foto = painterResource(id = R.drawable.foto)

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        // Konten utama
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            // Judul dan subjudul
            Text(
                text = "Login",
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.SansSerif
            )

            Text(
                text = "Ini adalah halaman login",
                fontSize = 16.sp,
                color = Color.Gray
            )

            Spacer(modifier = Modifier.height(20.dp))

            // Logo universitas
            Image(
                painter = logo,
                contentDescription = "Logo UMY",
                modifier = Modifier
                    .size(150.dp)
                    .shadow(8.dp, shape = CircleShape) // Tambah bayangan lembut
                    .clip(CircleShape) ,                // Pastikan tetap berbentuk bulat

                        contentScale = ContentScale.Fit
            )

            Spacer(modifier = Modifier.height(20.dp))

            // Nama dan NIM
            Text(
                text = "Nama",
                color = Color.Red,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = "Muhammad Array Al-khozini",
                color = Color.Blue,
                fontSize = 18.sp,
                fontWeight = FontWeight.Medium
            )

            Text(
                text = "20190140105",
                color = Color.Black,
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(30.dp))

            Image(
                painter = foto,
                contentDescription = "Foto Profil",
                modifier = Modifier
                    .size(230.dp)
                    .clip(androidx.compose.foundation.shape.CircleShape)
                    .background(Color.LightGray),
                contentScale = ContentScale.Crop
            )


        }

        // Tombol hijau kanan bawah
        Box(
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(24.dp)
                .size(55.dp)
                .background(color = Color(0xFF00C853), shape = androidx.compose.foundation.shape.CircleShape),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "↻",
                color = Color.White,
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}
