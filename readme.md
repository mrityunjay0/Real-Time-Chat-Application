# 💬 JustChat – Real-Time Chat Application

A **real-time chat application** built with **Spring Boot WebSocket (STOMP + SockJS)** and **Thymeleaf**.  
This project demonstrates bi-directional communication between client and server using WebSockets.
---

## 🚀 Features
- Real-time messaging using **Spring WebSocket** & **STOMP protocol**
- Simple in-memory message broker (`/topic`)
- Bootstrap-styled responsive UI
- Multiple users can join and chat simultaneously
- Auto-scroll chat window
---

## 🛠️ Tech Stack
- **Backend**: Spring Boot, Spring WebSocket, STOMP
- **Frontend**: Thymeleaf, Bootstrap 5, JavaScript
- **Messaging**: SockJS + STOMP.js
- **Build Tool**: Maven
- **Runtime**: Java 21

---

## 📂 Project Structure
```
JustChat/
├── src/main/java/com/justChat/JustChat/
│   ├── config/         # WebSocket configuration
│   ├── controller/     # REST + WebSocket controllers
│   ├── model/          # ChatMessage DTO
│   └── JustChatApplication.java
├── src/main/resources/
│   ├── templates/      # Thymeleaf views (chat.html)
│   └── application.properties
└── pom.xml
```

---

## ▶️ Getting Started

### Prerequisites
- Java 21+
- Maven 3+
- Any IDE (IntelliJ IDEA recommended)

### Steps to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/mrityunjay0/Real-Time-Chat-Application.git
   cd JustChat
   ```
2. Build and run the app:
   ```bash
   mvn spring-boot:run
   ```
3. Open in browser:
   ```
   http://localhost:8080/chat
   ```

---
---

## 📌 Next Improvements
- [ ] Store chat messages in a database (MySQL/PostgreSQL + JPA)
- [ ] Add user authentication
- [ ] Deploy to cloud (Heroku/AWS/GCP)

---

## 🤝 Contributing
Pull requests are welcome! If you’d like to add new features, just open an issue first to discuss.
---