# 🚀 BFF API - Backend For Frontend

Este projeto utiliza **Java Spring Boot** para construir um **Backend For Frontend (BFF)**, com o banco de dados **PostgreSQL**. Vamos realizar o deploy na **AWS**, aproveitando serviços como **EC2**, **RDS**, **VPC**, **S3**, e muito mais! Durante o desenvolvimento, abordaremos conceitos como paginação, filtros, modelagem de dados e arquitetura de soluções. Você vai sair **PRO no Backend** 💪🏼.

## 🛠️ Tecnologias Utilizadas

- **Framework**: Spring Boot 3.x
- **Banco de Dados**: PostgreSQL
- **Deploy**: AWS (EC2, RDS, VPC, S3)
- **Gerenciamento de Dependências**: Maven

## 🌟 Funcionalidades

- **Paginação**: Para lidar eficientemente com grandes volumes de dados.
- **Filtros Dinâmicos**: Personalize suas consultas para retornar dados específicos.
- **Modelagem de Dados**: Estrutura sólida usando PostgreSQL.

## 🧩 Estrutura do Projeto

- **Controller**: Gerencia as requisições HTTP.
- **Service**: Lógica de negócio e regras do sistema.
- **Repository**: Conexão com o banco de dados e manipulação de dados.
- **Model**: Definição das entidades do banco de dados.

## 🚀 Deploy na AWS

A aplicação será hospedada na AWS, utilizando:

- **EC2**: Instância de servidor onde nossa aplicação será executada.
- **RDS**: Banco de dados PostgreSQL gerenciado na nuvem.
- **VPC**: Para isolamento e segurança da nossa infraestrutura.
- **S3**: Armazenamento de arquivos e dados estáticos.

### 📋 Passos para o Deploy

1. **EC2**: Crie uma instância EC2 para a aplicação.
2. **RDS**: Configure o banco de dados PostgreSQL no RDS.
3. **VPC**: Crie sub-redes públicas e privadas para maior segurança.
4. **S3**: Configure o S3 para armazenar arquivos necessários.
5. **Deploy**: Conecte tudo e faça o deploy da aplicação na EC2 com o banco no RDS.

## 🛠️ Como Rodar o Projeto Localmente

### Pré-requisitos

- Java 17+
- PostgreSQL instalado e configurado
- Maven