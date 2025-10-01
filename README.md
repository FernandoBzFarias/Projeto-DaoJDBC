# Projeto DAO com JDBC
Este projeto é um exemplo de implementação do padrão DAO (Data Access Object) em Java utilizando JDBC para conexão com banco de dados MySQL.  
Ele demonstra operações CRUD (Create, Read, Update, Delete) em duas entidades principais: `Seller` e `Departament`.

O projeto inclui:  
- Entidades Java (`Seller` e `Departament`) com getters, setters, `hashCode`, `equals` e `toString`.  
- Interfaces DAO (`SellerDao`, `DepartamentDao`) definindo os métodos de persistência.  
- Implementações JDBC (`SellerDaoJDBC`) que executam consultas SQL usando `PreparedStatement`.  
- Classe utilitária `DB` para gerenciamento de conexão, statements e result sets.  
- Exceções customizadas (`DbException`, `DbIntegrityException`).  
- Classe `DaoFactory` para criação desacoplada de DAOs.  
- Classe `Program` para teste das operações do DAO.

Tecnologias: 
- Java 8+  
- JDBC  
- MySQL  
- IDE: qualquer compatível com Java (Eclipse, IntelliJ, VS Code)  


## Configuração do banco de dados
1. Crie um banco MySQL (ex.: `bancodois`).  
2. Crie as tabelas necessárias:
// crie com sql o banco: 
CREATE TABLE department (
    Id INT AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(100) NOT NULL
);

CREATE TABLE seller (
    Id INT AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(100) NOT NULL,
    Email VARCHAR(100),
    BirthDate DATE,
    BaseSalary DOUBLE,
    DepartmentId INT,
    FOREIGN KEY (DepartmentId) REFERENCES department(Id)
);

arquivo db.properties
user=SEU_USUARIO
password=SUA_SENHA
dburl=jdbc:mysql://localhost:3306/bancodois
useSSL=false

