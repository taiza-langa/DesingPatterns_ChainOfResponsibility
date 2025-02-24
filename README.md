# Chain of Responsibility - Aprovação de Requisições

Este projeto implementa o padrão de projeto Chain of Responsibility para aprovação de requisições financeiras com base em diferentes níveis hierárquicos dentro de uma organização.

## 📌 Descrição
A aplicação define uma cadeia de manipuladores (handlers) responsáveis por aprovar ou rejeitar requisições com base em valores pré-definidos:

Funcionário → Aprova requisições até R$ 1.000
Gerente → Aprova requisições até R$ 5.000
Diretor → Aprova requisições até R$ 10.000
Valores acima de R$ 10.000 são rejeitados.
Cada manipulador repassa a solicitação ao próximo nível caso não tenha permissão para aprovar a requisição.

## 🛠 Estrutura do Código
- Handler (Classe abstrata): Define a interface para os manipuladores e armazena a referência para o próximo handler.
- FuncionarioHandler, GerenteHandler, DiretorHandler: Implementam as regras de aprovação de requisições.
- Main: Configura a cadeia de responsabilidade e processa diferentes valores de requisição.
