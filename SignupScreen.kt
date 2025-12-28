package com.example.traffic_login

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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun SignupScreen() {

    var darkBlue = Color(0xFF0D2F5D)
    var lightBlue = Color(0xFF6FA8DC)

    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirmPassword by remember { mutableStateOf("") }
    var name by remember { mutableStateOf("") }
    var phone by remember { mutableStateOf("") }
    var vehicleNumber by remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = darkBlue)
    ){
        Column{
            Spacer(modifier = Modifier.height(30.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp, start = 16.dp)
            ) {
            IconButton(
                onClick = { /*TODO*/ },
                colors = IconButtonDefaults.iconButtonColors(
                    containerColor = lightBlue,
                    contentColor = Color.White))
            {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                    contentDescription = "Back to Login")
            }
            Spacer(modifier = Modifier.width(16.dp))
            Text(
                text = "Create Account",
                color = Color.White,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
        }
            Spacer(modifier = Modifier.height(25.dp))
        Column(
            modifier = Modifier
                .clip(shape = RoundedCornerShape(topStart = 40.dp, topEnd = 40.dp))
                .fillMaxSize()
                .background(color = Color.White)
                .padding(24.dp),
            ) {
                // Name Section
            OutlinedTextField(
                    value = name,
                    onValueChange = {name = it },
                    modifier = Modifier.fillMaxWidth(),
                label = {
                    Text("Name",
                        color = Color.Gray,
                        fontSize = 16.sp,) },
                    colors = TextFieldDefaults.colors(
                        unfocusedContainerColor = Color.Transparent,
                        focusedContainerColor = Color.Transparent,
                        unfocusedIndicatorColor = lightBlue,
                        focusedIndicatorColor = lightBlue,
                        cursorColor = lightBlue
                    ),
                    textStyle = LocalTextStyle.current.copy(
                        color = Color.Gray,
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp
                    ),
                    singleLine = true
                )
            Spacer(modifier = Modifier.height(24.dp))
            // Email Section
            OutlinedTextField(
                value = email,
                onValueChange = {email = it },
                modifier = Modifier.fillMaxWidth(),
                label = {
                    Text("Email",
                        color = Color.Gray,
                        fontSize = 16.sp,) },
                colors = TextFieldDefaults.colors(
                    unfocusedContainerColor = Color.Transparent,
                    focusedContainerColor = Color.Transparent,
                    unfocusedIndicatorColor = lightBlue,
                    focusedIndicatorColor = lightBlue,
                    cursorColor = lightBlue
                ),
                textStyle = LocalTextStyle.current.copy(
                    color = Color.Gray,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                ),
                singleLine = true
            )
            Spacer(modifier = Modifier.height(24.dp))
            // Phone Section
            OutlinedTextField(
                value = phone,
                onValueChange = {phone = it },
                modifier = Modifier.fillMaxWidth(),
                label = {
                    Text("Phone Number",
                        color = Color.Gray,
                        fontSize = 16.sp,) },
                colors = TextFieldDefaults.colors(
                    unfocusedContainerColor = Color.Transparent,
                    focusedContainerColor = Color.Transparent,
                    unfocusedIndicatorColor = lightBlue,
                    focusedIndicatorColor = lightBlue,
                    cursorColor = lightBlue
                ),
                textStyle = LocalTextStyle.current.copy(
                    color = Color.Gray,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                ),
                singleLine = true
            )
            Spacer(modifier = Modifier.height(24.dp))
            // Vehicle Number Section
            OutlinedTextField(
                value = vehicleNumber,
                onValueChange = {vehicleNumber = it },
                modifier = Modifier.fillMaxWidth(),
                label = {
                    Text("Vehicle Number",
                        color = Color.Gray,
                        fontSize = 16.sp,) },
                colors = TextFieldDefaults.colors(
                    unfocusedContainerColor = Color.Transparent,
                    focusedContainerColor = Color.Transparent,
                    unfocusedIndicatorColor = lightBlue,
                    focusedIndicatorColor = lightBlue,
                    cursorColor = lightBlue
                ),
                textStyle = LocalTextStyle.current.copy(
                    color = Color.Gray,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                ),
                singleLine = true
            )
            Spacer(modifier = Modifier.height(24.dp))
            // Password Section
            OutlinedTextField(
                value = password,
                onValueChange = {password = it },
                modifier = Modifier.fillMaxWidth(),
                label = {
                    Text("Password",
                        color = Color.Gray,
                        fontSize = 16.sp,) },
                colors = TextFieldDefaults.colors(
                    unfocusedContainerColor = Color.Transparent,
                    focusedContainerColor = Color.Transparent,
                    unfocusedIndicatorColor = lightBlue,
                    focusedIndicatorColor = lightBlue,
                    cursorColor = lightBlue
                ),
                textStyle = LocalTextStyle.current.copy(
                    color = Color.Gray,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                ),
                singleLine = true
            )
            Spacer(modifier = Modifier.height(24.dp))
            // Confirm Password Section
            OutlinedTextField(
                value = confirmPassword,
                onValueChange = {confirmPassword = it },
                modifier = Modifier.fillMaxWidth(),
                label = {
                    Text("Confirm Password",
                        color = Color.Gray,
                        fontSize = 16.sp,) },
                colors = TextFieldDefaults.colors(
                    unfocusedContainerColor = Color.Transparent,
                    focusedContainerColor = Color.Transparent,
                    unfocusedIndicatorColor = lightBlue,
                    focusedIndicatorColor = lightBlue,
                    cursorColor = lightBlue
                ),
                textStyle = LocalTextStyle.current.copy(
                    color = Color.Gray,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                ),
                singleLine = true
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
                    Text("CREATE ACCOUNT",
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp)
                }
                Row(modifier = Modifier
                    .fillMaxSize(),
                    verticalAlignment = Alignment.Bottom,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text("Already have an account?",
                        color = Color.Gray,)
                    Text(" Sign In ",
                        color = darkBlue,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.clickable(onClick = { })
                    )
                }
            }
        }
    }
}