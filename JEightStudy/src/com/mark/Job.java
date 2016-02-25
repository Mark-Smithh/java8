package com.mark;

public class Job {
	private boolean writeCode;
	private int salery;
	private String jobTitle;
	
	public boolean isWriteCode() {
		return writeCode;
	}
	public void setWriteCode(boolean writeCode) {
		this.writeCode = writeCode;
	}
	
	
	public int getSalery() {
		return salery;
	}
	
	public void setSalery(int salery) {
		this.salery = salery;
	}
	
	public String getJobTitle() {
		return jobTitle;
	}
	
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + salery;
		result = prime * result + (writeCode ? 1231 : 1237);
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Job other = (Job) obj;
		if (salery != other.salery)
			return false;
		if (writeCode != other.writeCode)
			return false;
		return true;
	}
}
