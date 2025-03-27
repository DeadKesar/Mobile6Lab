package com.example.mobile6lab

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.mobile6lab.ui.theme.Mobile6LabTheme
import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Mobile6LabTheme {
                Scaffold( modifier = Modifier.fillMaxSize() ) { innerPadding ->
                    Start(

                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Start (modifier: Modifier = Modifier) {
    var name by remember { mutableStateOf("") }
    var gender by remember { mutableStateOf("") }
    var country by remember { mutableStateOf("") }
    var age by remember { mutableStateOf(18f) }
    val countries = listOf("Россия", "Украина", "Беларусь", "Казахстан", "Другие")
    var expanded by remember { mutableStateOf(false) }

    val context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        OutlinedTextField(
            value = name,
            onValueChange = { name = it },
            label = { Text("Имя") },
            modifier = Modifier.fillMaxWidth()
        )
    }
}



@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Mobile6LabTheme {
        Greeting("Android")
    }
}
