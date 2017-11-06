package org.cursoaccenture.strategy;

import org.cursoaccenture.strategy.compresor.Compressor;

/**
 * Context class for classes implementing the Compressor interface
 * 
 * @author Antonio J. Nebro <antonio@lcc.uma.es
 *
 */
public class Context {
  private Compressor strategy ;
  
  public Context(Compressor compressor){
	  strategy = compressor ;
  }
  
  public void setStrategy(Compressor compressor) {
	  strategy = compressor ;
  }
  
  public Data apply(Data data) {
	  return strategy.compress(data) ;
  }
}

