package com.boldradius.akka_exchange

import akka.actor.ActorSystem
import akka.cluster.Cluster

object TradeEngineNodeApp extends App {
  implicit val system = ActorSystem("akka-exchange")
  implicit val materializer = ActorMaterializer()

  val cluster = Cluster(system)
  
}