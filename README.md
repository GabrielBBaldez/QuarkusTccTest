# API Quarkus

## Visão Geral

Este projeto é uma API RESTful implementada usando o framework Quarkus, projetada para comparação de desempenho com o Spring Boot. A API fornece operações CRUD e foi implantada na AWS EC2 com conexão a um banco de dados RDS.

## Detalhes Técnicos

### Ambiente
- **Hospedagem**: AWS EC2
- **Banco de Dados**: AWS RDS
- **Testes**: Aproximadamente 1000 requisições por tipo de operação

### Métricas de Desempenho

| Operação | Latência Média (ms) | Throughput (B/s) | Requisições/seg |
|----------|---------------------|------------------|-----------------|
| GET      | 767,23              | 664,93           | 1,27            |
| POST     | 2023,69             | 77,04            | 0,49            |
| PUT      | 2925,90             | 178,41           | 0,34            |
| DELETE   | 0,00                | 10,11            | 0,34            |

## Projeto Comparativo em Spring Boot

Para uma comparação direta com esta implementação, consulte o projeto Spring Boot equivalente:
- [SpringTccTest](https://github.com/GabrielBBaldez/SpringTccTest/tree/main)

### Pré-requisitos
- Java 11 
- Maven
- Conta AWS (para implantação similar)

