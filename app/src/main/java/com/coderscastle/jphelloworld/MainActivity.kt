package com.coderscastle.jphelloworld

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            HelloWorld("Hello World")
        }
    }
}

@Composable
fun HelloWorld( name :String){
Text(
    text = name,
    fontStyle = FontStyle.Italic,
    fontSize = 30.sp,
    fontWeight = FontWeight.Medium,
    color = Color.Magenta,
    fontFamily = FontFamily.SansSerif,
    modifier = Modifier.padding(start = 100.dp, top = 50.dp, end = 20.dp, bottom = 20.dp)
)
}

@Preview (showBackground = true , showSystemUi = true)
@Composable
fun HelloWorldPreview (){
HelloWorld("Hello World")
}