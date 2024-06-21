package com.example.day8_mvvm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModel
import com.example.day8_mvvm.ui.theme.Day8_MVVMTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            //This piece of code differs from the course because of a version update.
            //course use
            //val viewModel: CounterViewModel = viewModel()
            val viewModel: CounterViewModel by viewModels()
            Day8_MVVMTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    TheCounterAPP(
                        modifier = Modifier.padding(innerPadding),
                        viewModel = viewModel
                    )
                }
            }
        }
    }
}

//this funtion is you rotate your phone the count number will be reset
@Composable
fun TheCounterAPP(modifier: Modifier = Modifier,viewModel: CounterViewModel){
    val count = remember{ mutableStateOf(0)};

    Column (modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,

        ) {
        Text(
            text = "${viewModel.count.value}",
            fontSize = 20.sp
        )
        Row {
            Button(onClick = {viewModel.increment() }) {
                Text(text = "Increment")
            }
            Button(onClick = {viewModel.decrement() }) {
                Text(text = "Decrement")
            }
        }
    }

    //    val count = remember{ mutableStateOf(0)};
//
//    fun increment(){
//        count.value++;
//    }
//
//    fun decrement(){
//        count.value--;
//    }
//
//    Column (modifier = Modifier.fillMaxSize(),
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally,
//
//    ) {
//        Text (text = "${count.value}",
//            fontSize = 20.sp)
//        Row {
//            Button(onClick = { increment() }) {
//                Text(text = "Increment")
//            }
//            Button(onClick = { decrement() }) {
//                Text(text = "Decrement")
//            }
//        }



}




