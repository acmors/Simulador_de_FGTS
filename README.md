<h1>FGTS - Sistema de Gerenciamento de Conta FGTS</h1>
Este é um sistema simples para gerenciamento de contas FGTS, onde é possível fazer login com CPF e senha, visualizar o saldo da conta e o extrato das movimentações realizadas (depósitos e saques).

<h2>Funcionalidades</h2>
<strong>Login</strong>: O usuário realiza login utilizando seu CPF e senha cadastrados.

<strong>Visualizar Saldo</strong>: Após o login, o saldo atual da conta é exibido.

<strong>Extrato</strong>: O extrato da conta mostra as movimentações realizadas, como depósitos e saques.

<strong>Movimentações</strong>: São registradas movimentações como depósitos e saques.

<h2>Tecnologias Utilizadas</h2>
<strong>Java</strong>: Linguagem utilizada para o desenvolvimento do sistema.

<strong>Swing</strong>: Biblioteca utilizada para a interface gráfica.

<strong>LocalDate</strong>: Para controle de datas das movimentações.

<strong>Listas</strong>: Para armazenamento de usuários, contas e movimentações (simulação de banco de dados).

<h1>Como Executar</h1>
<strong>Clone o repositório</strong>:

bash
Copiar
Editar
git clone https://github.com/acmors/finance-flow.git
Compile e execute o projeto no seu ambiente de desenvolvimento Java.

<strong>Interface</strong>:

Ao iniciar o sistema, a janela de login será exibida.

Informe o CPF e a senha cadastrados para acessar as funcionalidades de visualização de saldo e extrato.

<h3>Exemplo de Login</h3>
<strong>CPF</strong>: 98765432100

<strong>Senha</strong>: senha456

Estrutura do Projeto
bash
Copiar
Editar
src/
│
├── database/           # Contém a simulação de banco de dados e cálculo de saldo
│   └── DataBase.java
│
├── model/              # Contém as classes de modelo (ContaFGTS, Movimentacao, Usuario)
│   ├── ContaFGTS.java
│   ├── Movimentacao.java
│   └── Usuario.java
│
├── service/            # Contém a lógica de negócios para interação com contas
│   └── ContaService.java
│
├── auth/               # Contém a lógica de autenticação de usuários
│   └── SistemaAutenticacao.java
│
├── view/               # Contém a interface gráfica
│   └── gui/
│       └── LoginFrame.java
│
└── Main.java           # Classe principal para iniciar o sistema
<h1>Contribuindo</h1>
Se você quiser contribuir com melhorias para o projeto, fique à vontade para fazer um fork, realizar as alterações e enviar um pull request.
