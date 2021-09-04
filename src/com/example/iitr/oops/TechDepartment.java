package com.example.iitr.oops;

public class TechDepartment extends SuperDepartment {
    @Override
    public String getDepartmentName() {
        return "Tech Department";
    }

    @Override
    public String getTodaysWork() {
        return "Complete coding Module 1";
    }

    @Override
    public String getWorkDeadline() {
        return "Complete by EOD";
    }

    public String getTechStackInformation() {
        return "Core Java";
    }
}
