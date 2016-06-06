# My Restaurants (with Retrofit2)

#### An app that consumes the Yelp API with the Retrofit2 library

##### June 2016

#### By Christopher Siems

## Description

My Restaurants demonstrates some of the following Android development concepts:

* Animations
* Gesture detection
* Implicit intents
* Fragments (and moving data between fragments and activities)
* Material design
* Consuming REST'ful APIs with the Retrofit2 library

## Setup/Installation Requirements
You will need the following programs installed on your computer.
* Android Studio
* Java JDK 8+
* Android SDK

### To Run My Restaurants
* Clone this project
* Create a free Firebase account to store your saved Restaurants.
* Create a gradle.properties file.
* Run on either an emulator or an Android OS Device connected to a computer

#### gradle.properties file:

YelpConsumerKey = "<your consumer key here>"
YelpConsumerSecret = "<your consumer secret here>"
YelpToken = "<your yelp token here>"
YelpTokenSecret = "<your token secret here>"
FirebaseRootUrl = "https://<your firebase database name>.firebaseio.com/"

## Technologies Used

AndroidStudio, AndroidSDK, Java v1.8, Gradle

### License
Copyright (c) 2016 Christopher Siems

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.