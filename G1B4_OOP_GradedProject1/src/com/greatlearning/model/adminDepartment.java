package com.greatlearning.model;

public class adminDepartment extends superDepartment {
	public String departmentName() {
        return "\nAdmin Department";
    }

    public String getTodaysWork() {
        return "Complete your documents Submission";
    }

    public String getWorkDeadline() {
        return "Complete by EOD";
	}
}
