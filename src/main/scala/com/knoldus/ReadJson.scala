package com.knoldus

import java.io.FileWriter

import scala.io.Source
import net.liftweb.json._

object ReadJson extends App {

 def getProduceData = {
   implicit val formats:DefaultFormats.type = DefaultFormats
   val source=Source.fromFile("/home/knoldus/Downloads/kafka-assignment/src/main/resources/Student.json")
   val json = source.getLines().mkString
   source.close()
  json
 }

 def writeToFile(listOfStudent:String):Unit ={
   val fw = new FileWriter("/home/knoldus/Downloads/kafka-assignment/src/main/resources/StudentOutput.json")

        fw.write(listOfStudent)
        fw.close()

     }
}
