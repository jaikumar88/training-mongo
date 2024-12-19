# mongo

This project was created using the [Ktor Project Generator](https://start.ktor.io).

Here are some useful links to get you started:

- [Ktor Documentation](https://ktor.io/docs/home.html)
- [Ktor GitHub page](https://github.com/ktorio/ktor)
- The [Ktor Slack chat](https://app.slack.com/client/T09229ZC6/C0A974TJ9). You'll need to [request an invite](https://surveys.jetbrains.com/s3/kotlin-slack-sign-up) to join.

## Features

Here's a list of features included in this project:

| Name                                                                   | Description                                                                        |
| ------------------------------------------------------------------------|------------------------------------------------------------------------------------ |
| [HSTS](https://start.ktor.io/p/hsts)                                   | Enables HTTP Strict Transport Security (HSTS)                                      |
| [CORS](https://start.ktor.io/p/cors)                                   | Enables Cross-Origin Resource Sharing (CORS)                                       |
| [Authentication](https://start.ktor.io/p/auth)                         | Provides extension point for handling the Authorization header                     |
| [Routing](https://start.ktor.io/p/routing)                             | Provides a structured routing DSL                                                  |
| [Authentication OAuth](https://start.ktor.io/p/auth-oauth)             | Handles OAuth Bearer authentication scheme                                         |
| [Authentication JWT](https://start.ktor.io/p/auth-jwt)                 | Handles JSON Web Token (JWT) bearer authentication scheme                          |
| [Content Negotiation](https://start.ktor.io/p/content-negotiation)     | Provides automatic content conversion according to Content-Type and Accept headers |
| [GSON](https://start.ktor.io/p/ktor-gson)                              | Handles JSON serialization using GSON library                                      |
| [kotlinx.serialization](https://start.ktor.io/p/kotlinx-serialization) | Handles JSON serialization using kotlinx.serialization library                     |
| [Exposed](https://start.ktor.io/p/exposed)                             | Adds Exposed database to your application                                          |
| [MongoDB](https://start.ktor.io/p/mongodb)                             | Adds MongoDB database to your application                                          |
| [Caching Headers](https://start.ktor.io/p/caching-headers)             | Provides options for responding with standard cache-control headers                |
| [Static Content](https://start.ktor.io/p/static-content)               | Serves static files from defined locations                                         |

## Building & Running

To build or run the project, use one of the following tasks:

| Task                                                     | Description       |
| ----------------------------------------------------------|------------------- |
| `mvn test`                                               | Run the tests     |
| `mvn package`                                            | Build the project |
| `java -jar target/mongo-0.0.1-jar-with-dependencies.jar` | Run the server    |

If the server starts successfully, you'll see the following output:

```
2024-12-04 14:32:45.584 [main] INFO  Application - Application started in 0.303 seconds.
2024-12-04 14:32:45.682 [main] INFO  Application - Responding at http://0.0.0.0:8080
```
