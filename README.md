# TrafficFlow – Android App

TrafficFlow is an Android application developed using **Kotlin** and **Jetpack Compose**, designed as a smart traffic management **login and onboarding interface**. The project focuses on clean UI design, modern Android development practices, and scalable screen architecture.

---

## 📸 Screenshot

![TrafficFlow Screenshot](https://github.com/Anshuman892494/TrafficFlow-Login-Android/blob/main/ScreenShot.png?raw=true)

---

## 🧭 Overview

TrafficFlow demonstrates a modern Android UI for an urban traffic management system. It provides user authentication screens and a visually consistent experience using Material Design 3 and Jetpack Compose.

---

## ✨ Features

* ✅ User Login & Registration
* ✅ Vehicle Registration (UI-level)
* ✅ Traffic Updates (UI concept)
* ✅ Forgot Password Flow (In Development)

---

## 🛠 Tech Stack

* **Kotlin**
* **Jetpack Compose**
* **Material Design 3**
* **Android Studio**

---

## 📱 Screens

### 1. Welcome Screen (`Traffic_Screen`)

* App branding with **TrafficFlow** title
* Tagline: *"Smart Traffic Management System"*
* Feature highlights:

  * Traffic Jams
  * Safety Issues
  * Road Conditions
* Call-to-action buttons:

  * **Get Started**
  * **Register**

---

### 2. Login Screen (`LoginScreen`)

* Email and password input fields
* Forgot password option
* Login button with validation structure
* Navigation to signup screen
* Visual feedback using a custom color scheme

---

### 3. Signup Screen (`SignupScreen`)

* Complete user registration form
* Input fields:

  * Name
  * Email
  * Phone Number
  * Vehicle Number
  * Password
  * Confirm Password
* Back navigation to login screen
* Form validation structure
* Create Account button

---

### 4. Forgot Password Screen (`ForgotScreen`) *(In Development)*

* Password recovery interface
* Email verification UI
* Reset password workflow (planned)

---

## 🎨 Design

* **Primary Colors**:

  * Dark Blue: `#0D2F5D`
  * Light Blue: `#6FA8DC`
* Clean and minimal UI
* Fully aligned with **Material Design 3** principles

---

## 🚀 Quick Start

1. Clone the repository
2. Open the project in **Android Studio**
3. Sync Gradle files
4. Run the app on an emulator or physical device

---

## 🗂 Project Structure

```
app/
├── src/main/java/com/example/traffic_login/
│   ├── MainActivity.kt        # Entry point & welcome screen
│   ├── LoginScreen.kt         # User login UI
│   ├── SignupScreen.kt        # User registration UI
│   └── ForgotScreen.kt        # Password recovery UI
│
├── src/main/res/
│   ├── drawable/
│   │   ├── logoo.png          # App logo
│   │   └── back.png           # Background image
│   └── values/                # Resource files
│
├── build.gradle.kts           # Module build configuration
│
ui.theme/
├── Color.kt                   # Color definitions
├── Theme.kt                   # App theme configuration
└── Type.kt                    # Typography settings

README.md                      # Project documentation
```

---

## 📄 License

This project is developed **for educational purposes only**. All rights are reserved by the author.

---

## 👤 Author

**Anshu**
Android Developer | Kotlin | Jetpack Compose
