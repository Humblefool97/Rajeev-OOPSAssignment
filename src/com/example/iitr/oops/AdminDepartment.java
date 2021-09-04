package com.example.iitr.oops;

public class AdminDepartment extends SuperDepartment {

    @Override
    public String getDepartmentName() {
        return "Admin department";
    }

    @Override
    public String getTodaysWork() {
        return "Complete your documents Submission";
    }

    @Override
    public String getWorkDeadline() {
        return "Complete by EOD";
    }
}
