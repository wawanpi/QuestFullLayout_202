package com.example.p3ex


import android.telecom.Call.Details
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.w3c.dom.Text


@Preview(showBackground = true)
@Composable
fun Layout(modifier: Modifier = Modifier){
    Column(modifier = modifier.fillMaxSize()) {
        TampilanHeader()
        DetailMhasiswa(
            judul = "Nama",
            isinya = "Muhammad Agus Kurniawan"
        )
            DetailMhasiswa(
            judul = "Nim",
            isinya = "20220140202"
        )
        DetailMhasiswa(
            judul = "Alamat",
            isinya = "Riau"
        )
        DetailMhasiswa(
            judul = "email",
            isinya = "Muhaguskurniawan@gmail.com"
        )
    }
}


@Composable
fun TampilanHeader(){
    Box(modifier = Modifier
        .fillMaxWidth()
        .background(Color.DarkGray)
    ){
      Row {
         Box(
             contentAlignment = Alignment.BottomEnd
         ){
             Image(painterResource(R.drawable.umy),
                 contentDescription = null,
                 modifier = Modifier.size(100.dp))
             Icon(Icons.Default.Done,
                 contentDescription = null,
                 Modifier .size(50.dp),
                 tint = Color.Red,
                 )
         }
         Column(modifier = Modifier.padding(16.dp)){
             Text("Teknologi Informasi",
                 color = Color.White,
                 fontSize = 20.sp)
             Spacer(modifier = Modifier.padding(3.dp))
             Text("Universitas Muhammadiyah Yogyakarta",
                 color = Color.White,
                 fontSize = 20.sp)
         }
        }
    }
}

@Composable
fun DetailMhasiswa(
    judul: String ,
    isinya: String,
){
    Row(modifier = Modifier.fillMaxWidth()
        .padding(16.dp),
         horizontalArrangement = Arrangement.SpaceBetween){
        Text(judul,modifier = Modifier )
        Text(" : ")
        Text(isinya, modifier = Modifier)
    }
}