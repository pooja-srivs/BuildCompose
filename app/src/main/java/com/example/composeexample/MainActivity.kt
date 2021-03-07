package com.example.composeexample

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.material.Text as Text1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
        //    NewStory()

            var arrData = arrayListOf<Int>()
            repeat(100){
                arrData.add(it)
            }
            composeList(data = arrData)
        }
    }
}

@Composable
fun NewStory(){

        MaterialTheme {

            val typoGraphy = MaterialTheme.typography

            Column(
            ) {

                TopAppBar(
                    title = {
                        Text1(text = "My First Compose App")
                    }
                )

                Image(
                    painter = painterResource(id = R.drawable.header),
                    contentDescription = null,
                    alignment = Alignment.Center,
                    modifier = Modifier
                        .padding(15.dp)
                        .height(280.dp)
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(15)),
                    contentScale = ContentScale.Crop
                )

                Spacer(modifier = Modifier.padding(15.dp))

                Text1(
                    text = "Welcome Pooja Srivastava",
                    color = Color.Black,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(start = 15.dp, end = 15.dp, bottom = 5.dp)
                        .fillMaxWidth(),
                    style = typoGraphy.h6
                )

                Text1(
                    text = "This is another",
                    color = Color.Blue,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(start = 15.dp, end = 15.dp, bottom = 5.dp)
                        .fillMaxWidth(),
                    style = typoGraphy.body1
                )

                Text1(
                    text = "This is new another",
                    color = Color.Green,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(start = 15.dp, end = 15.dp, bottom = 5.dp)
                        .fillMaxWidth(),
                    style = typoGraphy.body1
                )
            }
        }
}

@Composable
fun composeList(data: ArrayList<Int>){
    val state = rememberLazyListState()
    LazyColumn(
        state = state,
    ){
        items(data){ item ->

                ItemRow(item)

        }
    }
}

@Composable
fun ItemRow(item: Int) {

    Text1(
        text = ""+item,
        color = Color.Black,
        textAlign = TextAlign.Center
    )

}
