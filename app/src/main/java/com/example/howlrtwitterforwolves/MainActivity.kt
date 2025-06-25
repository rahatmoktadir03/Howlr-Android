package com.example.howlrtwitterforwolves

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.howlrtwitterforwolves.ui.theme.HowlrTwitterForWolvesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HowlrTwitterForWolvesTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFF0D1117)
                ) {
                    HowlrLoginScreen()
                }
            }
        }
    }
}

@Composable
fun HowlrLoginScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(Color(0xFF0D1117), Color(0xFF121212))
                )
            )
            .padding(top = 80.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Wolf logo (replace with your actual drawable name)
        Image(
            painter = painterResource(id = R.drawable.wolf_logo),
            contentDescription = "Howlr Logo",
            modifier = Modifier.size(100.dp),
            contentScale = ContentScale.Fit
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Howlr",
            fontSize = 36.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Echo your thoughts across the forest.",
            fontSize = 18.sp,
            color = Color(0xFFCCCCCC)
        )

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "Join the pack today",
            fontSize = 16.sp,
            color = Color(0xFFDDDDDD)
        )

        Spacer(modifier = Modifier.height(40.dp))

        // 🐾 Dummy Tweet Box
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp)
                .border(
                    width = 1.dp,
                    color = Color(0xFF1F6FEB), // deep GitHub-blue border
                )
                .background(Color(0xFF121212))
                .padding(16.dp)
        ) {
            Text(
                text = "@alphaWolf42",
                color = Color(0xFFBB86FC),
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = "Just howled at the moon — pure bliss. 🌕🐺 #LunarVibes",
                color = Color.White,
                fontSize = 14.sp
            )

            Spacer(modifier = Modifier.height(12.dp))

            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "84 🐾", color = Color(0xFFCCCCCC), fontSize = 12.sp)
                Text(text = "3 🦴", color = Color(0xFFCCCCCC), fontSize = 12.sp)
                Text(text = "💬", color = Color(0xFFCCCCCC), fontSize = 12.sp)
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HowlrLoginPreview() {
    HowlrTwitterForWolvesTheme {
        HowlrLoginScreen()
    }
}