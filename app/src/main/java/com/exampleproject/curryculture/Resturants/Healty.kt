package com.exampleproject.curryculture.Resturants

import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.exampleproject.curryculture.R
import com.exampleproject.curryculture.commonui.ExploreButton
import com.exampleproject.curryculture.ui.theme.orange

@Composable
fun Healty(){
    Surface(modifier = Modifier.fillMaxSize()) {
        Column {
            Card(modifier = Modifier
                .fillMaxWidth()
                .height(380.dp),elevation = CardDefaults.cardElevation(
                defaultElevation = 15.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White,
                ))
            {
                Column(modifier = Modifier.fillMaxSize())
                {
                    Row(modifier = Modifier.fillMaxWidth())
                    {
                        Image(painter = painterResource(id = R.drawable.rest_3), contentDescription =null,
                            modifier = Modifier
                                .size(180.dp)
                                .padding(20.dp))
                        Column {
                            Text(
                                text = "healty bowl", Modifier.padding(top = 40.dp),
                                fontSize = 40.sp,
                                fontWeight = FontWeight.ExtraBold,
                                fontStyle = FontStyle.Italic,
                                color = orange
                            )
                            Text(text = "⭐ : 4.1/5",fontSize = 18.sp)
                            Text(text = "\uD83D\uDD52 :  24/7",fontSize = 18.sp)
                        }
                    }

                    Text(text = "About:", color = orange,fontWeight = FontWeight.ExtraBold,modifier = Modifier.padding(start = 10.dp))
                    Text(text = "Our menu highlights things that utilize the sound and fragrant flavors, however, forget the stuffing ghee, spread, oil, and overwhelming cream.",
                        modifier = Modifier.padding(start = 10.dp))

                    Spacer(modifier = Modifier.height(5.dp))

                    Text(text = "Return Policy:",color = orange, fontWeight = FontWeight.ExtraBold,modifier = Modifier.padding(start = 10.dp))
                    Text(text = "All our foods are double checked before leaving our stores so by any case you found a broken food please contact our hotline immediately.",
                        modifier = Modifier.padding(start = 10.dp))
                }
            }
            Spacer(modifier = Modifier.height(50.dp))

            Row(modifier = Modifier.horizontalScroll(rememberScrollState()))
            {
                Card(modifier = Modifier
                    .height(350.dp)
                    .width(280.dp)
                    .padding(start = 30.dp),
                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 10.dp),colors = CardDefaults.cardColors(
                        containerColor = Color.White,
                    ))
                {
                    Column(verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.padding(start = 35.dp))
                    {
                        Image(painter = painterResource(id = R.drawable.palak_paneer),
                            contentDescription =null,)
                        Text(text = "Palak Paneer", fontWeight = FontWeight.Bold, fontSize = 25.sp,color = Color.Black)

                        Spacer(modifier = Modifier.height(20.dp))
                        Text(text = "₹200",fontWeight = FontWeight.Bold, fontSize = 20.sp,color = orange)
                        Spacer(modifier = Modifier.height(20.dp))
                        ExploreButton(text = "ADD TO CART", modifier = Modifier.width(200.dp))

                    }

                }

                Card(modifier = Modifier
                    .height(350.dp)
                    .width(280.dp)
                    .padding(start = 30.dp),
                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 10.dp),colors = CardDefaults.cardColors(
                        containerColor = Color.White,
                    ))
                {
                    Column(verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.padding(start = 35.dp))
                    {
                        Image(painter = painterResource(id = R.drawable.egg_bhurji),
                            contentDescription =null,)
                        Text(text = "Egg Bhurji", fontWeight = FontWeight.Bold, fontSize = 25.sp,color = Color.Black)

                        Spacer(modifier = Modifier.height(20.dp))
                        Text(text = "₹85",fontWeight = FontWeight.Bold, fontSize = 20.sp,color = orange)
                        Spacer(modifier = Modifier.height(20.dp))
                        ExploreButton(text = "ADD TO CART", modifier = Modifier.width(200.dp))

                    }
                }
                Card(modifier = Modifier
                    .height(350.dp)
                    .width(280.dp)
                    .padding(start = 30.dp),
                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 10.dp),colors = CardDefaults.cardColors(
                        containerColor = Color.White,
                    ))
                {
                    Column(verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.padding(start = 35.dp))
                    {
                        Image(painter = painterResource(id = R.drawable.jeera_rice),
                            contentDescription =null,)
                        Text(text = "Jeera Rice", fontWeight = FontWeight.Bold, fontSize = 25.sp,color = Color.Black)

                        Spacer(modifier = Modifier.height(20.dp))
                        Text(text = "₹90",fontWeight = FontWeight.Bold, fontSize = 20.sp,color = orange)
                        Spacer(modifier = Modifier.height(20.dp))
                        ExploreButton(text = "ADD TO CART", modifier = Modifier.width(200.dp))

                    }
                }
            }
        }
    }
}


