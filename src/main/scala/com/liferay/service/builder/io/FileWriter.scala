package com.liferay.service.builder.io

import java.nio.file.{Files, Paths}

/**
  * @author Manuel de la Peña
  */
class FileWriter {

  def createEmptyFile(fileName: String): Unit = {
    val path = Paths.get(fileName)

    Files.createFile(path)
  }

  def deleteFile(fileName: String): Unit = {
    val path = Paths.get(fileName)

    Files.deleteIfExists(path)
  }

}