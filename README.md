Refers also to:
https://github.com/MoaazSuliman/Spring-Cloud-Configuration as resource repository for the configurations 
https://github.com/MoaazSuliman/Spring-Cloud-Configuration-Server as spring configuration server  for this configuration client 

Configuration Management "Externalized Config"(Spring Cloud Config Server)
		- Make all the configuration are separated in a service, It exposeses the configuration in Rest Endpoints.
		- It can be versioning by Git.
		- When any services start, It pulls the configuration from Configuration S.
		- Example : Database connetions, external services urls,....
		- **Why?!**
			- Managing a lot of microservices configuration is too hard, So we have them all centalized in one place.
			- Single source of truth.
			- Storing configurations.
			- Refresh configurations without restart by "Actuator" & @RefreshScope.
			- Dynamic Refresh Configuration(Spring Cloud Bus + RabbitMQ).
			- Support Diff Envs.
			- Encryption and Decryption.
		- **Challenges**
			- Security.
			- Refresh Time.
			- Environment Isolation.
		- **Components** 
			  1. Config Client (User Service, Product Service, Order Service)
			  2. Config Server
			  3. DB or Repo or Files which has all the configuration files.
