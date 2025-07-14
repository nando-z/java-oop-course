# Object-Oriented Programming Project in Java

## Overview

This repository contains a Java-based project that demonstrates object-oriented programming principles and best practices. The project is built using Gradle and follows modern development workflows.

## Project Structure

```bash
├── app/
│   ├── build.gradle        # Gradle build configuration
│   └── src/
│       ├── main/           # Main source code
│       └── test/           # Test source code
├── gradle/
│   └── libs.versions.toml  # Dependency version management
├── .github/
│   └── workflows/          # CI/CD configuration
└── gradle.properties       # Gradle properties
```

## Prerequisites

- Java Development Kit (JDK) 11 or higher
- Gradle 7.x or higher (included via Gradle wrapper)

## Getting Started

1. Clone the repository:
   ```bash
   git clone https://github.com/nando-z/oop-java.git
   cd oop-java
   ```

2. Build the project:
   ```bash
   ./gradlew build
   ```

3. Run tests:
   ```bash
   ./gradlew test
   ```

## Development

- Use the provided Gradle wrapper for consistent builds
- Follow the established project structure for new code
- Ensure tests are written for new features

## Contributing

1. Fork the repository
2. Create a feature branch
3. Commit your changes
4. Push to the branch
5. Create a Pull Request

## License

This project is licensed under the terms specified in the [LICENSE](LICENSE) file.

## Contact

For questions and feedback, please open an issue in the GitHub repository.
