package org.cursoaccenture.strategy.compresor.impl;

import org.cursoaccenture.strategy.compresor.Compressor;
import org.cursoaccenture.strategy.Data;

public class Rar implements Compressor {
	public Data compress(Data data) {
		return new Data("RAR - "+ data.getData());
	}
}
