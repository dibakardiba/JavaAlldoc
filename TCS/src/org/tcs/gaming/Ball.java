package org.tcs.gaming;

public class Ball {

		private String log;

		 public Ball() {
		  log = "";
		 }

		 //Removing the synchronized keyword will cause a race condition.
		 public synchronized void kick(String aPlayerName) {
		  log += aPlayerName + " ";
		 }

		 public String getLog() {
		  return log;
		 }
	}

