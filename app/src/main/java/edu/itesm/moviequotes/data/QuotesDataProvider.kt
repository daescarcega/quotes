package edu.itesm.moviequotes.data

object QuotesDataProvider {
       fun getDat() : List<Quote>{
           return listOf( Quote(1, "Terminator", "Hasta la vista Baby"),
                   Quote(2, "Joker", "Hahahahahahaha") ,
               Quote(3, "Darth Vader", "Im your Father")  ,
               Quote(4, "Jack Torrance", "HERES Jhonny")  ,
               Quote(5, "Loki", "I want the throne")  ,
               Quote(6, "IronMan", "Im IronMan")  ,
               Quote(7, "Hannibal Lecter", "Special Agent Starling...")  ,
               Quote(8, "Batman", "Batoosiii")  ,
               Quote(9, "Doc Brown", "We dont need roads")  ,
               Quote(10, "Predator", "To the choppe")  ,
               Quote(11, "heMan", "I have the POWEEERRR")  ,
               Quote(12, "GodFather", "I'm gonna make him an offer he can't refuse.")  )
       }
}