package com.example.iitr.oops;

public class Driver {

    public static void main(String[] args) {
        SuperDepartment superDepartmentInstance = new SuperDepartment();
        printDecorator();
        printDetails(superDepartmentInstance);
        printDecorator();

        AdminDepartment adminDepartment = new AdminDepartment();
        printDecorator();
        printDetails(adminDepartment);
        printDecorator();

        HRDepartment hrDepartment = new HRDepartment();
        printDecorator();
        printDetails(hrDepartment);
        printMessage(hrDepartment.doActivity());
        printDecorator();

        TechDepartment techDepartment = new TechDepartment();
        printDecorator();
        printDetails(techDepartment);
        printMessage(techDepartment.getTechStackInformation());
        printDecorator();
    }

    private static void printDetails(SuperDepartment superDepartmentInstance) {
        printMessage("Welcome to " + superDepartmentInstance.getDepartmentName());
        printMessage(superDepartmentInstance.getTodaysWork());
        printMessage(superDepartmentInstance.getWorkDeadline());
        printMessage(superDepartmentInstance.isTodayAHoliday());
    }

    public static void printMessage(String msg) {
        System.out.println(msg);
    }

    public static void printDecorator() {
        System.out.println("==================================");
    }


}
