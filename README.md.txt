# 🧮 Calculadora Simples com Testes Unitários em Java

Este projeto implementa uma calculadora simples com operações básicas em Java, acompanhada de testes unitários usando **JUnit**.

---

## 🚀 Tecnologias Utilizadas

- Java 17+
- JUnit 5
- Maven (ou Gradle)

---

## 📁 Estrutura do Projeto

```
meuestudojava/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── javastudy/
│   │               └── Calculadora.java
│   │               └── Main.java
│   │               └── MainCalculadora.java
│   └── test/
│       └── java/
│           └── com/
│               └── javastudy/
│                   └── TesteCalculadora.java
├── .gitignore                  
├── pom.xml
└── README.md
```

---

## ⚙️ Como Executar

### 1. Clone o repositório:

```bash
git clone https://github.com/gttiGS/EstudosTestesUnitarios.git
cd calculadora-java-testes
```

### 2. Compile o projeto:

```bash
mvn clean compile
```

### 3. Execute os testes:

```bash
mvn test
```

---

## ✅ Funcionalidades da Calculadora

- `soma(int a, int b)`
- `sub(int a, int b)`
- `divisao(float a, float b)`
- `isPar(int valor)`

---

## 🧪 Testes Unitários

Os testes verificam o comportamento de cada operação, incluindo:

- Soma de dois inteiros positivos
- Soma de dois inteiros negativos
- Soma de dois zeros
- Subtração
- Divisão com ponto flutuante
- Verificação de número par 
- Verificação de número ímpar

---

## 📄 Licença

Este projeto está licenciado sob a [MIT License](LICENSE).

---

## 👨‍💻 Autor

Gustavo Supranzetti – [@gttiGS](https://github.com/gttiGS)
