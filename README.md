# Backend Java Repository Template

## Sobre o repositório

Este repositório serve como **template base** para a criação de novos projetos **backend em Java**, com foco em **padronização arquitetural, organização de código e boas práticas**.
O objetivo é fornecer uma estrutura inicial **sólida, clara e flexível**, facilitando o início de novos projetos e garantindo consistência entre repositórios.

---

## Objetivos do template
* Padronizar a estrutura de projetos backend Java
* Incentivar boas práticas de arquitetura e organização
* Facilitar manutenção, leitura e evolução do código
* Acelerar o setup inicial de novos projetos
* Manter consistência entre múltiplos repositórios

---

## Estrutura base esperada

A estrutura abaixo representa uma organização comum e recomendada para projetos backend:

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

> A estrutura pode (e deve) ser adaptada conforme o contexto do projeto, mas o princípio de **separação de responsabilidades** deve ser mantido.

---

## README_BASE.md
Este repositório contém um arquivo [README_BASE.md](README_BASE.md), que serve como **modelo flexível** para novos projetos.
Ele foi pensado para:
- Documentar projetos reais
- Explicar decisões técnicas
- Demonstrar organização e maturidade técnica
- Ser adaptado conforme o contexto do projeto

### Como utilizar
1. Crie um novo repositório usando Use this template
2. Renomeie README_BASE.md para README.md
   ```
    mv README_BASE.md README.md
   ```
3. Remova ou substitua este README
4. Ajuste o conteúdo do README conforme o projeto
5. Inicie o desenvolvimento

---

## Princípios arquiteturais adotados

Este template incentiva:
* Separação clara de camadas
* Baixo acoplamento
* Alta coesão
* Encapsulamento de regras de negócio
* Não exposição de entidades para camadas externas

### Diretrizes gerais
* **Controller**: apenas recebe requisições e delega para o service
* **Service**: concentra regras de negócio e conversões (Entity → DTO)
* **Repository**: acesso e manipulação de dados
* **DTOs**: representam contratos de entrada e saída
* **Domain**: representam o domínio da aplicação
* **Exception**: representam exceções personalizadas para o dominio da aplicação

---

## DTOs (Data Transfer Objects)
* DTOs devem representar **contratos**, não regras de negócio
* **Nunca** expor entidades diretamente
* Preferir nomes semânticos (`CreateUserRequest`, `UserResponseDTO`)
* Criar DTOs específicos apenas quando realmente houver diferença de intenção ou regra de negócio

---

## Fluxo recomendado
1. Controller recebe a requisição
2. Controller chama o Service
3. Service aplica regras de negócio
4. Service acessa o Repository
5. Service converte entidades em DTOs
6. Controller retorna a resposta

---

## Como usar este template
1. Clique em **Use this template** no GitHub
2. Crie um novo repositório a partir deste template
3. Ajuste o nome do projeto e do pacote base
4. Renomeie `README_BASE.md` para `README.md`
5. Edite o README com as informações específicas do projeto
6. Comece o desenvolvimento

---

## Testes (opcional)
Este template pode ser facilmente estendido para incluir:
* Testes unitários
* Testes de integração
* Mocks

A estratégia de testes deve acompanhar a evolução do projeto.

---

## Observações finais
Este template não impõe frameworks ou tecnologias específicas. Ele pode ser utilizado com:
* Java puro
* Spring Boot
* Quarkus
* Ou outros frameworks Java

Este repositório vai além do código e nasce de uma preocupação com a padronização de processos e a clareza na comunicação técnica, 
aproximando-se de práticas adotadas por times profissionais de engenharia de software.

É importante frisar que tudo aqui exposto **não** tem a finalidade de "impor" ou "engessar" práticas de arquitetura/engenharia de softwares e sim refletir a minha necessidade junto
aos meus estudos atuais, me ajudando a manter um padrão claro.

---

## Licença
Sinta-se livre para utilizar, adaptar e evoluir este template conforme suas necessidades.
