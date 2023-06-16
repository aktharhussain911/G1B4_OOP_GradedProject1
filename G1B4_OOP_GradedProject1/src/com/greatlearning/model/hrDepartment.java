package com.greatlearning.model;

public class hrDepartment extends superDepartment {
	public String departmentName() {
        return "\nHR Department";
    }

    public String getTodaysWork() {
        return "Fill today’s timesheet and mark your attendance";
    }

    public String getWorkDeadline() {
        return "Complete by EOD";
    }

    public String doActivity() {
        return "Team Lunch";
    }
}