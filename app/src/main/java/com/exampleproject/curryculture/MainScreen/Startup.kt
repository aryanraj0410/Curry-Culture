package com.exampleproject.curryculture.MainScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.exampleproject.curryculture.R
import com.exampleproject.curryculture.commonui.CommonButton
import com.exampleproject.curryculture.ui.theme.orange

@Composable
fun Startup(navController: NavController){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(orange),
        verticalArrangement = Arrangement.SpaceBetween
    )
    {
        Column( modifier = Modifier
            .fillMaxWidth()
            .padding(top = 10.dp)
            .padding(horizontal = 20.dp)
        )
        {
            Image(
                painter = painterResource(id = R.drawable.iconn__1_), contentDescription = null,
                modifier = Modifier
                    .size(73.dp)
                    .clip(CircleShape),
            )
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "Curry",
                color = Color.White,
                modifier = Modifier.padding(vertical = 10.dp),
                fontWeight = FontWeight.ExtraBold,
                fontSize = 80.sp
            )
            Text(
                text = "Culture",
                color = Color.White,
                modifier = Modifier.padding(vertical = 10.dp),
                fontWeight = FontWeight.ExtraBold,
                fontSize = 80.sp
            )
        }
        Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 20.dp)
                ) {
            Row(
                modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End
            ) {
                Image(
                    painter = painterResource(id = R.drawable.india_04_removebg_preview),
                    contentDescription = "",
                    modifier = Modifier
                        .size(300.dp)
                        .offset(x = -(30.dp), y = 0.dp),
                    contentScale = ContentScale.Crop
                )
            }
            Spacer(modifier = Modifier.height(30.dp))
            CommonButton(text = "Lets Go!!", onClick = {
                navController.navigate("Login")
            })
            }
        }

    }

