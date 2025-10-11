package com.example.cartvisite

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.cartvisite.ui.theme.CartvisiteTheme
import  androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.foundation.layout.width
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment

import androidx.compose.foundation.layout.Box
import androidx.compose.ui.res.painterResource

import androidx.compose.foundation.Image
import  android.R.attr.contentDescription
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.layout.size
import androidx.compose.ui.draw.clip
import androidx.compose.foundation.background
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import  androidx.compose.ui.draw.shadow
import androidx.compose.ui.text.TextStyle

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CartvisiteTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->


                    CarteVisite()


                }
            }
        }
    }
}

@Composable
fun CarteVisite() {
    Box(contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF5F5F5))) {
        Column(modifier = Modifier.padding(16.dp)) {
            avatar()
            Spacer(modifier = Modifier.height(16.dp))
            infopersonnelles()
            coordonne(
                email = "mariemchalghouma@gmail.com",
                tel = "58 305 377",
                adresse = "bouargoub Nabeul " ,
                lindedin = "www.linkedin.com/in/mariem-chalghouma"
            )


        }
    }

}
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CartvisiteTheme {
        Greeting("Android")
    }
}
@Composable
fun coordonne (email : String , tel: String , adresse: String , lindedin: String , modifier:Modifier=Modifier ) {
    Column  (modifier=Modifier.padding(25.dp) ) {
        Row ( modifier=Modifier.padding(10.dp)){
        Icon(Icons.Default.Email, "Email")
            Spacer(modifier = Modifier.width(8.dp))
        Text(
            text = email,
            fontSize = 24.sp,
            lineHeight = 30.sp,
            color = Color.Black
        )}
        Row (verticalAlignment = Alignment.CenterVertically ,modifier=Modifier.padding(10.dp)) {
        Icon(Icons.Default.Phone,"telephone")
            Spacer(modifier = Modifier.width(8.dp))
        Text(
            text = tel,
            fontSize = 24.sp,
            lineHeight = 30.sp,
            color = Color.Black
        ) }
        Row (verticalAlignment = Alignment.CenterVertically ,modifier=Modifier.padding(10.dp)) {
        Icon(Icons.Default.Home ,"Adresse" )
        Spacer(modifier = Modifier.width(8.dp))
        Text(
            text = adresse,
            fontSize = 24.sp,
            lineHeight = 30.sp,
            color = Color.Black
        ) }
        Row (verticalAlignment = Alignment.CenterVertically ,modifier=Modifier.padding(10.dp)) {
        Icon(Icons.Default.AccountCircle , "linkedin")
            Spacer(modifier = Modifier.width(8.dp))
        Text(
            text = lindedin,
            fontSize = 24.sp,
            lineHeight = 30.sp,
            color = Color.Black
        ) }


    }


}
@Composable
fun infopersonnelles(modifier: Modifier=Modifier) {
    Column (horizontalAlignment = Alignment.CenterHorizontally
         ){
        Text(
            text = "mariem chalghouma  ",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF1A237E)

            )
        Text(
            text = "etudiante en 3eme technologie de l'informatique specialite développement des système d'information  ",
            fontSize = 16.sp,
            color = Color.Black,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(top = 4.dp)
        )
    }
}
@Composable
fun avatar (modifier: Modifier= Modifier) {
    val image = painterResource( R.drawable.r7tc1uylheio)
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
    ) {
    Image(
        painter = image,
        contentDescription = null,

        modifier = modifier.padding(start = 100.dp, end = 100.dp)
            .size(170.dp)
            .clip(CircleShape)
            .border(2.dp, Color(0xFF1A237E), CircleShape)
            .shadow(4.dp, CircleShape)
    ) }

}
