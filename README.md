# back-endAPI
back-end API in Spring 4


	Sender 	Message | Attachments 	Date/Time 	
	
Filter Messages
	
Shagu... N.
	
Thank you David!
I will keep you posted.

Thanks,
Shagufta

> On 31-Mar-2015, at 9:27 pm, David H via Elance <E70609804-WR@workroom.elance.com> wrote:
>
>
>
	
Mar 31, 2015
2:07 pm
David H.
	
Hi Shagufta,

Let's get started. I'm looking forward to working with you.

David
	
Mar 31, 2015
11:55 am
Shagu... N.
	
Hi David,

I am doing well thanks!
Based on my current workload , I will be able to create sample project by this Friday.
Upon your feedback and further discussion we can plan the things from there.
I estimate 16 hours of efforts for the below task.
I am very interested in the opportunity and looking forward to work together.

Let me know If you want me to start the project.

Thanks,
Shagufta
	
Mar 31, 2015
11:49 am
David H.
	
Hi Shagufta,

Hope you have been well.

Perhaps the best way to get started is with a sample project. Please let me know how much time and money would be needed for you to put together a sample project based on the guidelines listed below. I would also appreciate if you can let me know how quickly you could have the sample project ready for review.

Please let me know if you have any questions.

Thanks for your time.

David


^^^^^^^^^

Goal:

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

