package org.cursoaccenture.factorymethod.factory.impl;


import org.cursoaccenture.factorymethod.factory.Factory;
import org.cursoaccenture.factorymethod.multimediafile.MultimediaFile;
import org.cursoaccenture.factorymethod.multimediafile.impl.Mp3;
import org.cursoaccenture.factorymethod.multimediafile.impl.Wav;

public class MultimediaFileFactory implements Factory {
	public MultimediaFile createMultimediaFile(String fileType) {
		MultimediaFile file ;
		if ("MP3".equals(fileType)) {
			file = new Mp3() ;
		} else if ("Wav".equals(fileType)) {
			file = new Wav() ;
		} else {
			file = null ;
		}
		return file;
	}

}
