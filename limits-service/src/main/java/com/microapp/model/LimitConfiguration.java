package com.microapp.model;

public class LimitConfiguration {
	  public int getMinimum() {
		return minimum;
	}

	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}

	public int getMaximum() {
		return maximum;
	}

	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}

	private int minimum;
	private int maximum;
	 
	protected LimitConfiguration() {}

	public LimitConfiguration(int minimum, int maximum) {
		this.minimum = minimum;
		this.maximum = maximum;
	}
}
