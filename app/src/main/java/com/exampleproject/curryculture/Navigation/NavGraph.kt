package com.exampleproject.curryculture.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.exampleproject.curryculture.MainScreen.Home
import com.exampleproject.curryculture.MainScreen.Login
import com.exampleproject.curryculture.Profile.Cart
import com.exampleproject.curryculture.Profile.Order
import com.exampleproject.curryculture.Profile.Profile
import com.exampleproject.curryculture.Resturants.Borcelle
import com.exampleproject.curryculture.Resturants.Healty
import com.exampleproject.curryculture.Resturants.Rimerio
import com.exampleproject.curryculture.Resturants.Wardiere
import com.exampleproject.curryculture.MainScreen.Startup

@Composable
fun Nav(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "Startup"){
        composable(route = "Startup"){
            Startup(navController)
        }
        composable(route = "Login"){
            Login(navController)
        }
        composable(route = "Home"){
            Home(navController)
        }
        composable(route = "Rimerio"){
            Rimerio()
        }
        composable(route = "Borcelle"){
            Borcelle()
        }
        composable(route = "Healty"){
            Healty()
        }
        composable(route = "Wardiere"){
            Wardiere()
        }
        composable(route = "Profile"){
            Profile(navController)
        }
        composable(route = "Order"){
            Order(navController)
        }
        composable(route = "Cart"){
            Cart(navController)
        }

    }
}