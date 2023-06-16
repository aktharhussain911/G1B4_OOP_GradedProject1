package com.greatlearning.model;

public class techDepartment extends superDepartment {
	
	public String departmentName() {
        return "\nTech Department";
    }

    public String getTodaysWork() {
        return "Complete coding of module 1";
    }

    public String getWorkDeadline() {
        return "Complete by EOD";
    }

    public String getTechStackInformation() {
        return "Core Java";
    }
}
