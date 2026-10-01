# Sistema Clínica API

API REST para gerenciamento de uma clínica, desenvolvida como projeto de portfólio e estudo.

## Tecnologias
Java 17 · Spring Boot 3.5.6 · Spring Data JPA · PostgreSQL · Maven · Docker · REST API

## Funcionalidades
- Cadastro e consulta de pacientes
- Cadastro e consulta de médicos
- Cadastro e consulta de especialidades
- Agendamento, consulta e cancelamento de consultas
- Filtro de consultas por período
- Persistência em PostgreSQL

## Como executar
```bash
docker compose up -d
cd backend
mvn spring-boot:run
```
API: `http://localhost:8080`

## Endpoints
- GET/POST `/api/pacientes`
- GET/POST `/api/medicos`
- GET/POST `/api/especialidades`
- GET `/api/consultas`
- GET `/api/consultas/periodo?inicio=...&fim=...`
- POST `/api/consultas`
- PATCH `/api/consultas/{id}/cancelar`

Projeto educacional/portfólio para praticar APIs REST, modelagem de dados, JPA, PostgreSQL e Spring Boot.

**Autor:** Luis Fillipe Backer Faria
**GitHub:** https://github.com/lfillipebf-ai
