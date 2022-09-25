package com.example.testrsttur.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

// Set of Material typography styles to start with
val Typography = Typography(
    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )
    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)

val DarkTypography = Typography(
    h1 = TextStyle(
        fontFamily = RobotoUiFonts,
        fontWeight = FontWeight.Bold,
        color = Gray98,
        fontSize = 28.sp
    ),
    h2 = TextStyle(
        fontFamily = RobotoUiFonts,
        fontWeight = FontWeight.Bold,
        color = Gray98,
        fontSize = 21.sp
    ),
    h3 = TextStyle(
        fontFamily = RobotoUiFonts,
        fontWeight = FontWeight.SemiBold,
        color = Gray98,
        fontSize = 18.sp
    ),
    h4 = TextStyle(
        fontFamily = RobotoUiFonts,
        fontWeight = FontWeight.Medium,
        color = Gray98,
        fontSize = 15.sp
    ),
    h5 = TextStyle(
        fontFamily = RobotoUiFonts,
        fontWeight = FontWeight.Medium,
        color = Gray98,
        fontSize = 20.sp
    ),
    h6 = TextStyle(
        fontFamily = RobotoUiFonts,
        fontWeight = FontWeight.Bold,
        color = Gray98,
        fontSize = 16.sp
    ),
    body1 = TextStyle(
        fontFamily = RobotoUiFonts,
        fontWeight = FontWeight.Normal,
        color = Gray98,
        fontSize = 14.sp
    ),
    body2 = TextStyle(
        fontFamily = RobotoUiFonts,
        fontWeight = FontWeight.Bold,
        color = Gray98,
        fontSize = 14.sp
    ),
    subtitle1 = TextStyle(
        fontFamily = RobotoUiFonts,
        fontWeight = FontWeight.Medium,
        color = Gray98,
        fontSize = 14.sp
    ),
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        color = Gray98,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        color = Gray98
    )
)

// set of light material typography styles to start with.
val LightTypography = Typography(
    h1 = TextStyle(
        fontFamily = RobotoUiFonts,
        fontWeight = FontWeight.Bold,
        color = Gray5,
        fontSize = 28.sp
    ),
    h2 = TextStyle(
        fontFamily = RobotoUiFonts,
        fontWeight = FontWeight.Bold,
        color = Gray5,
        fontSize = 21.sp
    ),
    h3 = TextStyle(
        fontFamily = RobotoUiFonts,
        fontWeight = FontWeight.SemiBold,
        color = Gray5,
        fontSize = 18.sp
    ),
    h4 = TextStyle(
        fontFamily = RobotoUiFonts,
        fontWeight = FontWeight.Medium,
        color = Gray5,
        fontSize = 15.sp
    ),
    h5 = TextStyle(
        fontFamily = RobotoUiFonts,
        fontWeight = FontWeight.Medium,
        color = Gray5,
        fontSize = 20.sp
    ),
    h6 = TextStyle(
        fontFamily = RobotoUiFonts,
        fontWeight = FontWeight.Bold,
        color = Gray5,
        fontSize = 15.sp
    ),
    body1 = TextStyle(
        fontFamily = RobotoUiFonts,
        fontWeight = FontWeight.Normal,
        color = Gray5,
        fontSize = 14.sp
    ),
    body2 = TextStyle(
        fontFamily = RobotoUiFonts,
        fontWeight = FontWeight.Bold,
        color = Gray5,
        fontSize = 14.sp
    ),
    subtitle1 = TextStyle(
        fontFamily = RobotoUiFonts,
        fontWeight = FontWeight.Medium,
        color = Gray5,
        fontSize = 14.sp
    ),
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        color = Gray5,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        color = Gray5,
        fontSize = 12.sp
    )
)