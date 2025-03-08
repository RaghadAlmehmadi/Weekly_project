package com.example.atry

fun main() {
   val greetingProvider: GreetingProvider = FriendlyGreeting()
   println(greetingProvider.provideGreeting())


   // Creating a list of users (using user_details class)
   val userList = listOf(
      user_details("Raghad", 23, "raghad@example.com"),
      user_details("Abeer", 16, "abeer@example.com"),
      user_details("Reem", 19, "reem@example.com")
   )

   // Create a set (unique users)
   val userSet = setOf(
      user_details("Reem", 19, "reem@example.com"),
      user_details("Abeer", 16, "abeer@example.com"),
      user_details("Raghad", 23, "raghad@example.com")
   )

   // Create a map (key-value pairs: name to user_details object)
   val userMap = mapOf(
      "Reem" to user_details("Reem", 19, "reem@example.com"),
      "Abeer" to user_details("Abeer", 16, "abeer@example.com"),
      "Raghad" to user_details("Raghad", 23, "raghad@example.com")
   )

   // Print all users (List)
   println("List of Users:")
   userList.forEach { println(it) }

   // Filtering users older than 18 using a lambda function (from List)
   val adults = userList.filter { it.age > 18 }
   println("\nUsers above 18 years (from List):")
   adults.forEach { println(it) }

   // Filtering users older than 18 using a lambda function (from Set)
   val adultSet = userSet.filter { it.age > 18 }
   println("\nUsers above 18 years (from Set):")
   adultSet.forEach { println(it) }

   // Filtering users older than 18 using a lambda function (from Map values)
   val adultMap = userMap.filter { it.value.age > 18 }
   println("\nUsers above 18 years (from Map):")
   adultMap.forEach { (key, user) -> println("$key: $user") }

}

// Create an interface named GreetingProvider with a method provideGreeting().
interface GreetingProvider{
   fun provideGreeting(): String
}
//Implement the interface in a class FriendlyGreeting that returns a greeting message.
class FriendlyGreeting :  GreetingProvider{
   override fun provideGreeting(): String {
      return  "Hello I am Raghad"
   }

}

//Use inheritance: Create a base class Person and extend it to a User class.
open class person {
   var name: String
   var age: Int
   constructor(name: String, age: Int) {
      this.name = name
      this.age = age
   }

}
 class User(  name: String,  age: Int, var email: String): person(name, age) {


}