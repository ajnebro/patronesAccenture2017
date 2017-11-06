package org.cursoaccenture.singleton;

/**
 * Class implementing a counter following the singleton pattern
 * 
 * @author Antonio J. Nebro <antonio@lcc.uma.es
 *
 */
public class Counter {
  private static Counter instance = null ;
  private int counter ;
  
  private Counter() {
	  counter = 0 ;
  }
  
  public static Counter getInstance() {
	  if (instance == null) {
		  instance = new Counter() ;
	  }
	  return instance ;
  }
  
  public int getCounterValue(){
	  return counter ;
  }
  
  public void increaseCounter() {
	  counter ++ ;
  }
}
