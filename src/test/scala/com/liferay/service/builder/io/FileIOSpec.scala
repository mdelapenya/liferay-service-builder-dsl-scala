package com.liferay.service.builder.io

import com.liferay.service.builder.dsl.ServiceBuilderFunSuite

/**
  * @author Manuel de la Peña
  */
class FileIOSpec extends ServiceBuilderFunSuite {

  test("It should create an empty file") {
    val fileWriter = new FileWriter();

    fileWriter.createEmptyFile("foo")

    val file = new FileReader().readTextFile("foo")

    assert(file.isEmpty)

    fileWriter.deleteFile("foo")
  }

  test("It should read XML") {
    val xml = new FileReader().readXMLFile("/service.xml")

    assert(xml != Nil)
  }

}