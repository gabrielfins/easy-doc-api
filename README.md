# Easy Doc — API

API REST do **Easy Doc**, plataforma que conecta **médicos** e **hospitais**: hospitais publicam plantões e médicos encontram e aceitam propostas de acordo com a sua especialidade.

Projeto de Extensão da disciplina *Programação Orientada a Objetos em Java* (2023.2) — Universidade Estácio de Sá.

> O front-end está em [easy-doc-web](https://github.com/gabrielfins/easy-doc-web).

## Tecnologias

- Java 17
- Spring Boot (Web, Data JPA, Security, Validation)
- H2 (banco em memória)
- Maven (wrapper incluído)

## Modelo de dados

| Entidade | Campos principais |
| --- | --- |
| `Hospital` | razão social, nome fantasia, CNPJ, e-mail, telefone, endereço completo |
| `Medico` | nome, CPF, CRM, especialidade, data de nascimento, e-mail, telefones |
| `Proposta` | hospital, médico, data e hora de início |

## Endpoints

Base: `http://localhost:8000/api`

| Recurso | Rotas |
| --- | --- |
| `/hospitais` | `GET /{id}`, `GET /email/{email}`, `POST /login`, `DELETE /{id}` |
| `/medicos` | `GET /{id}`, `GET /email/{email}`, `POST /login`, `DELETE /{id}` |
| `/propostas` | `GET /{id}`, `GET /especialidade/{especialidade}`, `DELETE /{id}` |

## Como executar

Pré-requisito: JDK 17.

```bash
./mvnw spring-boot:run
```

(no Windows: `mvnw.cmd spring-boot:run`)

- API: `http://localhost:8000/api`
- Console do H2: `http://localhost:8000/api/h2-console` (JDBC URL `jdbc:h2:mem:shifts-manager`)
- Dados de exemplo: `src/main/resources/import.sql`

Para rodar os testes:

```bash
./mvnw test
```

> O banco é em memória: os dados são reiniciados a cada execução.
> O CORS está liberado apenas para `http://localhost:4200` (o front-end em desenvolvimento) — veja `config/WebConfig.java`.
