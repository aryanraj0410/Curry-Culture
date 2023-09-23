package com.exampleproject.curryculture.commonui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.exampleproject.curryculture.R
import com.exampleproject.curryculture.ui.theme.orange

@Composable
fun CommonButton(
    text: String,
    foregroundColor: Color = orange,
    backgroundColor: Color = Color.White,
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {}
) {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 30.dp),

        shape = RoundedCornerShape(30.dp)
    ) {
        Box(
            modifier = modifier
                .background(backgroundColor)
                .clickable {
                    onClick()
                }
                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = text,
                color = foregroundColor,
                modifier = Modifier.padding(vertical = 20.dp)
            )
        }
    }

}
@Composable
fun ExploreButton(
    text: String,
    foregroundColor: Color = Color.White,
    backgroundColor: Color = orange,
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {}
) {

    Card(
        modifier = Modifier
            .width(130.dp)
            .padding(horizontal = 10.dp),

        shape = RoundedCornerShape(25.dp)
    ) {
        Box(
            modifier = modifier
                .background(backgroundColor)
                .clickable {
                    onClick()
                }
                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = text,
                color = foregroundColor,
                modifier = Modifier.padding(vertical = 10.dp)
            )
        }
    }

}
@Composable
fun CommonLine(
    width: Dp = 0.dp,
    height: Dp = 0.dp,
    modifier: Modifier = Modifier,
    color: Color = orange
) {
    Box(
        modifier = modifier
            .width(width)
            .height(height)
            .background(color)
    )
}
@Composable
fun CommonHeader(
    text: String,
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {}
) {
    Row(
        modifier = modifier.fillMaxWidth(),
    ) {
        IconButton(onClick = {
            onClick()
        }) {
            Icon(painter = painterResource(id = R.drawable.back), contentDescription = null)
        }

        Text(
            text = text,
            color = Color.Black,
            modifier = Modifier
                .align(Alignment.CenterVertically)
                .padding(start = 20.dp)
        )

    }
}