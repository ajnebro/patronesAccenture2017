package org.cursoaccenture.strategy.compresor.impl;

import org.cursoaccenture.strategy.compresor.Compressor;
import org.cursoaccenture.strategy.Data;

public class Zip implements Compressor {
	public Data compress(Data data) {
		return new Data("Zip - "+ data.getData());
	}
}
