package com.java.exception;

public class StackTraceException {

	public static void main(String[] args) {
		StackTraceException exception= new StackTraceException();
		exception.doThis();
	}

	public void doThis() {
		doThat();
	}

	public void doThat() {
		Throwable throwable = new Throwable();
		throwable.printStackTrace();
		
		
		printStackTraceForThrowable(throwable);
	}

	public void printStackTraceForThrowable(Throwable throwable) {
		System.out.println("\n**** Stack Trace ***");
		StackTraceElement[] traces = throwable.getStackTrace();
		
		for(StackTraceElement traceElement : traces) {
			System.out.println(traceElement.getFileName());
		}
	}
}
