package com.example.utskartunama

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
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
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
                        stringResource(R.string.title),
                        stringResource(R.string.phone),
                        stringResource(R.string.socmed),
                        stringResource(R.string.email),
                    )
                }
            }
        }
    }
}

@Composable
fun KartuNama(name: String,
              title: String,
              phone: String,
              socmed: String,
              email: String,
              modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxSize().
        background(colorResource(R.color.mint)).
        padding(horizontal = 24.dp, vertical = 16.dp)
    ) {
        // Upper main page (Profile Pic, Full Name, Title)
        // Program Sudah Di Test (107)
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
                    modifier = Modifier.size(70.dp)
                )
            }

            Spacer(Modifier.height(15.dp))
            Text(
                text = name,
                fontSize = 40.sp,
                fontWeight = FontWeight.ExtraBold,
                textAlign = TextAlign.Center,
                color = colorResource(R.color.stone_black)
            )
            Text(
                text = title,
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
                color = colorResource(R.color.android_green)
            )
        }

        // Bottom Contact list
        Column(
            verticalArrangement = Arrangement.spacedBy(16.dp),
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 16.dp)
        ) {  
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(Icons.Rounded.Phone, contentDescription = "Phone Icon", tint = colorResource(R.color.pine))
                Spacer(modifier = Modifier.width(24.dp))
                Text(
                    text = phone,
                    color = colorResource(R.color.stone_black)
                )
            }
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(Icons.Rounded.Share, contentDescription = "Socmed Icon", tint = colorResource(R.color.pine))
                Spacer(modifier = Modifier.width(24.dp))
                Text(
                    text = socmed,
                    color = colorResource(R.color.stone_black)
                )
            }
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(Icons.Rounded.Email, contentDescription = "Email Icon", tint = colorResource(R.color.pine))
                Spacer(modifier = Modifier.width(24.dp))
                Text(
                    text = email,
                    color = colorResource(R.color.stone_black)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun KartuNamaPreview() {
    UTSKartuNamaTheme {
        KartuNama(
            stringResource(R.string.full_name),
            stringResource(R.string.title),
            stringResource(R.string.phone),
            stringResource(R.string.socmed),
            stringResource(R.string.email),
        )
    }
}