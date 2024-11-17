package com.example.appku

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material3.Button
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.appku.ui.theme.AppKuTheme

class MainActivity : ComponentActivity() {

    companion object {
        val items = listOf(
            Item(
                title = "Item 1",
                image = R.drawable.image_1
            ),
            Item(
                title = "Item 2",
                image = R.drawable.image_2
            ),
            Item(
                title = "Item 3",
                image = R.drawable.image_3
            ),
            Item(
                title = "Item 4",
                image = R.drawable.image_1
            ),
            Item(
                title = "Item 5",
                image = R.drawable.image_2
            ),
            Item(
                title = "Item 6",
                image = R.drawable.image_3
            ),
            Item(
                title = "Item 7",
                image = R.drawable.image_1
            ),
            Item(
                title = "Item 8",
                image = R.drawable.image_2
            ),
            Item(
                title = "Item 9",
                image = R.drawable.image_3
            ),
            Item(
                title = "Item 10",
                image = R.drawable.image_1
            ),
            Item(
                title = "Item 11",
                image = R.drawable.image_2
            ),
            Item(
                title = "Item 12",
                image = R.drawable.image_3
            ),
        )
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppKuTheme {
//
//                var selected by remember {
//                    mutableIntStateOf(0)
//                }
//                Scaffold(
//                    bottomBar = {
//                        NavigationBar {
//                            bottomNavItems.forEachIndexed{ index, bottomNavItem ->
//                                NavigationBarItem(
//                                    selected = index == selected,
//                                    onClick = {
//                                        selected = index
//                                        navController.navigate(bottomNavItem.route)
//                                    },
//                                )
//                            }
//                        }
//                    },
//                    floatingActionButton = {
//                        FloatingActionButton(onClick = {}){}
//                    },
//                    topBar = {
//
//                    }
//                ) {  }
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    val navHostController = rememberNavController()
                    NavHost(
                        navController = navHostController,
                        startDestination = "home_screen"
                    ) {

                        composable("home_screen") {
                            HomeScreen(navHostController = navHostController)
                        }

                        composable("lazy_row_screen") {
                            LazyRowScreen()
                        }

                        composable("lazy_column_screen") {
                            LazyColumnScreen()
                        }

                        composable("lazy_grid_screen") {
                            LazyGridScreen()
                        }

                        composable("profile_screen") {
                            ProfileScreen()
                        }
                }

                }
            }
        }
    }
}

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    navHostController: NavHostController
) {
    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Button(onClick = { navHostController.navigate("lazy_row_screen") }) {
            Text(text = "Lazy Row")
        }

        Spacer(modifier = Modifier.height(30.dp))

        Button(onClick = { navHostController.navigate("lazy_column_screen") }) {
            Text(text = "Lazy Column")
        }

        Spacer(modifier = Modifier.height(30.dp))

        Button(onClick = { navHostController.navigate("lazy_grid_screen") }) {
            Text(text = "Lazy Grid")
        }

        Spacer(modifier = Modifier.height(30.dp))

        Button(onClick = { navHostController.navigate("profile_screen") }) {
            Text(text = "Profile")
        }

        Spacer(modifier = Modifier.height(30.dp))
    }
}

//    val navItemList = listOf(
//        NavItem("Home", Icons.Default.Home),
//        NavItem("Notification", Icons.Default.Notifications),
//        NavItem("Profile", Icons.Default.AccountCircle),
//    )
//
//    Scaffold(
//        modifier = Modifier.fillMaxSize(),
//        bottomBar = {
//            NavigationBar {
//                navItemList.forEachIndexed { index, navItem ->
//                    NavigationBarItem(
//                        selected = true,
//                        onClick = {  },
//                        icon = {
//                            Icon(ImageVector = navItem.icon, contentDescription = "Icon")
//                        },
//                        label = {
//                            Text(text = navItem.label)
//                        }
//                    )
//                }
//            }
//        }
//    ) { innerPadding ->
//        ContentScreen(modifier = Modifier.padding(innerPadding))
//
//    }
//
//fun Icon(ImageVector: ImageVector, contentDescription: String) {
//
//}
//
//@Composable
//fun ContentScreen (modifier: Modifier = Modifier) {
//
//}
//        val bottomNavItems = listOf(
//            BottomNavItem(
//                title = "Home",
//                route = "home",
//                selectedIcon = Icons.Filled.Home,
//                unselectedIcon = Icons.Outlined.Home,
//            ),
//            BottomNavItem(
//                title = "Profile",
//                route = "profile",
//                selectedIcon = Icons.Filled.AccountCircle,
//                unselectedIcon = Icons.Outlined.AccountCircle,
//            ),
//        )
//        data class BottomNavItem(
//            val title: String,
//            val route: String,
//            val selectedIcon: ImageVector,
//            val unselectedIcon: ImageVector,
//        )