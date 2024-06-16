package com.example.day5

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.DismissState
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
//                    SailGame(name = "Android",modifier = Modifier.padding(innerPadding));
                }

            }
        }
    }
}

@Composable
fun SailGame(name: String, modifier: Modifier = Modifier){
    val TreasuresFound = remember { mutableStateOf(0) }
    val Direction = remember { mutableStateOf("North") }


    // *********************************************************************
    //this is remember other template and this template provide you call variable like
    // Text(text = "TestByRemember Found: ${TreasuresFound}")
    // you don't need use variable.value you can direct call variable
    val TestByRemember by remember { mutableStateOf(0) }


    Column {
        Text(text = "Teasures Found: ${TreasuresFound.value}")
        Text(text = "Current Direction: ${Direction.value}")
        Button(onClick = {
            TreasuresFound.value++
            Direction.value = "North"
        }) {
            Text(text = "North")
        }
        Button(onClick = {
            TreasuresFound.value++
            Direction.value = "South"
        }) {
            Text(text = "South")
        }
        Button(onClick = {
            TreasuresFound.value++
            Direction.value = "West"
        }) {
            Text(text = "West")
        }
        Button(onClick = {
            TreasuresFound.value++
            Direction.value = "East"
        }) {
            Text(text = "East")
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

    var ReadLineText by remember { mutableStateOf("") }
    var DropDownControl1 by remember { mutableStateOf(false) }
    var DropDownControl2 by remember { mutableStateOf(false) }



    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
//        Text(
//            text = "hello  ",
//            modifier = modifier
//        )

        //input title
        Text(text = "this is test content");
        Spacer(modifier = Modifier.height(16.dp))
        //input text box
        OutlinedTextField (
            value = ReadLineText,
            onValueChange = {
                //if value change do some thing
                ReadLineText = it;

            },

            modifier = Modifier.padding(50.dp),
            label = { Text("Enter Value")}
        );
        Spacer(modifier = Modifier.height(16.dp))


        Row {
            val context = LocalContext.current
            var ttext = "already change"
            // test output
//            Text(
//                text = "hello  ",
//                modifier = modifier
//            )
//            Text(
//                text = "hello  ",
//                modifier = modifier
//            )
            Button (onClick = {
//                println("already clicked");
//                ttext = "already clicked";

                Toast.makeText(context, "tyty", Toast.LENGTH_LONG).show();
            }){
                Text(text = ttext);
            }
        }
        Row {
            Box{
                Button(onClick = {
                    DropDownControl1 = !DropDownControl1;
                }) {
                    Text(text = "test1");
                    Icon(Icons.Default.ArrowDropDown, contentDescription = "arrow down")
                }
                DropdownMenu(expanded = DropDownControl1, onDismissRequest = {
                    DropDownControl1 = !DropDownControl1;
                }) {
                    DropdownMenuItem(text = { Text("item1") }, onClick = { ReadLineText = "text1 item1" })
                    DropdownMenuItem(text = { Text("item2") }, onClick = { ReadLineText = "text1 item2" })
                    DropdownMenuItem(text = { Text("item3") }, onClick = { ReadLineText = "text1 item3" })
                    DropdownMenuItem(text = { Text("item4") }, onClick = { ReadLineText = "text1 item4" })

                }
            }
            Spacer(modifier = Modifier.width(16.dp))
            Box{
                Button(onClick = {
                    DropDownControl2 = !DropDownControl2;
                }) {
                    Text(text = "test2");
                    Icon(Icons.Default.ArrowDropDown, contentDescription = "arrow down")
                }
                DropdownMenu(expanded = DropDownControl2, onDismissRequest = {
                    DropDownControl2 = !DropDownControl2;
                }) {
                    DropdownMenuItem(text = { Text("item1") }, onClick = { ReadLineText = "text2 item1" })
                    DropdownMenuItem(text = { Text("item2") }, onClick = { ReadLineText = "text2 item2" })
                    DropdownMenuItem(text = { Text("item3") }, onClick = { ReadLineText = "text2 item3" })
                    DropdownMenuItem(text = { Text("item4") }, onClick = { ReadLineText = "text2 item4" })

                }
            }
        }
        Spacer(modifier = Modifier.height(16.dp))


    }
}




@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Day5Theme {
        Greeting("Android")
    }
}