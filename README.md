## Android Registration Form (Playground)

Simple, play-around Android app by feihuan peng. The goal is to explore UI, form handling, and navigation. No license is provided for this project.

### What it does (current and planned)
- Collect basic user input via a registration form
- Validate inputs and submit
- On successful submission, navigate to an information screen that reflects the submitted data

Planned structure:
- `RegistrationActivity` to capture user details
- An info screen (Activity or Fragment) that displays submitted information

### Requirements
- Android Studio (latest stable)
- Android SDK and an emulator or physical device
- JDK 17 (recommended for modern AGP)
- Gradle Wrapper is included; no separate installation required

Runs on modern Android versions (Android 8.0+ recommended). Exact `minSdk`/`targetSdk` are defined in `app/build.gradle.kts`.

### Project structure
```
AndroidRegistrationFormapp/
  app/
    src/
      main/
        AndroidManifest.xml
        java/com/...            # Kotlin/Java sources (Activities, etc.)
        res/
          layout/               # Layout XMLs (e.g., activity_registration.xml)
          values/               # strings.xml, themes.xml, colors.xml
          drawable/             # vector drawables and shapes
    build.gradle.kts            # App module Gradle config
  build.gradle.kts              # Project-level Gradle config
  settings.gradle.kts           # Gradle settings
  gradle/                       # Gradle wrapper
  gradlew, gradlew.bat          # Wrapper scripts
  README.md                     # This file
```

### Getting started
1. Open the folder in Android Studio
2. Let Gradle sync finish
3. Run on an emulator or connected device

### Usage
- Launch the app
- Fill out the registration form
- Tap submit to navigate to the info screen showing your submitted details

### Roadmap
- Implement `RegistrationActivity` UI and validation
- Implement info screen showing submission results
- Add form error states and accessibility improvements
- Optional: persist user data locally for returning sessions

### Author
- feihuan peng

### License
- No license. All rights reserved. No permissions are granted to use, copy, modify, or distribute this code.