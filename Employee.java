import java.util.Scanner;
public class Employee {
private int id;
private String name;
private Date dob;
public void AcceptData(int id,String name,int day,int month,int year) {
	this.id = id;
	this.name=name;
	dob.getdate(day,month,year);
}
Software Requirements Specification (SRS) Document: Employee Management System

1. Introduction
   1.1 Purpose
   The purpose of this document is to provide a detailed description of the requirements for the Employee Management System. 
It outlines the functional and non-functional requirements, constraints, and interfaces of the system.

   1.2 Scope
   The Employee Management System is a web-based application that allows organizations to manage employee information, 
track attendance, handle leave requests, and generate reports. The system will provide an efficient and 
centralized solution for managing employee-related tasks.

2. Functional Requirements
   2.1 Employee Information Management
      - Administrators should be able to add, update, and delete employee records.
      - Each employee record should include details such as name, employee ID, contact information, designation, and department.
      - The system should store and display employee photos, if available.

   2.2 Attendance Tracking
      - Employees should be able to mark their attendance (clock in/out) using a time tracking feature.
      - The system should calculate the total working hours and maintain a record of daily, weekly, and monthly attendance.

   2.3 Leave Management
      - Employees should be able to submit leave requests for approval.
      - The system should allow managers to review and approve/reject leave requests.
      - The system should maintain a record of employee leave history.

   2.4 Employee Reports
      - The system should generate reports on employee attendance, leaves, and other relevant information.
      - Reports may include employee performance, attendance summary, leave balance, etc.

   2.5 Notifications and Reminders
      - The system should send notifications and reminders to employees for pending leave requests, 
upcoming meetings, or other important events.
      - Notifications can be delivered via email, SMS, or through the system's user interface.

3. Non-functional Requirements
   3.1 Security
      - Employee data should be securely stored and accessible only to authorized personnel.
      - User authentication and access control mechanisms should be implemented.
      - Sensitive information such as passwords should be stored using encryption.

   3.2 Performance
      - The system should handle concurrent user requests without significant performance degradation.
      - The response time for retrieving employee records, generating reports, and processing leave requests should be minimal.

   3.3 Usability
      - The user interface should be intuitive and user-friendly.
      - The system should provide clear and informative error messages.
      - The system should support multiple languages if required.

4. Constraints
   - The Employee Management System will be developed using a web-based architecture.
   - The system should be compatible with popular web browsers such as Chrome, Firefox, and Safari.
   - The system should be responsive and accessible on different devices (desktops, tablets, mobile phones).

5. Interfaces
   - User Interface: The system will provide a web-based user interface for administrators, managers, and employees to interact with.
   - Database: The system will interact with a database to store and retrieve employee information, attendance records, and leave requests.

6. Glossary
   - SRS: Software Requirements Specification
   - UI: User Interface

Note: This is a simplified example of an SRS document. In real-world scenarios, the document would typically include additional sections,
 such as system architecture, use case diagrams, data flow diagrams, and more detailed functional and non-functional requirements.
public void display_data() {
	System.out.println("employee id=.........."+id);
	System.out.println("employee name =......."+name);
	System.out.println("the date of birth is..");
	dob.show_date();
}
}
