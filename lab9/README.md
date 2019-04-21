### Traditional Strategy Pattern Implementation

---

Strategy is a behavioral design pattern that lets you define a family of algorithms, put each of them into a separate class, and make their objects interchangeable. The Traditional strategy pattern calculates the MD5 or the SHA-256 hash of the input string. The interface 'HashAlgorithm' declares a method for hash calculation which is then implemented independently by following classes.

- MD5Sum
- SHA256Sum

The HashingContext class sets appropriate contexts between the two. Depending on the current strategy, either MD5 or SHA256 hash is displayed on screen.

### Lambda Implementation

---

In the functional implementation, we define 'HashAlgorithm' interface but provide no implementation to the calculateHash() method. The 'Main' is the driver class here where we create a list of both the Strategies: MD5 and SHA256. Java lambda function is used to provide the implementation for each strategy. Then we iterate through this list and run each strategy for an input plaintext.

Thus, using the Lambda functions, we eliminate the creation of separate implementations for each strategy. Lambda implementation is less verbose as compared to the traditional strategy pattern implementation.
