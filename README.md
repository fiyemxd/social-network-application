# Social Network Application

This project is a java-based social network application where users can create profiles, add friends, post on their walls, and interact with other users. The application is built using Java and follows object-oriented programming principles, including the use of design patterns like **Singleton** and **Factory**. It also includes unit tests to ensure the functionality of key components.

## Features

### User Management

- Users can create profiles with personal information such as name, email, age, birthday, and interests.
- Users can log in using their email and password.
- Users can control their visibility in search results.

### Friendship System

- Users can search for other users and send friend requests.
- Users can view their friends' profiles and post on their walls.

### Wall Posts

- Users can post on their own walls or their friends' walls.
- Posts are displayed in chronological order.

### Notifications

- Users receive notifications when someone posts on their wall or adds them as a friend.

### Search Functionality

- Users can search for other users by name.
- Search results are filtered based on the user's visibility settings.

### Unit Testing

- The project includes unit tests for the `User`, `UserDatabase`, and other key components to ensure functionality and reliability.

## Design Patterns Used

- **Singleton Pattern**: The `UserDatabase` class is implemented as a singleton to ensure that only one instance of the database exists throughout the application.
- **Factory Pattern**: The `UserFactory` class is used to create `User` objects, encapsulating the creation logic.

## Class Structure

- **`User.java`**: Represents a user in the social network. Implements `Subject` and `Observer` interfaces for notification handling.
- **`UserDatabase.java`**: Manages the list of users and their posts. Implements the Singleton pattern.
- **`UserFactory.java`**: Factory class for creating `User` objects.
- **`LoginFrame.java`**: The initial frame where users log in or create new accounts.
- **`MainFrame.java`**: The main interface where users can view their profile, post on walls, and interact with friends.
- **`FriendsFrame.java`**: Displays the list of friends and allows users to view their profiles.
- **`FriendWallFrame.java`**: Displays a friend's profile and allows posting on their wall.
- **`SearchUsersFrame.java`**: Allows users to search for other users and send friend requests.
- **`ProgramDemo.java`**: The main class that initializes the application with demo users.
- **`UserTest.java`**: Unit tests for the `User` class.
- **`UserDatabaseTest.java`**: Unit tests for the `UserDatabase` class.

## How to Run

### 1. Clone the Repository

```bash
git clone https://github.com/yourusername/social-network-application.git
```

### 2. Navigate to the Project Directory

```bash
cd social-network-application
```

### 3. Compile the Java Files

```bash
javac *.java
```

### 4. Run the Application

```bash
java ProgramDemo
```

### 5. Use the Application

- Log in using one of the demo users (e.g., `john@example.com` with password `password123`).
- Explore the features such as adding friends, posting on walls, and searching for users.

## Unit Tests

The project includes unit tests to ensure the functionality of key components. To run the tests, use the following commands:

### Run User Tests

```bash
java UserTest
```

### Run UserDatabase Tests

```bash
java UserDatabaseTest
```

## Screenshots

### Login Frame

Login Frame where users enter their credentials.

### Main Frame

Main Frame where users can view their profile, post on walls, and interact with friends.

### Friends Frame

Friends Frame where users can view their list of friends.

## Contributing

Contributions are welcome! If you have any suggestions or improvements, feel free to open an issue or submit a pull request.
v