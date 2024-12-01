# Kafka Interview Questions

## **Core Kafka**
**Basic Level**
1. What is Apache Kafka, and what are its primary use cases?
2. Explain the role of Producers, Consumers, and Brokers in Kafka.
3. What is a Kafka topic, and how does partitioning work?
4. What is the difference between Kafka and a traditional messaging system like RabbitMQ?
5. What is a Kafka offset, and why is it important?
6. How does Kafka ensure message durability?
7. What is the role of a Kafka broker?
8. How do you configure Kafka producer and consumer properties?
9. What are consumer groups, and how do they work?
10. What is a Kafka leader and replica?


**Intermediate Level**
1. Explain the concept of log compaction in Kafka.
2. What are Kafka's delivery guarantees (at-most-once, at-least-once, exactly-once)?
3. How does Kafka handle fault tolerance?
4. What is ISR (In-Sync Replica), and why is it critical in Kafka?
5. Explain the purpose of the Kafka commit log.
6. How does Kafka achieve horizontal scalability?
7. What is the role of ZooKeeper in Kafka (for versions prior to KRaft)?
8. What are Kafka Connect and Kafka Streams, and how do they differ?
9. How do you monitor and tune Kafka for optimal performance?
10. Explain Kafka's rebalancing process.

**Advanced Level**
1. How do you configure Kafka for exactly-once semantics?
2. What are the challenges of Kafka in multi-datacenter setups, and how can you address them?
3. How does Kafka handle backpressure in high-throughput scenarios?
4. Explain Kafka's transaction support and when to use it.
5. How do you implement cross-cluster replication in Kafka?
6. What are Kafka's security features (e.g., ACLs, SSL, SASL)?
7. How would you debug consumer lag issues in Kafka?
8. What are compacted topics, and how do they differ from regular topics?
9. Explain the concept of partition reassignment in Kafka.
10. How do you set up Kafka in KRaft mode, and what are its benefits?

## **Kafka Streams**
**Basic Level**
1. What is Kafka Streams, and how is it different from other stream processing frameworks?
2. What are KStream and KTable in Kafka Streams?
3. Explain the use of state stores in Kafka Streams.
4. How does Kafka Streams ensure fault tolerance?
5. What is the purpose of windowed aggregations in Kafka Streams?

**Intermediate Level**
1. How do you handle late-arriving data in Kafka Streams?
2. Explain the difference between `join` operations in KStreams and KTables.
3. What is the role of SerDes (Serializer/Deserializer) in Kafka Streams?
4. How do you scale Kafka Streams applications?
5. What are GlobalKTables, and when would you use them?

**Advanced Level**
1. How do you optimize Kafka Streams applications for high throughput?
2. Explain how you can use Kafka Streams for event-driven microservices.
3. How do you test Kafka Streams applications effectively?
4. What is the role of the Kafka Streams Processor API?
5. How do you achieve exactly-once processing semantics in Kafka Streams?

## **Kafka Connectors**
**Basic Level**
1. What is Kafka Connect, and why is it used?
2. Explain the difference between source and sink connectors.
3. How do you configure a Kafka Connector?
4. What are the key components of Kafka Connect?
5. What is the purpose of a schema registry in Kafka Connect?

**Intermediate Level**
1. How do you implement custom transformations in Kafka Connect?
2. Explain the role of offsets in Kafka Connect.
3. What are some common connectors available in Kafka Connect?
4. How do you scale Kafka Connect workers?
5. How do you monitor and manage Kafka Connectors?

**Advanced Level**
1. How do you develop a custom Kafka Connector?
2. Explain how Kafka Connect handles schema evolution.
3. What are the best practices for deploying Kafka Connect in production?
4. How do you handle retries and error handling in Kafka Connect?
5. What is distributed mode in Kafka Connect, and how does it differ from standalone mode?

----

## Indicative Answers

---

## **Core Kafka**

**Basic Level**

1. **What is Apache Kafka, and what are its primary use cases?**  
   Kafka is a distributed event streaming platform designed for high-throughput and low-latency messaging. Use cases include real-time analytics, event sourcing, and log aggregation.

2. **Explain the role of Producers, Consumers, and Brokers in Kafka.**  
   - **Producer**: Publishes messages to Kafka topics.  
   - **Consumer**: Reads messages from topics.  
   - **Broker**: Kafka server that stores and serves messages.

3. **What is a Kafka topic, and how does partitioning work?**  
   A topic is a category for organizing messages. Partitions split topics into smaller units, enabling parallel processing and data replication.

4. **What is a Kafka offset, and why is it important?**  
   Offset is a unique identifier for a message within a partition. It helps consumers track which messages have been processed.

5. **What are consumer groups, and how do they work?**  
   A consumer group allows multiple consumers to share the workload of consuming messages from a topic, ensuring each message is processed only once.

---

**Intermediate Level**

1. **What are Kafka's delivery guarantees (at-most-once, at-least-once, exactly-once)?**  
   - **At-most-once**: Messages may be lost but not duplicated.  
   - **At-least-once**: Messages are never lost but may be duplicated.  
   - **Exactly-once**: Messages are neither lost nor duplicated (achieved with Kafka Transactions).

2. **How does Kafka handle fault tolerance?**  
   Kafka replicates data across brokers. If a broker fails, another broker with the replica takes over, ensuring data availability.

3. **What is ISR (In-Sync Replica), and why is it critical in Kafka?**  
   ISR is the set of replicas that are fully caught up with the leader. Kafka only commits messages acknowledged by all ISRs, ensuring durability.

4. **How does Kafka achieve horizontal scalability?**  
   By increasing partitions in a topic, Kafka can distribute data and processing across multiple brokers and consumers.

5. **What is the role of ZooKeeper in Kafka (for versions prior to KRaft)?**  
   ZooKeeper manages metadata, leader election, and cluster coordination in Kafka. KRaft mode eliminates this dependency.

---

**Advanced Level**

1. **How do you configure Kafka for exactly-once semantics?**  
   Enable idempotent producers and transactions in the producer configuration (`enable.idempotence=true`) and use transactional APIs for consumers.

2. **How does Kafka handle backpressure in high-throughput scenarios?**  
   Producers and consumers use configurable buffer sizes and flow control mechanisms to manage backpressure.

3. **How would you debug consumer lag issues in Kafka?**  
   Use metrics (`consumer_lag`), monitor offsets with Kafka tools, and analyze throughput, partition assignments, and broker health.

4. **Explain Kafka's transaction support and when to use it.**  
   Kafka transactions allow atomic writes to multiple topics and partitions. Use them for exactly-once use cases like payment processing.

5. **How do you implement cross-cluster replication in Kafka?**  
   Use **MirrorMaker** or **Confluent Replicator** to replicate topics between Kafka clusters for disaster recovery or data sharing.

---

## **Kafka Streams**

**Basic Level**

1. **What is Kafka Streams, and how is it different from other stream processing frameworks?**  
   Kafka Streams is a lightweight, library-based stream processing API. Unlike external processing engines, it runs inside Java applications.

2. **What are KStream and KTable in Kafka Streams?**  
   - **KStream**: Represents a stream of records.  
   - **KTable**: Represents a changelog stream, where the latest value for a key is stored.

3. **Explain the use of state stores in Kafka Streams.**  
   State stores allow storing intermediate aggregation results locally, enabling operations like joins and windowed processing.

---

**Advanced Level**

1. **How do you achieve exactly-once processing semantics in Kafka Streams?**  
   Kafka Streams uses Kafka's transactional APIs to ensure that every message is processed exactly once, even in the event of failure.

2. **How do you optimize Kafka Streams applications for high throughput?**  
   - Tune thread and buffer configurations.  
   - Use state store compression.  
   - Process data in batch sizes rather than single records.

---

## **Kafka Connectors**

**Basic Level**

1. **What is Kafka Connect, and why is it used?**  
   Kafka Connect simplifies data integration between Kafka and external systems like databases, file systems, or other message brokers.

2. **Explain the difference between source and sink connectors.**  
   - **Source connectors** pull data into Kafka topics from external systems.  
   - **Sink connectors** push data from Kafka topics into external systems.

---

**Intermediate Level**

1. **What are some common connectors available in Kafka Connect?**  
   - JDBC Connector (for databases).  
   - HDFS Connector (for Hadoop).  
   - ElasticSearch Connector (for indexing).

2. **How do you implement custom transformations in Kafka Connect?**  
   Extend the `Transformation` interface to implement custom logic for modifying records during data transfer.

---

**Advanced Level**

1. **How do you develop a custom Kafka Connector?**  
   Implement the `SourceConnector` or `SinkConnector` interface and define the configuration, task management, and data transfer logic.

2. **What are the best practices for deploying Kafka Connect in production?**  
   - Use distributed mode for fault tolerance.  
   - Monitor connector metrics.  
   - Ensure proper schema management.  

---
---