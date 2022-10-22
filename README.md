# SpringSecurityBasic
Projeto para validar estudos sobre o uso do Spring Security.


### Objetivo
- Definir perfis de acesso
- Definir rotas com restrição de acesso.
- Disponilizar meios para estabelecer a restrição. Seja da forma mais atualizada ou depreciada.

### Sobre o projeto
- Foi utilizado o banco de dados Postgres para persistir os dados utilizados no projeto.
- O Flyway é usado para gerenciar as migrations e possibilitar a mesma versão do banco e seus dados para quem quiser testar e estudar o projeto.
- O projeto possui dois usuários : akon e bob. 
- 'akon' é o usuario 'Admin' enquanto 'bob' é 'user'.
- Temos três verbos HTTP para um unico endpoint: http://localhost:8080/pessoa .
- São eles GET, POST e DELETE. Onde GET pode ser requisitado por qualquer usuário, enquanto POST e DELETE apenas por usuários 'admin'.


#### Conclusão
> O projeto cumpriu com os ideais de estudo do spring security, assim como entendimento em como gerenciar os acessos.
não fazia parte do escopo do projeto estabelecer muitos endpoints ou criar testes para cobrir os cenários. 
O escopo era as configurações necessário para criação de um projeto com spring security com auth basis e exemplificar como utilizar. 
