# 🏎️ Locadora - Sistema de Aluguel de Carros 👨‍💻

> [!NOTE]
> Sistema web para gestão de aluguer de automóveis, permitindo o fluxo completo desde o pedido do cliente até à avaliação por agentes bancários.
> **Foco:** Automatização do ciclo de vida de contratos e análise de crédito.

---

## 🚧 Status do Projeto

![Versão](https://img.shields.io/badge/Versão-v1.0.0-blue?style=for-the-badge)
![Java](https://img.shields.io/badge/Java-17-007ec6?style=for-the-badge\&logo=openjdk\&logoColor=white)
![Micronaut](https://img.shields.io/badge/Micronaut-4.x-black?style=for-the-badge\&logo=micronaut\&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-3.9-007ec6?style=for-the-badge\&logo=apachemaven\&logoColor=white)
![Thymeleaf](https://img.shields.io/badge/Thymeleaf-3.1-007ec6?style=for-the-badge\&logo=thymeleaf\&logoColor=white)

---

## 📚 Índice

* [Sobre o Projeto](#-sobre-o-projeto)
* [Funcionalidades Principais](#-funcionalidades-principais)
* [Tecnologias Utilizadas](#-tecnologias-utilizadas)
* [Arquitetura](#-arquitetura)
* [Instalação e Execução](#-instalação-e-execução)
* [Estrutura de Pastas](#-estrutura-de-pastas)
* [Autores](#-autores)

---

## 📝 Sobre o Projeto

Este projeto simula um ecossistema real de aluguer de veículos onde a posse do bem pode variar conforme o contrato.

* **Propósito:** Digitalizar o processo de pedidos de aluguer e avaliação de crédito
* **Problema Resolvido:** Elimina processos manuais e centraliza a análise financeira
* **Contexto:** Trabalho académico da PUC Minas

---

## ✨ Funcionalidades Principais

* 🔑 **Gestão de Utilizadores:** Cadastro de clientes com dados de identificação
* 📝 **Ciclo de Pedidos:** CRUD completo de pedidos de aluguer
* ⚖️ **Avaliação de Agentes:** Aprovação por bancos/empresas
* 🖼️ **Interface Temática:** Design focado em carros desportivos
* 💾 **Persistência JPA:** Integração com banco de dados

---

## 🛠 Tecnologias Utilizadas

### 🖥️ Back-end & Front-end

* **Framework:** Micronaut 4.x (Java 17)
* **Template Engine:** Thymeleaf
* **Banco de Dados:** H2 / PostgreSQL
* **Estilização:** CSS3 + Google Fonts
* **Build Tool:** Maven

---

## 🏗 Arquitetura

O sistema segue o padrão **MVC (Model-View-Controller)**.

### Diagramas

|                                                      Diagrama de Pacotes                                                     |                                                      Diagrama de Classes                                                      |
| :--------------------------------------------------------------------------------------------------------------------------: | :---------------------------------------------------------------------------------------------------------------------------: |
| <img src="https://github.com/diogotorres13/Aluguel_de_Carros/blob/main/Diagramas/Diagrama%20de%20Pacotes.png" width="120px"> | <img src="https://github.com/diogotorres13/Aluguel_de_Carros/blob/main/Diagramas/Diagrama%20de%20Classes1.png" width="120px"> |

---

## 🔧 Instalação e Execução

### Pré-requisitos

* Java JDK 17+
* Maven

### Passos

```bash
./mvnw clean compile
./mvnw mn:run
```

🚀 Disponível em: http://localhost:8080

---

## 📂 Estrutura de Pastas

```text
.
├── Diagramas/            # Modelagem UML
├── src/main/java/        # Código-fonte Java (Controllers, Models, Repositories)
├── src/main/resources/
│   ├── views/            # Templates HTML (Thymeleaf)
│   ├── public/           # Assets (Imagens, CSS)
│   └── application.yml   # Configurações do Micronaut
└── pom.xml               # Dependências Maven
```


---

## 👨‍💻 Autores

* **Diogo Chaves Torres**
  GitHub: https://github.com/diogotorres13

---

## ⚖️ Licença

Este projeto está sob a licença MIT.
