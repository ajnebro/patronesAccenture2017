package org.cursoaccenture.factorymethod.factory;

import org.cursoaccenture.factorymethod.multimediafile.MultimediaFile;

public interface Factory {
  public MultimediaFile createMultimediaFile(String fileType) ;
}
