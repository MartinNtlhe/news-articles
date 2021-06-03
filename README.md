# PopularArticles
This project provide latest article news from NYTimes api
Here is an overview of the project's features: 

- NYTimes API
- Retrofit
- Glide for the Image Network
- Material design
- Prettytime for Convert Java Date() objects in just "a few minutes!"

## Features
The android app lets you:

- Provides latest news articles from NYT Times api
- Provides provisions to share articles with others through various device shares like email, whatsApp e.t.c
- Search functionality to filter articles based on wellknown keywords
- Ability to view the article in device browser should there be any need for that.

## Pre-requisites:
- Install Java JDK 1.8 and ensure it is available in your PATH. Source can be downloaded [here](https://www.oracle.com/index.html)
- Android SDK 30 installed and available in your PATH. Installation instructions available [here](https://developer.android.com/studio/index.html#command-tools).
- Android Build Tools v30.0.1
- Android Support Repository
- Android 6.0+ phone if physical testing
## Getting Started
- Install Gradle SDK. Download the latest version and install it in your root. Available [here](https://gradle.org/)
- You'll need to have Android Studio installed also. Downloaded the sdk and went to tools directory to start the android sdk (http://developer.android.com/sdk/installing/adding-packages.html )

##### Clone this project
```
$ git clone git@github.com:MartinNtlhe/news-articles.git
$ cd news-articles
```

##### Run
This project uses the Gradle build system. To build this project, runt `gradlew build` command on the root project. This will run project tests, and generate link tests with coverage reports. 
The report is located inside project root, inside `app/build/reports/lint-results.html`. Tests reports are located inside `app/build/reports/tests/testDebugUnitTest/index.html`

To Install the apk in your device you need to run `gradle app:installDebug` whilst inside the project directory. There are cases where the project gradle version conflict with the system gradle version, if so, make sure the system and project gradle are of the same version.
Alternatively, download the sample apk [here](https://github.com/MartinNtlhe/news-articles/blob/main/apk/demo.apk)