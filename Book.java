
public class Book {
private int id; String bname;String author;double price;
public  Book() {
	System.out.println("Book has been created");
	
}
public Book(int id,String bname,String author,double price) {
	this.id=id;
	this.bname =bname;
	this.author=author;
	this.price=price;
}
public void Setid(int id) {this.id=id;}
public void Setbname(String bname) {this.bname=bname;}
public void Setauthor(String author) {this.author=author;}
public void Setprice(double price) {this.price=price;}
public int Getid() {return id;}
Software Requirements Specification (SRS) Document: Krishi Seva Kendra

1. Introduction
   1.1 Purpose
   The purpose of this document is to provide a detailed description of the requirements for the Krishi Seva Kendra system. 
It outlines the functional and non-functional requirements, constraints, and interfaces of the system.

   1.2 Scope
   The Krishi Seva Kendra is a web-based application that aims to provide agricultural services and information to farmers. 
The system will facilitate farmers in accessing resources such as crop information, weather updates, expert advice, and market prices.
 It will serve as a platform for farmers to enhance their knowledge and make informed decisions.

2. Functional Requirements
   2.1 Farmer Registration and Profile Management
      - Farmers should be able to create a new account by providing their basic information.
      - Farmers should be able to update their profile and add details such as land area, crops cultivated, and contact information.

   2.2 Crop Information and Recommendations
      - The system should provide farmers with comprehensive information on various crops, including planting techniques, fertilizers, pesticides, and disease management.
      - Based on the farmer's profile and geographical location, the system should recommend suitable crops for cultivation.

   2.3 Weather Updates
      - The system should integrate with weather APIs or services to provide real-time weather updates.
      - Farmers should be able to view current weather conditions, forecasts, and alerts specific to their location.

   2.4 Expert Advice and Forums
      - Farmers should have access to expert advice and guidance on agricultural practices.
      - The system should facilitate forums or chat features where farmers can interact with agricultural experts and seek assistance.

   2.5 Market Prices
      - The system should provide information on market prices of various crops and commodities.
      - Farmers should be able to view current market prices and historical trends to make informed decisions about selling their produce.

3. Non-functional Requirements
   3.1 Security
      - Farmer data and any personal information should be securely stored and accessible only to authorized users.
      - User authentication and access control mechanisms should be implemented.
      - Sensitive information should be encrypted to ensure data privacy.

   3.2 Performance
      - The system should be able to handle multiple concurrent user requests without significant performance degradation.
      - The response time for fetching crop information, weather updates, and market prices should be minimal.

   3.3 Usability
      - The user interface should be intuitive and user-friendly, considering the diverse user base of farmers.
      - The system should be accessible on different devices, including mobile phones, as many farmers may have limited access to computers.

4. Constraints
   - The Krishi Seva Kendra system will be developed as a web-based application.
   - The system should be compatible with popular web browsers such as Chrome, Firefox, and Safari.
   - The system should support multiple languages, considering the diverse language preferences of farmers.

5. Interfaces
   - User Interface: The system will provide a web-based user interface for farmers to interact with.
   - External APIs: The system will integrate with weather APIs and market price data sources to fetch relevant information.

6. Glossary
   - SRS: Software Requirements Specification
   - UI: User Interface
   - APIs: Application Programming Interfaces

Note: This is a simplified example of an SRS document. In real-world scenarios, the document would typically include additional sections,
 such as system architecture, use case diagrams, data flow diagrams, and more detailed functional and non-functional requirements.
public String GetBname() {return bname;}
public String GetAuthor() {return author;}
public double GetPrice() {return price;}
public void DisplayBookDetails() {
	System.out.println("Book Name:"+bname);
	System.out.println("Book ID:"+id);	
	System.out.println("Author:"+author);	
	System.out.println("Price = "+price);	
}
}
