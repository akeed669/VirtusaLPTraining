package ems.application;

import ems.manager.Manager;
import ems.employee.Employee;

public class Application{
	public static void main(String [] args){
		Employee emp = new Employee();
		emp.print();
		Manager mgr= new Manager();
		mgr.print();
			
	}

}