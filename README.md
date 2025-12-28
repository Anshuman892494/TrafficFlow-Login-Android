# TrafficFlow - Android App
TrafficFlow is an Android application developed using Kotlin and Jetpack Compose, designed as a smart traffic management login interface.

## Overview
Android traffic management app with Jetpack Compose for urban congestion.

## Features
✅ Login/Registration

✅ Vehicle Registration

✅ Traffic Updates

✅ Forgot Password

## Tech Stack
Kotlin

Jetpack Compose

Material Design 3

## Screens
### 1. Welcome Screen (Traffic_Screen)
App branding with "TrafficFlow" title

Tagline: "Smart Traffic Management System"

Key features display: Traffic Jams, Safety Issues, Road Conditions

Call-to-action buttons: "Get Started" and "Register"

### 2. Login Screen (LoginScreen)
Email and password input fields

Forgot password functionality

Login button with validation

Signup navigation option

Visual feedback with custom color scheme

### 3. Signup Screen (SignupScreen)
Complete user registration form

Fields: Name, Email, Phone, Vehicle Number, Password, Confirm Password

Back navigation to login

Form validation structure

Create account button

### 4. Forgot Password Screen (ForgotScreen) - In Development
Password recovery interface

Email verification

Reset password functionality

## Design
Colors: Dark Blue (#0D2F5D), Light Blue (#6FA8DC)

Clean UI with Material Design

## Quick Start
###  Open in Android Studio
###  Run on device/emulator
## Project Structure
```traffic-login/
├── app/
│   ├── src/main/java/com/example/traffic_login/
│   │   ├── MainActivity.kt          # Entry point and welcome screen
│   │   ├── LoginScreen.kt           # User login interface
│   │   ├── SignupScreen.kt          # User registration interface
│   │   └── ForgotScreen.kt          # Password recovery interface
│   │
│   ├── src/main/res/
│   │   ├── drawable/                # Image resources
│   │   │   ├── logoo.png            # App logo
│   │   │   └── back.png             # Background image
│   │   └── values/                  # Resource files
│   │
│   └── build.gradle.kts            # Build configuration
│
├── ui.theme/
│   ├── Color.kt                    # Color definitions
│   ├── Theme.kt                    # Theme configuration
│   └── Type.kt                     # Typography settings
│
└── README.md                       # Project documentation
```
##  License
Educational project - All rights reserved.
