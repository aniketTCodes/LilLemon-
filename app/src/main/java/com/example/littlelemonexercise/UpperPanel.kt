package com.example.littlelemonexercise

import android.graphics.fonts.Font
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.littlelemonexercise.ui.theme.LittleLemonExerciseTheme




@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LittleLemonExerciseTheme {
        UpperPanel()
    }
}

@Composable
fun UpperPanel(){
    val context= LocalContext.current
    Column(
        modifier = Modifier
            .background(color = Color(0xFF495E57))
            .fillMaxWidth()
    ) {
        Text(text = "Little Lemon", fontSize = 32.sp, color = Color(0xFFF4CE14),
            modifier = Modifier.padding(start=20.dp,top=20.dp)
        )
        Text(
            text="Chicago",
            fontSize = 24.sp,
            color = Color.White,
            modifier = Modifier.padding(start=20.dp)
        )
        Row(modifier = Modifier.padding(start=20.dp,top=20.dp)) {
            Column(

            ) {
                Text(text = stringResource(id = R.string.Description), color = Color.White, modifier = Modifier.width(230.dp), fontSize = 21.sp, style = MaterialTheme.typography.h4)

            }

            Image(painter = painterResource(id = R.drawable.restaurantfood), contentDescription = null,
                Modifier
                    .size(height = 200.dp, width = 150.dp)
                    .clip(RoundedCornerShape(20.dp))
                ,
                contentScale = ContentScale.FillBounds
            )

        }
        Button(onClick = {
                         Toast.makeText(context,"We are under development ! ",Toast.LENGTH_SHORT).show()
        },
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFF4CE14)),
            modifier = Modifier.padding(start = 20.dp,bottom=20.dp)

        ) {
            Text(text= stringResource(id = R.string.Button_text), color = Color.White)
        }
    }
}
