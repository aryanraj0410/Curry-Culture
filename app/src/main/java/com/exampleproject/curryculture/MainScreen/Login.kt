package com.exampleproject.curryculture.MainScreen

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.exampleproject.curryculture.R
import com.exampleproject.curryculture.commonui.CommonButton
import com.exampleproject.curryculture.ui.theme.orange

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Login(navController: NavController){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(orange))
    {
        Column() {
            Box(modifier = Modifier.padding(start = 35.dp), contentAlignment = Alignment.Center)
            {
            Image(
                painter = painterResource(id = R.drawable.namastescreen),
                contentDescription = null,
                modifier = Modifier.size(320.dp),
                alignment = Alignment.CenterEnd
            )
        }
            Card(modifier = Modifier
                .height(600.dp)
                .width(400.dp)
                .padding(horizontal = 5.dp),
                shape = RoundedCornerShape(15.dp)
                ,colors = CardDefaults.cardColors(
                    containerColor = Color.White)
            ) {
                Column(modifier = Modifier.fillMaxSize(),

                    horizontalAlignment = Alignment.CenterHorizontally)
                {
                    Text(
                    text = "Login",
                    modifier = Modifier,
                    fontWeight = FontWeight.ExtraBold,
                    textAlign = TextAlign.Center,
                        fontSize = 20.sp
                )
                    Spacer(modifier = Modifier.height(70.dp))

                    var text by remember { mutableStateOf("") }

                    OutlinedTextField(
                        value = text,
                        onValueChange = { text = it },
                        label = { Text("Email") }
                    )
                    Spacer(modifier = Modifier.height(30.dp))
                    var password by rememberSaveable { mutableStateOf("") }

                    OutlinedTextField(
                        value = password,
                        onValueChange = { password = it },
                        label = { Text("Password") },
                        visualTransformation = PasswordVisualTransformation(),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
                    )
                    Spacer(modifier = Modifier.height(20.dp))
                    CommonButton(text = "Login", foregroundColor = Color.White,
                        backgroundColor = orange, onClick = {
                            navController.navigate("Home")
                        })
                    Text(text = "Forgot Password?",
                        color = Color.Blue,
                        modifier = Modifier.padding(end = 150.dp))
                    Spacer(modifier = Modifier.height(90.dp))



                Row {
                    Text(text = "Don't have account? ",
                        color = Color.Black)

                    ClickableText(
                        text = AnnotatedString ("Get One."),
                    onClick = { offset ->navController.navigate("Home")
                        Log.d("ClickableText", "$offset -th character is clicked.")
                    }
                    )
                }
                }



            }


        }

    }
}
