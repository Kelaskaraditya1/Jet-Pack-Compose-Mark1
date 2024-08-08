package com.starkindustries.jetpackcomposemark1
import android.media.Image
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.ColorLong
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ComposeCompilerApi
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.starkindustries.jetpackcomposemark1.ui.theme.JetPackComposeMark1Theme
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }
}

// text compose

//@Preview(showSystemUi = true, showBackground = true)
//@Composable
//fun FirstCompose(){
//    Text(text = "I am Ironman",
//        fontFamily = FontFamily.Monospace,
//        fontSize = 20.sp,
//        fontWeight = FontWeight.Bold,
//        textAlign = TextAlign.Right,
//        maxLines = 2,
//        color = Color.Red
//    )
//
//}

// Image Compose

//@Preview(showSystemUi = true, showBackground = true)
//@Composable
//fun ThirdCompose(){
//    Image(painter = painterResource(id = R.drawable.batman),
//        contentDescription = "I am Baman"
//    , colorFilter = ColorFilter.tint(Color.Red))
//}


// Button Compose

//@Preview(showSystemUi = true, showBackground = true)
//@Composable
//fun ButtonCompose(){
//    Button(onClick = { Log.d("Count","I am Ironman")},
//        colors = ButtonDefaults.buttonColors(
//        contentColor = Color.White,
//        containerColor = Color.Gray)
//    , enabled = true) {
//        Text(text = "Batman")
//        Image(painter = painterResource(id = R.drawable.batman), contentDescription = "I am Batman"
//        , colorFilter = ColorFilter.tint(Color.Red))
//    }
//}

// EditText

//@Preview(showBackground = true, showSystemUi = true)
//@Composable
//fun EditTextCompose(){
//    val state = remember{mutableStateOf("")}
//    TextField(value = state.value, onValueChange = {
//        state.value=it
//    },
//        label = { Text(text = "Enter message")})
//
//}

// Column Compose


@Composable
@Preview(showBackground = true, showSystemUi = true)
fun ColumnCompose(){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Ironman")
        Text(text = "Batman")
    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun RowCompose(){
    Row(modifier = Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically) {
        Text(text = "Ironman")
        Text(text = "Batman")
    }
}

