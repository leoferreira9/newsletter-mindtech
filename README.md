# 📨 Mindtech Newsletter

Projeto desenvolvido como parte do processo seletivo da **Mindtech**.

---
## 🚀 Como executar o projeto (via IntelliJ + MySQL)

### **Clone o repositório: https://github.com/leoferreira9/newsletter-mindtech.git

### 1️⃣ Pré-requisitos
- Ter o **MySQL** instalado e rodando.
- Ter o **IntelliJ IDEA** instalado.
- Ter o **Java 21.**
  
 ---
### 2️⃣ Configurar o banco de dados MySQL

1. Crie o banco de dados no MySQL:
```sql
CREATE DATABASE mindtech_newsletter;
```
2. Abra o projeto no intelliJ, em seguida, renomear o arquivo abaixo:
```
src/main/resources/application-example.properties
```
Para:
```
src/main/resources/application.properties
```

3. Após renomear para application.properties, ajuste o usuário, senha e o nome do banco (mindtech_newsletter) conforme seu MySQL local.

### 3️⃣ Executar o projeto no IntelliJ
1. Vá até o arquivo principal da aplicação (src/main/java/MindtechNewsletterApplication.java).
2. Clique em Run ▶️ na parte superior da IDE.
3. O servidor iniciará em: http://localhost:8080

### 4️⃣ Acessar a aplicação
- Abra no navegador: http://localhost:8080/index.html
- Agora é possível:
  - Inserir um e-mail e clicar em “Inscrever-se”.
  - Ver a mensagem de agradecimento.
  - Ver os registros salvos no banco de dados MySQL.
