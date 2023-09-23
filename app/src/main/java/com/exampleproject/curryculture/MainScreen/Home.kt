package com.exampleproject.curryculture.MainScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.exampleproject.curryculture.R
import com.exampleproject.curryculture.commonui.ExploreButton
import com.exampleproject.curryculture.ui.theme.orange

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Home(navController: NavController) {
    Surface(modifier = Modifier.fillMaxSize()) {
        Column {

            TopAppBar(
                title = {
                    Row(
                        Modifier
                            .fillMaxWidth()
                            .padding(all = 10.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,
                    ) {
                        Column {
                            Text("Howdy Aryan Raj", fontSize = 17.sp, color = Color.White)
                            Row {
                                Icon(Icons.Filled.LocationOn, null, tint = Color.White)
                                Text("Location",color = Color.White)
                            }
                        }
                        IconButton(onClick = {navController.navigate("Profile")

                        }) {
                            Icon(
                                painter = painterResource(R.drawable.profile_icon), tint = Color.White,
                                contentDescription = null
                            )
                        }

                    }


                },
                colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = orange),
                        navigationIcon = {
                    IconButton(onClick = {/* Do Something*/ }) {
                        Icon(Icons.Filled.Menu, null, tint = Color.White)
                    }
                }
            )



            Spacer(modifier = Modifier.height(20.dp))
            Row(modifier = Modifier.fillMaxWidth()) {
                var text by remember { mutableStateOf("") }
                OutlinedTextField(
                    modifier = Modifier.padding(10.dp),
                    value = text, onValueChange = { text = it },
                    label = { Text(text = " \uD83D\uDD0D Search") },
                )

            }
            Spacer(modifier = Modifier.height(20.dp))
            Box(
                modifier = Modifier.verticalScroll(rememberScrollState()),
            )
            {
                Column(modifier = Modifier.padding(start = 78.dp)) {
//CARD 1
                    Card(
                        modifier = Modifier
                            .height(180.dp)
                            .width(300.dp)
                        ,colors = CardDefaults.cardColors(
                            containerColor = Color.White)
                        ,elevation = CardDefaults.cardElevation(
                            defaultElevation = 15.dp))
                    {
                        Row(horizontalArrangement = Arrangement.End) {
                            Column(modifier = Modifier.padding(start = 60.dp, top = 25.dp)) {
                                Text(text = "RIMBERIO", fontWeight = FontWeight.Bold, fontSize = 20.sp,
                                    color = orange
                                )
                                Text(text = "As alike as two peas in a pod.",color = Color(0xFF6650a4))
                                Text(text = "\uD83D\uDCCD Within 100 m")
                            }
                        }
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(text = "Restaurant | Bar | NightClub", fontWeight = FontWeight.Bold)
                        Spacer(modifier = Modifier.height(5.dp))
                        ExploreButton(text = "Explore", onClick = {
                            navController.navigate("Rimerio")
                        })
                    }


                    Spacer(modifier = Modifier.height(20.dp))

//CARD 2
                    Card(
                        modifier = Modifier
                            .height(180.dp)
                            .width(300.dp)
                        ,colors = CardDefaults.cardColors(
                            containerColor = Color.White)
                        ,elevation = CardDefaults.cardElevation(
                            defaultElevation = 15.dp))

                    {
                        Row(horizontalArrangement = Arrangement.End) {
                            Column(modifier = Modifier.padding(start = 60.dp, top = 25.dp)) {
                                Text(text = "BORCELLE Catering", fontWeight = FontWeight.Bold, fontSize = 20.sp,
                                    color = orange
                                )
                                Text(text = "As American as apple pie.",color = Color(0xFF6650a4))
                                Text(text = "\uD83D\uDCCD Within 1.2 km")
                            }
                        }
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(text = "Restaurant", fontWeight = FontWeight.Bold)
                        Spacer(modifier = Modifier.height(5.dp))
                        ExploreButton(text = "Explore", onClick = {
                            navController.navigate("Borcelle")
                        })
                    }


                    Spacer(modifier = Modifier.height(20.dp))

//CARD 3
                    Card(
                        modifier = Modifier
                            .height(180.dp)
                            .width(300.dp)
                        ,colors = CardDefaults.cardColors(
                            containerColor = Color.White,
                        )
                        ,elevation = CardDefaults.cardElevation(
                            defaultElevation = 15.dp)
                    )
                    {
                        Row(horizontalArrangement = Arrangement.End) {
                            Column(modifier = Modifier.padding(start = 60.dp, top = 25.dp)) {
                                Text(text = "healty bowl", fontWeight = FontWeight.Bold, fontSize = 20.sp,
                                    color = orange
                                )
                                Text(text = "Organic Healty Food",color = Color(0xFF6650a4))
                                Text(text = "\uD83D\uDCCD Within 1 km")
                            }
                        }
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(text = "Restaurant | Dine-in", fontWeight = FontWeight.Bold)
                        Spacer(modifier = Modifier.height(5.dp))
                        ExploreButton(text = "Explore",onClick = {
                            navController.navigate("Healty")
                        })
                    }


                    Spacer(modifier = Modifier.height(20.dp))

//CARD 4
                    Card(
                        modifier = Modifier
                            .height(180.dp)
                            .width(300.dp)
                        ,colors = CardDefaults.cardColors(
                            containerColor = Color.White,
                        )
                        ,elevation = CardDefaults.cardElevation(
                            defaultElevation = 15.dp)
                    )
                    {
                        Row(horizontalArrangement = Arrangement.End) {
                            Column(modifier = Modifier.padding(start = 60.dp, top = 25.dp)) {
                                Text(text = "Wardiere", fontWeight = FontWeight.Bold, fontSize = 20.sp,
                                    color = orange
                                )
                                Text(text = "As brown as a berry.",color = Color(0xFF6650a4))
                                Text(text = "\uD83D\uDCCD Within 5 km")
                            }
                        }
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(text = "Bar | NightClub", fontWeight = FontWeight.Bold)
                        Spacer(modifier = Modifier.height(5.dp))
                        ExploreButton(text = "Explore",onClick = {
                            navController.navigate("Wardiere")
                        })
                    }


                    Spacer(modifier = Modifier.height(20.dp))

//CARD 5
                    Card(
                        modifier = Modifier
                            .height(180.dp)
                            .width(300.dp)
                        ,colors = CardDefaults.cardColors(
                            containerColor = Color.White,
                        ),elevation = CardDefaults.cardElevation(
                            defaultElevation = 15.dp)
                    )
                    {
                        Row(horizontalArrangement = Arrangement.End) {
                            Column(modifier = Modifier.padding(start = 60.dp, top = 25.dp)) {
                                Text(text = "FranCisco", fontWeight = FontWeight.Bold, fontSize = 20.sp,
                                    color = orange
                                )
                                Text(text = "A baker’s dozen",color = Color(0xFF6650a4))
                                Text(text = "\uD83D\uDCCD Within 500 m")
                            }
                        }
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(text = "Bakery", fontWeight = FontWeight.Bold)
                        Spacer(modifier = Modifier.height(5.dp))
                        ExploreButton(text = "Explore")
                    }



                    Spacer(modifier = Modifier.height(20.dp))

//CARD 6
                    Card(
                        modifier = Modifier
                            .height(180.dp)
                            .width(300.dp)
                        ,colors = CardDefaults.cardColors(
                            containerColor = Color.White,
                        )
                        ,elevation = CardDefaults.cardElevation(
                            defaultElevation = 15.dp)
                    )
                    {
                        Row(horizontalArrangement = Arrangement.End) {
                            Column(modifier = Modifier.padding(start = 60.dp, top = 25.dp)) {
                                Text(text = "TIMMERMEN", fontWeight = FontWeight.Bold, fontSize = 20.sp,
                                    color = orange
                                )
                                Text(text = "Welcome to cafe of taste.",color = Color(0xFF6650a4))
                                Text(text = "\uD83D\uDCCD Within 2 km")
                            }
                        }
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(text = "Cafe | Resto", fontWeight = FontWeight.Bold)
                        Spacer(modifier = Modifier.height(5.dp))
                        ExploreButton(text = "Explore")
                    }


                    Spacer(modifier = Modifier.height(20.dp))

//CARD 7
                    Card(
                        modifier = Modifier
                            .height(180.dp)
                            .width(300.dp)
                        ,colors = CardDefaults.cardColors(
                            containerColor = Color.White,
                        )
                        ,elevation = CardDefaults.cardElevation(
                            defaultElevation = 15.dp)
                    )
                    {
                        Row(horizontalArrangement = Arrangement.End) {
                            Column(modifier = Modifier.padding(start = 60.dp, top = 25.dp)) {
                                Text(text = "BORCELLE", fontWeight = FontWeight.Bold, fontSize = 20.sp,
                                    color = orange
                                )
                                Text(text = "Coffee shop.",color = Color(0xFF6650a4))
                                Text(text = "\uD83D\uDCCD Within 2.5 km")
                            }
                        }
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(text = "Restaurant | Cafe", fontWeight = FontWeight.Bold)
                        Spacer(modifier = Modifier.height(5.dp))
                        ExploreButton(text = "Explore")
                    }

                    Spacer(modifier = Modifier.height(20.dp))

//CARD 8
                    Card(
                        modifier = Modifier
                            .height(180.dp)
                            .width(300.dp)
                        ,colors = CardDefaults.cardColors(
                            containerColor = Color.White,
                        )
                        ,elevation = CardDefaults.cardElevation(
                            defaultElevation = 15.dp)
                    )
                    {
                        Row(horizontalArrangement = Arrangement.End) {
                            Column(modifier = Modifier.padding(start = 60.dp, top = 25.dp)) {
                                Text(text = "Fradel & Spies", fontWeight = FontWeight.Bold, fontSize = 20.sp,
                                    color = orange
                                )
                                Text(text = "Good and Tasty",color = Color(0xFF6650a4))
                                Text(text = "\uD83D\uDCCD Within 3 km")
                            }
                        }
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(text = "Restaurant | Dine-in", fontWeight = FontWeight.Bold)
                        Spacer(modifier = Modifier.height(5.dp))
                        ExploreButton(text = "Explore")
                    }

                    Spacer(modifier = Modifier.height(20.dp))

//CARD 9
                    Card(
                        modifier = Modifier
                            .height(180.dp)
                            .width(300.dp)
                        ,colors = CardDefaults.cardColors(
                            containerColor = Color.White,
                        )
                        ,elevation = CardDefaults.cardElevation(
                            defaultElevation = 15.dp)
                    )
                    {
                        Row(horizontalArrangement = Arrangement.End) {
                            Column(modifier = Modifier.padding(start = 60.dp, top = 25.dp)) {
                                Text(text = "Larana Wine", fontWeight = FontWeight.Bold, fontSize = 20.sp,
                                    color = orange
                                )
                                Text(text = "Wine as Old as your Mother",color = Color(0xFF6650a4))
                                Text(text = "\uD83D\uDCCD Within 5.4 km")
                            }
                        }
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(text = "Bar | NightClub", fontWeight = FontWeight.Bold)
                        Spacer(modifier = Modifier.height(5.dp))
                        ExploreButton(text = "Explore")
                    }



                    Spacer(modifier = Modifier.height(20.dp))

//CARD 10
                    Card(
                        modifier = Modifier
                            .height(180.dp)
                            .width(300.dp)
                        ,colors = CardDefaults.cardColors(
                            containerColor = Color.White,
                        )
                        ,elevation = CardDefaults.cardElevation(
                            defaultElevation = 15.dp)
                    )
                    {
                        Row(horizontalArrangement = Arrangement.End) {
                            Column(modifier = Modifier.padding(start = 60.dp, top = 25.dp)) {
                                Text(text = "The 90's Dinner", fontWeight = FontWeight.Bold, fontSize = 20.sp,
                                    color = orange
                                )
                                Text(text = "The toast of the town.",color = Color(0xFF6650a4))
                                Text(text = "\uD83D\uDCCD Within 3.2 km")
                            }
                        }
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(text = "Restaurant", fontWeight = FontWeight.Bold)
                        Spacer(modifier = Modifier.height(5.dp))
                        ExploreButton(text = "Explore")
                    }


                }
                Box(modifier = Modifier.fillMaxSize())
                {
                    Column {
                        Card(
                            modifier = Modifier
                                .height(100.dp)
                                .width(120.dp)
                                .padding(start = 20.dp),
                            elevation = CardDefaults.cardElevation(
                                defaultElevation = 10.dp
                            )
                        ) {
                            Image(painter= painterResource(id = R.drawable.rest_1),
                                contentDescription = null,
                                modifier = Modifier.fillMaxSize()
                            )
                        }

                            Spacer(modifier = Modifier.height(100.dp))
                            Card(
                                modifier = Modifier
                                    .height(100.dp)
                                    .width(120.dp)
                                    .padding(start = 20.dp),
                                elevation = CardDefaults.cardElevation(
                                    defaultElevation = 10.dp
                                )
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.rest_2),
                                   contentDescription = null,
                                   modifier = Modifier.fillMaxSize()
                                )

                            }
                        Spacer(modifier = Modifier.height(100.dp))
                        Card(
                            modifier = Modifier
                                .height(100.dp)
                                .width(120.dp)
                                .padding(start = 20.dp),
                            elevation = CardDefaults.cardElevation(
                                defaultElevation = 10.dp
                            )
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.rest_3),
                                contentDescription = null,
                                modifier = Modifier.fillMaxSize()
                            )

                        }
                        Spacer(modifier = Modifier.height(100.dp))
                        Card(
                            modifier = Modifier
                                .height(100.dp)
                                .width(120.dp)
                                .padding(start = 20.dp),
                            elevation = CardDefaults.cardElevation(
                                defaultElevation = 10.dp
                            )
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.rest_4),
                                contentDescription = null,
                                modifier = Modifier.fillMaxSize()
                            )

                        }
                        Spacer(modifier = Modifier.height(100.dp))
                        Card(
                            modifier = Modifier
                                .height(100.dp)
                                .width(120.dp)
                                .padding(start = 20.dp),
                            elevation = CardDefaults.cardElevation(
                                defaultElevation = 10.dp
                            )
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.rest_5),
                                contentDescription = null,
                                modifier = Modifier.fillMaxSize()
                            )

                        }
                        Spacer(modifier = Modifier.height(100.dp))
                        Card(
                            modifier = Modifier
                                .height(100.dp)
                                .width(120.dp)
                                .padding(start = 20.dp),
                            elevation = CardDefaults.cardElevation(
                                defaultElevation = 10.dp
                            )
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.rest_6),
                                contentDescription = null,
                                modifier = Modifier.fillMaxSize()
                            )

                        }
                        Spacer(modifier = Modifier.height(100.dp))
                        Card(
                            modifier = Modifier
                                .height(100.dp)
                                .width(120.dp)
                                .padding(start = 20.dp),
                            elevation = CardDefaults.cardElevation(
                                defaultElevation = 10.dp
                            )
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.rest_7),
                                contentDescription = null,
                                modifier = Modifier.fillMaxSize()
                            )

                        }
                        Spacer(modifier = Modifier.height(100.dp))
                        Card(
                            modifier = Modifier
                                .height(100.dp)
                                .width(120.dp)
                                .padding(start = 20.dp),
                            elevation = CardDefaults.cardElevation(
                                defaultElevation = 10.dp
                            )
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.rest_8),
                                contentDescription = null,
                                modifier = Modifier.fillMaxSize()
                            )

                        }
                        Spacer(modifier = Modifier.height(100.dp))
                        Card(
                            modifier = Modifier
                                .height(100.dp)
                                .width(120.dp)
                                .padding(start = 20.dp),
                            elevation = CardDefaults.cardElevation(
                                defaultElevation = 10.dp
                            )
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.rest_9),
                                contentDescription = null,
                                modifier = Modifier.fillMaxSize()
                            )

                        }
                        Spacer(modifier = Modifier.height(100.dp))
                        Card(
                            modifier = Modifier
                                .height(100.dp)
                                .width(120.dp)
                                .padding(start = 20.dp),
                            elevation = CardDefaults.cardElevation(
                                defaultElevation = 10.dp
                            )
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.rest_10),
                                contentDescription = null,
                                modifier = Modifier.fillMaxSize()
                            )

                        }


                    }

                }
            }
        }
    }
    }



