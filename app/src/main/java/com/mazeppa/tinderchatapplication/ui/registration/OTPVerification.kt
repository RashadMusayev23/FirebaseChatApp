package com.mazeppa.tinderchatapplication.ui.registration

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.selection.TextSelectionColors
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/**
 * Rashad Musayev on 4/28/2023 - 23:31
 */

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OTPVerificationScreen(modifier: Modifier = Modifier) {
    var phoneNumber by remember {
        mutableStateOf("")
    }

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color.Yellow),
        contentAlignment = Alignment.Center,
    ) {

        Column(
            modifier = Modifier
                .padding(horizontal = 20.dp)
                .fillMaxWidth()
                .clip(RoundedCornerShape(20.dp))
                .padding(horizontal = 20.dp)
                .background(Color.White),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Text(
                text = "OTP Verification",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )

            Text(
                text = "We will send you One Time Password on this number",
                fontSize = 14.sp,
                color = Color.Black
            )

            OutlinedTextField(
                value = phoneNumber,
                onValueChange = { phoneNumber = it },
                label = {
                    Text("Phone Number")
                },
                modifier = Modifier.fillMaxWidth(),
//                color = TextFieldDefaults.outlinedTextFieldColors(
//                    cursorColor = Color.Black,
//                    containerColor = Color.Black,
//                    selectionColors = TextSelectionColors(
//                        handleColor = Color.Black,
//                        backgroundColor = Color.Yellow
//                    )
//                ),
                singleLine = true,
                keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Phone)
            )

            Button(
                onClick = {},
                modifier = Modifier
                    .clip(RoundedCornerShape(6.dp))
                    .wrapContentWidth(),
                elevation = ButtonDefaults.buttonElevation(
                    defaultElevation = 5.dp,
                    pressedElevation = 10.dp
                ),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Black)
            ) {
                Text(text = "Continue", color = Color.White)
            }
        }

    }
}

@Preview
@Composable
fun OTPVerificationScreenPreview() {
    OTPVerificationScreen()
}