package com.liferay.service.builder.io

import java.nio.file.{Files, Paths}

import java.util

import scala.xml.{Elem, XML}

/**
  * @author Manuel de la Peña
  */
class FileReader {

  def readTextFile(fileName: String): util.List[String] = {
    val path = Paths.get(fileName)

    return Files.readAllLines(path)
  }

  def readXMLFile(fileName: String): Elem = {
    val factory = javax.xml.parsers.SAXParserFactory.newInstance()

    factory.setValidating(false)
    factory.setFeature("http://xml.org/sax/features/validation", false)
    factory.setFeature("http://apache.org/xml/features/nonvalidating/load-dtd-grammar", false)
    factory.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false)
    factory.setFeature("http://xml.org/sax/features/external-general-entities", false)
    factory.setFeature("http://xml.org/sax/features/external-parameter-entities", false)

    val parser = factory.newSAXParser()

    return XML.withSAXParser(parser).load(this.getClass.getResourceAsStream(fileName))
  }

}