package com.example.hikerlogbookandroid

import java.util.Date

class LogbookEntry {
    //COMMENTED OUT LINES ARE OBJECTS YET TO BE BUILT
    var dayNumber: Int = 0
    lateinit var date: Date
    var journalEntry: String? = null
    var startMileMark: Double = 0.0
    var endMileMark: Double = 0.0
    var miles: Double = 0.0
//    var shelter: Shelter
//    var generalLocation: GeneralLocation
    var slackpack: Boolean = false
//    var direction: Direction
    var startLocation: String? = null
    var endLocation: String? = null
    var mood: String? = null
    var sleptInBed: Boolean = false
    var tookAShower: Boolean = false
    var ascent: Int = 0
    var descent: Int = 0
    var identifier: String? = null //The question mark allows these properties to be null

}