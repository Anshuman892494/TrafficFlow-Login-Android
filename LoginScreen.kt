package com.example.traffic_login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun LoginScreen() {

    var darkBlue = Color(0xFF0D2F5D)
    var lightBlue = Color(0xFF6FA8DC)
    
    var emailaddress by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }


    Box( modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)){
        Image(painter = painterResource(id = R.drawable.logoo),
            contentDescription = "Background"
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize()
        ) {
            Text(
                text = "TrafficFlow",
                color = Color.White,
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(top = 230.dp)
            )
            Spacer(modifier = Modifier.height(5.dp))
            Text(
                text = "Welcome Back!",
                color = Color.White,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(90.dp))

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(24.dp)
            ) {
                // Email Address Section
                Text("Email Address",
                    color = Color.Gray,
                    fontSize = 16.sp,
                )
                TextField(
                    value = emailaddress,
                    onValueChange = {emailaddress = it },
                    modifier = Modifier.fillMaxWidth(),
                    colors = TextFieldDefaults.colors(
                        unfocusedContainerColor = Color.Transparent,
                        focusedContainerColor = Color.Transparent,
                        unfocusedIndicatorColor = lightBlue,
                        focusedIndicatorColor = lightBlue,
                        cursorColor = lightBlue
                    ),
                    textStyle = LocalTextStyle.current.copy(
                        color = Color.Black,
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp
                    ),
                    singleLine = true
                )
                Spacer(modifier = Modifier.height(24.dp))
                // Password Section
                Text("Password",
                )
                TextField(
                    value = password,
                    onValueChange = {password = it },
                    modifier = Modifier.fillMaxWidth(),
                    colors = TextFieldDefaults.colors(
                        unfocusedContainerColor = Color.Transparent,
                        focusedContainerColor = Color.Transparent,
                        unfocusedIndicatorColor = lightBlue,
                        focusedIndicatorColor = lightBlue,
                        cursorColor = lightBlue
                    ),
                    visualTransformation = PasswordVisualTransformation(),
                    textStyle = LocalTextStyle.current.copy(
                        color = Color.Black,
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp
                    ),
                    singleLine = true
                )
                Spacer(modifier = Modifier.height(16.dp))
                // Forgot Password Section
                Text(
                    text = "Forgot Password?",
                    color = lightBlue,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.End,
                    modifier = Modifier.fillMaxWidth().clickable(onClick = { })
                )
                Spacer(modifier = Modifier.height(60.dp))
                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(
                        containerColor = lightBlue,
                        contentColor = Color.White
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp),
                    shape = RoundedCornerShape(10.dp)
                ) {
                    Text("LOGIN",
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp)
                }
                Row(modifier = Modifier
                    .fillMaxSize(),
                    verticalAlignment = Alignment.Bottom,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text("Don't have an account?",
                        color = Color.Gray,)
                    Text(" Sign Up ",
                        color = darkBlue,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.clickable(onClick = { })
                    )
                }
            }
        }
    }
}