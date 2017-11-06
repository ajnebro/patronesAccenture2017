package org.cursoaccenture.factorymethod.factory.impl;

import org.cursoaccenture.factorymethod.factory.Factory;
import org.cursoaccenture.factorymethod.multimediafile.MultimediaFile;
import org.cursoaccenture.factorymethod.multimediafile.impl.Mp3;
import org.cursoaccenture.factorymethod.multimediafile.impl.Wav;

public class MultimediaFileFactory2 implements Factory {
	public MultimediaFile createMultimediaFile(String fileType) {
		MultimediaFile file ;
		switch(fileType) {
		case "MP3": 
			file = new Mp3() ;
			break ;
		case "Wav":
			file = new Wav() ;
			break ;
		default: 
			file = null ;
		}

		return file;
	}

}
