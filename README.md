# My Restaurants (with Retrofit2)

#### An app that consumes the Yelp API with the Retrofit2 library

##### June 2016

#### By Christopher Siems

## Description

The learning curve for learning Retrofit2 is pretty steep if you've never used it before, especially since there are so few tutorials for it. If you are just picking it up you may want to use Retrofit 1.9 instead. I will try to explain briefly what you need to do to get it running:

#### Step 1. Dependencies
Add these dependencies to build.gradle:
`compile 'com.squareup.retrofit2:retrofit:2.0.0'`
`compile 'com.squareup.retrofit2:converter-gson:2.0.0'`
`compile 'com.squareup.okhttp3:okhttp:3.1.2'`
`compile 'se.akerfeldt:okhttp-signpost:1.1.0'`

#### Step 2. Create your model classes
* Use http://www.jsonschema2pojo.org/ to create the POJOS you will need.
* In the case of the Yelp API we need: Restaurant, Coordinate, Location and SearchResponse (Note: this last one is arbitrarily named; it is the wrapper object that holds all the other objects).
* Make sure that the member variables generated by this website match the API endpoints exactly! If you want your member variables to be different, they must be annotated with '@SerializedName'.

#### Step 3. Build the interface that will consume the API
* Example:
`public interface YelpAPI {`
`   @GET("/v2/search")`
`   Call<SearchResponse> search(`
`           @Query("term") String term,`
`           @Query("location") String location`
`   );`
`  }`
* The parenthesis after @GET holds the url route that is appended onto the base url.
* You can create placeholders within this route using {}. (Example: `/v2/{username}/`; this placeholder will be filled in with @Path notation.
* @Query will add the variable to your route prefixed by what is in parenthesis (In  the example above ‘&term=<term string>’

#### Step 4. Build any interceptors as needed (interceptors in this case are wrapper classes needed especially for things like authentication keys and tokens).
* Look at `services/YelpAPIFactory.java` for an example.

#### Step 5. Instantiate an instance of Retrofit
* Look at `services/YelpAPIFactory.java` for an example starting at the createApi() method.

#### Step 6. Access the API
* This step is the hardet to wrap your head around. Keep at it!
* In this project the relevant code is in the getRestaurants() method of `ui/RestaurantListActivity`.
* Here's what this is doing:
  - We create an instance of our APIFactory and feed in the secret keys, tokens, etc.
  - We invoke an instance of the API.
  - We make a special Retrofit call that takes our @Query terms.
  - Since we are making the call asynchronously (using `call.enqueue()`) we need to define a callback.
  - The callback has two factory methods `onResponse()` and `onFailure()`. Assuming you get a successful response, Retrofit will return your JSON data to you as `response.body()`.

I hope that this brief explanation helps you get Retrofit2 up and running! If you have any questions, or think something could be explained better, please send me a PR.

## Setup/Installation Requirements
You will need the following programs installed on your computer.
* Android Studio
* Java JDK 8+
* Android SDK

### To Run My Restaurants
* Clone this project
* Create a free Firebase account to store your saved Restaurants.
* Get your api keys and token from the Yelp developer website: https://www.yelp.com/developers/documentation/v2/overview
* Create a gradle.properties file.
* Run on either an emulator or an Android OS Device connected to a computer

#### Add the following lines to your gradle.properties file:

`YelpConsumerKey = "<your consumer key here>"`
`YelpConsumerSecret = "<your consumer secret here>"`
`YelpToken = "<your yelp token here>"`
`YelpTokenSecret = "<your token secret here>"`
`FirebaseRootUrl = "https://<your firebase database name>.firebaseio.com/"`

### License
Copyright (c) 2016 Christopher Siems

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
