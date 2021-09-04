package com.example.iitr.oops;

public class HRDepartment extends SuperDepartment {
    @Override
    public String getDepartmentName() {
        return "HR Department";
    }

    @Override
    public String getTodaysWork() {
        return "Fill today's worksheet and mark your attendence";
    }

    @Override
    public String getWorkDeadline() {
        return "Complete by EOD";
    }

    public String doActivity() {
        return "team lunch";
    }
}
