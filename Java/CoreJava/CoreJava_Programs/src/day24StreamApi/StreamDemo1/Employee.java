package day24StreamApi.StreamDemo1;

import java.util.List;

public class Employee {
     String firstName;
     String lastName;
     Double salary;
     List<String> projects;

     public String getFirstName() {
          return firstName;
     }

     public void setFirstName(String firstName) {
          this.firstName = firstName;
     }

     public String getLastName() {
          return lastName;
     }

     public void setLastName(String lastName) {
          this.lastName = lastName;
     }

     public Double getSalary() {
          return salary;
     }

     public void setSalary(Double salary) {
          this.salary = salary;
     }

     public List<String> getProjects() {
          return projects;
     }

     public void setProjects(List<String> projects) {
          this.projects = projects;
     }

     public Employee(String firstName, String lastName, Double salary, List<String> projects) {
          this.firstName = firstName;
          this.lastName = lastName;
          this.salary = salary;
          this.projects = projects;
     }

     @Override
     public String toString() {
          return "Employee{" +
                  "firstName='" + firstName + '\'' +
                  ", lastName='" + lastName + '\'' +
                  ", salary=" + salary +
                  ", projects=" + projects +
                  '}';
     }
}
