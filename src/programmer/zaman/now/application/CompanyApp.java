package programmer.zaman.now.application;

import programmer.zaman.now.data.Company;

public class CompanyApp {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("Programmer Zaman Now");

        Company.Employee employee = company.new Employee();
        employee.setName("Ahmad Ihsanullah Rabbani");

        System.out.println(company.getName());
        System.out.println(employee.getName());
        System.out.println(employee.getCompany());
    }
}
