# Mock Interview Set 2 | Java Backend Developer Mock Interviews 

### 1st Round: Technical (1 Hour)

#### Core Java
1. **What are the differences between an abstract class and an interface in Java? When would you use each?**
2. **Explain the concept of Java's memory model, including stack vs. heap memory.**
3. **What is the purpose of the `volatile` keyword in Java?**
4. **Describe how exception handling works in Java. What is the difference between checked and unchecked exceptions?**

#### Data Structures and Algorithms
5. **How would you implement a basic stack data structure in Java?**
6. **Explain the concept of a hash collision and how it is handled in Java's HashMap.**
7. **Write a Java method to sort an array using the Merge Sort algorithm.**
8. **How would you find the shortest path in an unweighted graph using Java?**

#### Spring Framework
9. **What is Spring Boot's auto-configuration, and how does it work?**
10. **Explain the concept of bean scopes in Spring. What are the different types and their uses?**
11. **How do you use Spring Boot to integrate with a message broker like RabbitMQ?**

#### Database and ORM
12. **Explain the difference between a primary key and a foreign key in a relational database.**
13. **What is the purpose of the `@Entity` annotation in JPA, and how does it relate to database tables?**
14. **Write a JPA query to fetch all records from a table where a column value is greater than a specified value.**

#### Microservices and RESTful APIs
15. **What are some common design patterns used in microservices architecture?**
16. **How do you handle rate limiting and throttling in a REST API?**
17. **Explain the concept of service discovery and how it can be implemented in a microservices architecture.**

#### Messaging and Kafka
18. **What is the role of Kafka brokers, producers, and consumers in a Kafka setup?**
19. **How would you handle schema evolution in a Kafka topic?**
20. **Explain the concept of Kafka topics and partitions. How does data distribution work?**

#### Testing and CI/CD
21. **What are the benefits of using Mockito for unit testing in a Java application?**
22. **Explain how you would set up a basic CI/CD pipeline using GitHub Actions or GitLab CI for a Spring Boot application.**

#### Cloud and Deployment
23. **How would you deploy a Java Spring Boot application to a cloud platform like AWS?**
24. **What are some common practices for managing configuration and secrets in a cloud-native application?**

These questions cover a range of topics relevant to a Java backend developer and provide a balanced mix of easy and hard questions to assess the candidate's skills and knowledge.

---------------
---------------
---------------
---------------
---------------
---------------

## Short Answers for each of the above questions

Here are short answers for each of the provided questions:

### Core Java

1. **What are the differences between an abstract class and an interface in Java? When would you use each?**
   - **Answer:** An abstract class can have both abstract and concrete methods and is used when classes share common behavior. An interface only has abstract methods (until Java 8) and is used to define a contract that other classes can implement.

2. **Explain the concept of Java's memory model, including stack vs. heap memory.**
   - **Answer:** Stack memory stores method calls and local variables, and is managed automatically. Heap memory is used for objects and their data, and is managed by the garbage collector.

3. **What is the purpose of the `volatile` keyword in Java?**
   - **Answer:** The `volatile` keyword ensures that changes to a variable are visible to all threads immediately, preventing caching issues.

4. **Describe how exception handling works in Java. What is the difference between checked and unchecked exceptions?**
   - **Answer:** Exception handling in Java uses `try`, `catch`, and `finally` blocks. Checked exceptions must be declared or caught, while unchecked exceptions (runtime exceptions) do not need to be explicitly handled.

### Data Structures and Algorithms

5. **How would you implement a basic stack data structure in Java?**
   - **Answer:** Use a `LinkedList` or an `ArrayList` and provide `push`, `pop`, and `peek` methods to manage the stack.

6. **Explain the concept of a hash collision and how it is handled in Java's HashMap.**
   - **Answer:** A hash collision occurs when two keys hash to the same index. Java’s `HashMap` handles collisions using linked lists or trees at the same index.

7. **Write a Java method to sort an array using the Merge Sort algorithm.**
   - **Answer:** Implement a recursive merge sort that divides the array into halves, sorts each half, and merges the sorted halves.

8. **How would you find the shortest path in an unweighted graph using Java?**
   - **Answer:** Use Breadth-First Search (BFS), which explores all nodes at the present depth level before moving on to nodes at the next depth level.

### Spring Framework

9. **What is Spring Boot's auto-configuration, and how does it work?**
   - **Answer:** Auto-configuration automatically configures Spring application based on dependencies present in the classpath, simplifying application setup.

10. **Explain the concept of bean scopes in Spring. What are the different types and their uses?**
    - **Answer:** Bean scopes include Singleton (one instance per Spring container), Prototype (new instance each time requested), Request (one instance per HTTP request), and Session (one instance per HTTP session).

11. **How do you use Spring Boot to integrate with a message broker like RabbitMQ?**
    - **Answer:** Add RabbitMQ dependencies, configure connection properties, and use `@RabbitListener` for consuming messages and `RabbitTemplate` for sending messages.

### Database and ORM

12. **Explain the difference between a primary key and a foreign key in a relational database.**
    - **Answer:** A primary key uniquely identifies a record in a table, while a foreign key is used to establish a link between two tables.

13. **What is the purpose of the `@Entity` annotation in JPA, and how does it relate to database tables?**
    - **Answer:** The `@Entity` annotation marks a class as a JPA entity, mapping it to a database table.

14. **Write a JPA query to fetch all records from a table where a column value is greater than a specified value.**
    - **Answer:** `@Query("SELECT e FROM Entity e WHERE e.column > :value") List<Entity> findByColumnGreaterThan(@Param("value") int value);`

### Microservices and RESTful APIs

15. **What are some common design patterns used in microservices architecture?**
    - **Answer:** Common patterns include API Gateway, Service Registry, Circuit Breaker, and Strangler Fig.

16. **How do you handle rate limiting and throttling in a REST API?**
    - **Answer:** Implement rate limiting using tokens, quotas, or request counting, and apply throttling at the API gateway or within application logic.

17. **Explain the concept of service discovery and how it can be implemented in a microservices architecture.**
    - **Answer:** Service discovery allows microservices to find each other dynamically. Implement it using tools like Eureka or Consul, which maintain a registry of available services.

### Messaging and Kafka

18. **What is the role of Kafka brokers, producers, and consumers in a Kafka setup?**
    - **Answer:** Brokers store and manage messages, producers publish messages to topics, and consumers read messages from topics.

19. **How would you handle schema evolution in a Kafka topic?**
    - **Answer:** Use schema versioning and tools like Confluent Schema Registry to manage changes and ensure compatibility.

20. **Explain the concept of Kafka topics and partitions. How does data distribution work?**
    - **Answer:** Topics are categories for messages, and partitions are segments of a topic. Data is distributed across partitions to ensure parallelism and scalability.

### Testing and CI/CD

21. **What are the benefits of using Mockito for unit testing in a Java application?**
    - **Answer:** Mockito allows you to create mock objects, define their behavior, and verify interactions, making it easier to test individual components in isolation.

22. **Explain how you would set up a basic CI/CD pipeline using GitHub Actions or GitLab CI for a Spring Boot application.**
    - **Answer:** Define a pipeline in `.github/workflows` (GitHub) or `.gitlab-ci.yml` (GitLab) to build, test, and deploy the application automatically on code changes.

### Cloud and Deployment

23. **How would you deploy a Java Spring Boot application to a cloud platform like AWS?**
    - **Answer:** Package the application as a JAR or WAR, use AWS services like Elastic Beanstalk or EC2, and deploy using AWS CLI or management console.

24. **What are some common practices for managing configuration and secrets in a cloud-native application?**
    - **Answer:** Use environment variables, secrets management services (e.g., AWS Secrets Manager, Azure Key Vault), and configuration files to securely manage sensitive data.