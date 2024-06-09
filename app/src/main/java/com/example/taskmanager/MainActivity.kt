package com.example.taskmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.taskmanager.ui.theme.TaskManagerTheme
import androidx.compose.ui.unit.dp
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskManagerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                        TaskManager()
                }
            }
        }
    }
}
@Composable
fun TaskManager(modifier:Modifier=Modifier){
    Column (modifier=modifier, horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement =Arrangement.Center ){
        val image= painterResource(R.drawable.ic_task_completed)
        Image(painter = image, contentDescription = null)
        Text(text = stringResource(R.string.text1), fontWeight = FontWeight.Bold,modifier=Modifier.padding(top=24.dp, bottom = 8.dp) )
        Text(text = stringResource(R.string.text2), fontSize = 16.sp )
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TaskManagerTheme {
      TaskManager()
    }
}