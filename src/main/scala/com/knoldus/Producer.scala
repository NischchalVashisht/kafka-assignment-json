package com.knoldus

object Producer extends App {

  import java.util.Properties

  import org.apache.kafka.clients.producer._

  val props = new Properties()
  props.put("bootstrap.servers","localhost:9092")

  props.put("key.serializer","org.apache.kafka.common.serialization.StringSerializer")
  props.put("value.serializer","org.apache.kafka.common.serialization.StringSerializer")

  val producer = new KafkaProducer[String,String](props)

  val TOPIC = "test5"


  val record = new ProducerRecord(TOPIC,"key","the end " + ReadJson.getProduceData())
  producer.send(record)
  producer.close()


}