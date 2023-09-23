package com.exampleproject.curryculture.Profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.exampleproject.curryculture.R

@Composable
fun Cart(navController:NavController){
    Surface(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.fillMaxSize()) {
            Card(modifier =Modifier.height(100.dp).fillMaxWidth(),colors = CardDefaults.cardColors(
                containerColor = Color.White)) {
                Row(modifier =Modifier.padding(20.dp)) {
                    IconButton(onClick = {  navController.navigate("Profile")}) {


                        Icon(painter = painterResource(id = R.drawable.back),contentDescription = null)
                    }
                }
            }
            Image(painter = painterResource(id = R.drawable.empty_cart), contentDescription =null ,
                modifier = Modifier.fillMaxSize())
        }

    }
}
