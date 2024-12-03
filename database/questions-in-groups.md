## 7 Basic/Fundamental Database Quesitons  

📌 **What is database normalization, and why is it important?**  
👉 Database normalization minimizes redundancy and ensures data integrity by organizing data into structured tables.  

📌 **How do SQL and NoSQL databases differ, and when would you use one over the other?**  
👉 SQL databases are relational, good for structured data and transactions. NoSQL databases are non-relational, ideal for unstructured or hierarchical data and horizontal scaling.  

📌 **How do you design a schema for a system handling time-series data?**  
👉 Time-series data can be efficiently managed by partitioning tables based on time intervals and using indexes to optimize queries.  

📌 **What are the trade-offs of using indexing in a database?**  
👉 Indexes improve query performance but increase storage requirements and slow down write operations.  

📌 **How do you approach designing a database for a microservices-based architecture?**  
👉 Prefer database-per-service patterns, ensuring clear data ownership and avoiding cross-service dependencies.  

📌 **What strategies can you use to handle high read/write throughput in a database?**  
👉 Implement caching, replication, sharding, and connection pooling for efficient database operations.  

📌 **What are ACID properties, and why are they important for transactions?**  
👉 Atomicity, Consistency, Isolation, and Durability ensure reliability and correctness in database transactions.  

--

## 7 Scenario-Based Database Quesitons

📌 **You need to design a database for an e-commerce platform. How would you ensure scalability to handle millions of users and transactions?**  
👉 Consider sharding for horizontal scaling, caching for frequent queries, and partitioning for large datasets.  

📌 **A reporting query on a large table is running slowly. How would you optimize its performance?**  
👉 Analyze the query with `EXPLAIN` or similar tools, add appropriate indexes, and consider materialized views for pre-computed results.  

📌 **How would you design a database to handle real-time analytics on incoming IoT data from sensors?**  
👉 Use a time-series database or partition tables by time, implement write-optimized storage, and pre-aggregate data for quick analytics.  

📌 **You are migrating a legacy SQL database to a modern NoSQL database. What factors would you consider during migration?**  
👉 Understand data access patterns, map relational schema to NoSQL, handle denormalization, and ensure data consistency during the transition.  

📌 **A customer-facing application is experiencing high latency due to database contention. How would you troubleshoot and resolve this?**  
👉 Investigate lock contention, optimize queries, increase isolation levels as needed, and scale write operations by introducing replicas or sharding.  

📌 **Your team needs to implement a multi-tenant database system. How would you design it to ensure security and isolation?**  
👉 Use separate schemas or databases for each tenant, enforce row-level security, and ensure proper indexing to handle tenant-specific queries efficiently.  

📌 **A financial application requires strict ACID compliance for transactions. How would you ensure it in a distributed database system?**  
👉 Implement two-phase commit protocols or distributed transactions, and consider databases like PostgreSQL or Spanner, which natively support strong consistency.  

---
