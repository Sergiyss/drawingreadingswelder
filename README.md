Как использовать.

1.  Обрати внимание, что начиная с Android Studio 3.2 зависимомти имеют обозначения в gridle.
2.  Активация MVVM происходит следующим образом в Gradle.

    `dataBinding {
        enabled = true
    }`
    
3.  Gradle.properties, в него я добавил, эти две строчки.

`android.useAndroidX=true
android.enableJetifier=true`

4. Больше зависемостей см. здесь >> https://dl.google.com/dl/android/maven2/index.html
