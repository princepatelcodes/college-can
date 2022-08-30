Common Isses

1. Sdk Dir not found

### Issue

* What went wrong:
Could not determine the dependencies of task ':app:installDebug'.
> SDK location not found. Define location with an ANDROID_SDK_ROOT environment variable or by setting the sdk.dir path in your project's local properties file at 'C:\Users\Admin\Documents\prince\cgpa\android\local.properties'.


### Solution


Create a `local.properties` file in android directory.
Add your sdk path to in, in following manner.

sdk.dir=C:\\Users\\Admin\\AppData\\Local\\Android\\Sdk


2. abd not recognized as an internal or external command

* What went wrong:
Could not determine the dependencies of task ':app:installDebug'.
> SDK location not found. Define location with an ANDROID_SDK_ROOT environment variable or by setting the sdk.dir path in your project's local properties file at 'C:\Users\Admin\Documents\prince\cgpa\android\local.properties'.

### Issue

'adb' is not recognized as an internal or external command,
operable program or batch file.
error Failed to start the app. Run CLI with --verbose flag for more details.
Error: Command failed: adb shell am start -n com.cgpa/com.cgpa.MainActivity
    at makeError (C:\Users\Admin\Documents\prince\cgpa\node_modules\@react-native-community\cli-platform-android\node_modules\execa\index.js:174:9)

### Solution

Add your system path for platform-tools to your environment variable.

`C:\Users\Admin\AppData\Local\Android\Sdk\platform-tools`