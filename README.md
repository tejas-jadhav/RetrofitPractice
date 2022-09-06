# Retrofit Practice

Practicing retrofit using coroutines and lifecycles scopes. I used the [JSON placeholder's example todo api](https://jsonplaceholder.typicode.com/todos) 
to get sample todo notes and displayed them in a recycler view. One other thing I used here is [`DiffUtil`](https://developer.android.com/reference/androidx/recyclerview/widget/DiffUtil)
to manage changes to recycler view adapter's data.

### Dependencies
```gradle
def lifecycle_version = "2.6.0-alpha01"
def retrofit_version = "2.9.0"
def coroutines_version = "1.6.3"

//    retrofit
implementation "com.squareup.retrofit2:retrofit:$retrofit_version"
implementation "com.squareup.retrofit2:converter-gson:$retrofit_version"
implementation "com.squareup.okhttp3:okhttp:4.10.0"

//    coroutines
implementation "org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutines_version"
implementation "org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutines_version"

//    coroutine lifecycle scopes
implementation "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version"
implementation "androidx.lifecycle:lifecycle-runtime-ktx:$lifecycle_version"
```
