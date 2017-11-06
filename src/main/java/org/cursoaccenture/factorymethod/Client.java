package org.cursoaccenture.factorymethod;

import org.cursoaccenture.factorymethod.factory.Factory;
import org.cursoaccenture.factorymethod.factory.impl.MultimediaFileFactory;
import org.cursoaccenture.factorymethod.factory.impl.MultimediaFileFactory2;
import org.cursoaccenture.factorymethod.multimediafile.MultimediaFile;

public class Client {
	public static void main(String[] args) {
		Factory factory ;
		factory = new MultimediaFileFactory() ;
		
		new Client().createMultimediaFiles(factory);
		
		factory = new MultimediaFileFactory2() ;
		new Client().createMultimediaFiles(factory);
	}
	
	public void createMultimediaFiles(Factory factory) {
		MultimediaFile mp3File = factory.createMultimediaFile("MP3") ;
        System.out.println("File: " + mp3File.getName()) ;
        
        MultimediaFile wavFile = factory.createMultimediaFile("Wav") ;
        System.out.println("File: " + wavFile.getName()) ;
	}
}
