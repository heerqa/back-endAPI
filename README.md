

Design a sample back-end API that could be consumed by a native mobile application (iOS, Android, etc…).

Technology Requirements

- IntelliJ Project
- Maven
- Spring 4.x
- Java-based configuration (instead of XML)
- Spring Security 4.x
- OAuth2 Security Provider that calls a custom class function to authenticate the credentials (the function can be faked: i.e. LoginService.validate(username, password) { return true; })
- Tomcat 8 (not Spring Boot)

Sample Solution Guidelines

SecurityRestController
- Login action {post}
-----parameters: username, password
-----returns OAuth2 token upon success
- Logout

EmployeeRestController
- Authentication must be required to access this controller
- Some type of list action that returns a JSON array of faked employee names (i.e. “Joe”, “Sam”, “Sabrina”)

Notes:

- The authentication credentials (username, password) will be submitted via POST request to a RESTful service (no HTML login page, since it’s a native mobile application)

- You do not actually need to build a mobile project (we’re just looking for an example implementation of the back-end)

- It is very important to use the latest versions of the various frameworks (we’re not looking for a Spring 3.x based solution)

