# User CRUD Project

A simple CRUD application for managing users using Java, Spring Boot, and MySQL.

## What is this repository for?

1. This repository contains the code for a user CRUD (Create, Read, Update, Delete) application. It might be compiling or not :)

### Before you start

- The project must use the specific language in the assessment, in this case, Java.
- Consider the assessment deadline starting from the beginning of the test. If you have been invited to take the test and cannot complete it within this period, notify the person who invited you to receive instructions on what to do.
- Document the entire investigation process for the development of the activity (README.md in your repository); the results of these tasks are as important as your thought process and decisions as you complete them, so try to document and present your hypotheses and decisions as much as possible.

## Contribution guidelines and Tips

1. All tips and contributions are welcome. However, be aware that existing errors might not be accidental. We would appreciate it if you let us know anything you realize during the exam. This feedback is expected and could positively impact your interview evaluation.

## Repository README

- **Project Title:** User CRUD Application
- **Description:** A simple CRUD application for managing users.
- **Technologies Used:** 
  - Java
  - Spring Boot
  - MySQL
  
### Installation and Usage Instructions

1. **Clone the repository:**
   ```sh
   git clone https://github.com/Gideonalves05/java-challenge
   ```
2. **Navigate to the project directory:**
   ```sh
   cd user-crud
   ```
3. **Configure MySQL Database:**
   - Ensure you have MySQL installed and running.
   - Create a database named `userdb`.
   - Update the `application.properties` file in the `src/main/resources` directory with your MySQL username and password.
     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/userdb
     spring.datasource.username=your-username
     spring.datasource.password=your-password
     spring.jpa.hibernate.ddl-auto=update
     ```
4. **Install dependencies and run the project:**
   ```sh
   mvn clean install
   mvn spring-boot:run
   ```

### API Endpoints

- **Create User:**
  - **POST** `/api/users`
  - Request Body: 
    ```json
    {
      "name": "John Doe",
      "email": "john.doe@example.com"
    }
    ```

- **Get All Users:**
  - **GET** `/api/users`

- **Get User by ID:**
  - **GET** `/api/users/{id}`

- **Update User:**
  - **PUT** `/api/users/{id}`
  - Request Body:
    ```json
    {
      "name": "Jane Doe",
      "email": "jane.doe@example.com"
    }
    ```

- **Delete User:**
  - **DELETE** `/api/users/{id}`

### Additional Notes

- Don't forget to include a `.gitignore` file. You can generate one from [here](https://www.toptal.com/developers/gitignore).
- If you are using a personal GitHub, reference that it is a challenge by Coodesh:

> This is a challenge by [Coodesh](https://coodesh.com/)

## Finalization and Presentation Instructions

1. Add the link to the repository with your solution to the test.
2. Add the link to the presentation of your project in the README.md.
3. Check if the README is complete and make the final commit in your repository.
4. Send and await instructions to proceed. Success and good luck! =)

## Support

Use [our community](https://discord.gg/rdXbEvjsWu) to ask questions about the process or send a message directly to a specialist in the platform chat.