// Databricks notebook source
val data1 = sc.parallelize(Seq(("A",1),("B",2),("B",3)))  
data1.toDF.show
