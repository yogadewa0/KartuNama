package com.example.utskartunama

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.utskartunama.ui.theme.UTSKartuNamaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UTSKartuNamaTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    KartuNama(
                        stringResource(R.string.full_name),
                        stringResource(R.string.title)
                    )
                }
            }
        }
    }
}

@Composable
fun KartuNama(name: String,
              title: String,
              modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxSize().
        background(colorResource(R.color.mint)).
        padding(horizontal = 24.dp, vertical = 16.dp)
    ) {
        // Upper main page (Profile Pic, Full Name, Title)
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.align(Alignment.Center)
        ) {
            // Image black background
            Box(modifier = Modifier
                    .size(95.dp)
                    .clip(RoundedCornerShape(8.dp))
                    .background(colorResource(R.color.dark_tile)),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(R.drawable.android_logo),
                    contentDescription = null,
                    modifier = Modifier.size(65.dp)
                )
            }
            Text(
                text = name,
                fontSize = 38.sp,
                fontWeight = FontWeight.ExtraBold,
                textAlign = TextAlign.Center,
                color = colorResource(R.color.stone_black)
            )
        }

        // Bottom Contact list
        Column(

        ) {  }
    }
}

@Preview(showBackground = true)
@Composable
fun KartuNamaPreview() {
    UTSKartuNamaTheme {
        KartuNama(
            stringResource(R.string.full_name),
            stringResource(R.string.title)
        )
    }
}