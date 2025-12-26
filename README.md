# Banking System

Sistema bancário desenvolvido em Java, com foco em Programação Orientada a Objetos (POO) e arquitetura em camadas, aplicando boas práticas de modelagem de domínio e organização de código.
Este projeto tem caráter evolutivo, sendo utilizado como base de estudos e aprimoramento contínuo em backend Java.

---

## Visão Geral

### Objetivo do Projeto
- Aplicar conceitos fundamentais de POO de forma prática
- Utilizar interfaces e classes abstratas para definição de comportamentos comuns
- Implementar uma arquitetura em camadas, promovendo separação de responsabilidades
- Exercitar boas práticas modernas do Java, como:
  - uso de enum para regras e estados do domínio
  - uso de record para transferência de dados (DTOs)
- Criar uma base sólida e extensível para evoluções futuras

**Este projeto foi desenvolvido com foco em:**
- Clareza de domínio
- Separação de responsabilidades
- Arquitetura em camadas
- Código limpo e manutenível

---

## Tabela de Conteúdos
<!--- [Demonstração](#demonstração)  
- [Funcionalidades](#funcionalidades)  -->
- [Regras de Negócio](#regras-de-negócio)  
- [Arquitetura e Design](#arquitetura-e-design)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)  
- [Como Executar](#como-executar)  
- [Próximas Evoluções](#próximas-evoluções)  
- [Nota para Recrutadores](#nota-para-recrutadores)
- [Licença](#licença)

---
<!--
## Demonstração
> Opcional: GIF, print ou saída esperada da aplicação.

---


## Funcionalidades

Liste as principais funcionalidades:

- Funcionalidade 1

- Funcionalidade 2

- Funcionalidade 3


> Se for um CRUD, deixe claro:

> - Criação

> - Listagem

> - Atualização

> - Remoção


---
-->
## Regras de Negócio
Descreva as regras importantes do domínio:
- O saldo da conta não pode ser negativo
- Operações de depósito possuem uma taxa de 1% aplicada ao valor depositado

---

## Arquitetura e Design
O projeto será desenvolvido seguindo uma arquitetura em camadas, com responsabilidades bem definidas, visando:
- Código mais legível e organizado
- Facilidade de manutenção e evolução
- Clareza na separação entre regras de negócio e camadas de acesso

> A estrutura do projeto será refinada conforme novas funcionalidades e conceitos forem incorporados.
<!--
```
src/main/java

└── br/com/domain/projectname

    ├── controller   # Camada de entrada (API / CLI / Interface)

    ├── service      # Regras de negócio e orquestração

    ├── repository   # Acesso a dados

    ├── domain       # Entidades e regras de domínio

    ├── dto          # DTOs (Request / Response)

    └── exception    # Exceções da aplicação / domínio
```
-->

### Planejamento Arquitetural Inicial
- Planejamento de separação entre domínio, aplicação e infraestrutura
- Intenção de uso de DTOs para evitar exposição de entidades
- Diretriz de manter o domínio independente de frameworks
- Planejamento de exceções específicas para regras de negócio

---

🚧 Status do Projeto

🔹 Versão inicial

---

## Tecnologias Utilizadas
- Linguagem: Java
- Build: Gradle
- Execução: CLI

---

## Como Executar
1. Clone o repositório:
```bash
git clone https://github.com/samuel-d3v/banking-system.git
```
2. Acesse o diretório:
```bash
cd banking-system
```  
3. Execute via Gradle Wrapper:
    - Windows
      ```bash
      .\gradlew.bat run
      ```
    - Linux / macOS
      ```bash
      ./gradlew run
      ```
*(ajuste conforme o projeto)*

---

## Próximas Evoluções
 - [ ] Melhorar cobertura de validações
 - [ ] Persistência em banco de dados
 - [ ] Adicionar testes unitários
 - [ ] Evolução para API REST
 - [ ] Integração com framework (Spring Boot, etc)

---

## Nota para Recrutadores
Este projeto foi desenvolvido com foco em boas práticas de desenvolvimento backend Java, priorizando:
- Organização de código
- Clareza de domínio
- Arquitetura limpa
- Evolução incremental
Mesmo quando simples, as decisões técnicas refletem cenários reais de aplicações backend.

---

## Licença
Este projeto está sob a licença MIT.
Veja o arquivo [LICENSE](LICENSE) para mais detalhes.