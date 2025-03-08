package com.example.atry

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
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
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.atry.ui.theme.TryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TryTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    var isInWatchList by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier.fillMaxWidth())
        {
    Box(
        modifier = Modifier
            .fillMaxWidth(),
        contentAlignment = Alignment.TopCenter

    ) {
        Image(
            painter = painterResource(id = R.drawable.project),
            contentDescription = "Project Picture",
            modifier = Modifier.fillMaxWidth(),
            contentScale = ContentScale.Crop
        )
    }
    Text(
        text = "Ein Fest Fürs Leben",
        modifier = modifier,
        color = Color.Black,
        fontSize = 42.sp,
        textAlign = TextAlign.Justify
    )
Row(
    modifier = Modifier
        .fillMaxWidth()
        .padding(8.dp),
){
    Text(
        text = "2023",
        modifier = modifier,
        color = Color.Black,
        fontSize = 32.sp,
        textAlign = TextAlign.Justify
    )
    Spacer(modifier = Modifier.width(16.dp))

    Box(
        modifier = Modifier
            .background(Color.Gray)
            .padding(6.dp),
        contentAlignment = Alignment.Center

    ){
    Text(
        text = "720p",
        color = Color.White
    )}

    Spacer(modifier = Modifier.width(16.dp))

    Box(
        modifier = Modifier
            .background(Color.Gray)
            .padding(6.dp),
        contentAlignment = Alignment.CenterEnd
    ) {
        Text(
            text = "1080p",
            color = Color.White
        )
    }
}
                Button(onClick = {},
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(3.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = Color.Black)

                )


                {
                    Icon(
                        painter = painterResource(id = R.drawable.play),
                        contentDescription = "Play",
                        modifier = Modifier
                            .padding(10.dp)
                            .size(15.dp)
                    )

                    Text("Play", color = Color.White)
                }
                Button(onClick = {},
                        modifier = Modifier
                        .fillMaxWidth()
                    .padding(3.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Black))
                {
                    Icon(
                        painter = painterResource(id = R.drawable.download),
                        contentDescription = "Play",
                        modifier = Modifier
                            .padding(10.dp)
                            .size(15.dp)
                    )
                    Text("Download", color = Color.White)

                }
            Text(
                text = "A fast-paced ensemble comedy about a wedding planner and his thrown-together crew whose meticulously planned celebration gets way out of hand.",
                modifier = modifier
                    .padding(10.dp),
                color = Color.Black,
                fontSize = 20.sp,
                textAlign = TextAlign.Left
            )

            Button(onClick = {
                isInWatchList = !isInWatchList

            },
                modifier = Modifier
                    .padding(5.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Black),
            ){
                Icon(
                    painter = painterResource(id = R.drawable.watch),
                    contentDescription = if (isInWatchList) "Remove from Watch List" else "Add to Watch List",
                    tint = Color.Gray,
                    modifier = Modifier
                        .padding(10.dp)
                        .size(25.dp)
                )
                Text(
                    text = if (isInWatchList) "Remove Watch" else "Watch List",
                    color = Color.White
                )
            }

}

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TryTheme {
        Greeting("Android")
    }
}