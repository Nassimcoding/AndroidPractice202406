package com.example.day5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.tooling.preview.Preview
import com.example.day5.ui.theme.Day5Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Day5Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    Greeting(
//                        name = "Android",
//                        modifier = Modifier.padding(innerPadding)
//                    )
                    UnitConverter(name = "Android",modifier = Modifier.padding(innerPadding))
                }

            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun UnitConverter(name: String, modifier: Modifier = Modifier){
    Column {
//        Text(
//            text = "hello  ",
//            modifier = modifier
//        )
        //input title
        Text(text = "this is test content");
        //input text box
        OutlinedTextField (
            value = "input data here!",
            onValueChange = {
                //if value change do some thing
            }
        );


        Row {
            // test output
            Text(
                text = "hello  ",
                modifier = modifier
            )
            Text(
                text = "hello  ",
                modifier = modifier
            )
            Button (onClick = {}){
                Text(text = "click me");
            }
        }

    }
}




@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Day5Theme {
        Greeting("Android")
    }
}