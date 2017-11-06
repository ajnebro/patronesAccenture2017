package org.cursoaccenture.observer;

import java.util.Observable;
import java.util.Observer;

public class DataStoreObserver implements Observer {
  private String name ;

  public DataStoreObserver(String name) {
    this.name = name ;
  }

  public void update(Observable o, Object arg) {
    String message =  (String) arg ;
    System.out.println(name + ": " + message) ;
  }
}
