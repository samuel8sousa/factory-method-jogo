# Documentação do uso de IA

## Problema

Implementação do padrão Factory Method em um jogo.

## Prompt utilizado

Explique como desenvolver essa solução usando Factory Method
passo a passo, sem entregar o código pronto.

## Commit 1 - Criação da abstração Inimigo

Foi identificado que todos os inimigos possuem um comportamento comum:
realizar ataques.

Foi criada a classe abstrata Inimigo contendo o método atacar(),
que será implementado pelos diferentes tipos de inimigos.

## Commit 2 - Criação dos inimigos concretos

Foram criadas classes específicas para representar
os inimigos de cada região.

Cada classe implementa seu próprio comportamento de ataque.

## Commit 3 - Implementação do Factory Method

Foi criada a classe abstrata Localizacao responsável
pela criação dos inimigos.

Cada região passou a decidir qual inimigo deve ser criado,
evitando decisões condicionais no código principal.

## Commit 3 - Implementação do Factory Method

Foi criada a classe abstrata Localizacao responsável
pela criação dos inimigos.

Cada região passou a decidir qual inimigo deve ser criado,
evitando decisões condicionais no código principal.

## Commit 4 - Simulação do funcionamento

Foi criado o Main para demonstrar que o código trabalha
com a abstração Inimigo.

O jogo não precisa conhecer qual inimigo será criado,
pois a localização é responsável pela criação.

## Commit 4 - Simulação do funcionamento

Foi criado o Main para demonstrar que o código trabalha
com a abstração Inimigo.

O jogo não precisa conhecer qual inimigo será criado,
pois a localização é responsável pela criação.

## Commit 6 - Expansão do jogo com nova localização

Foi adicionada uma nova região sem modificar
as classes existentes.

Isso demonstra a principal vantagem do Factory Method:
facilidade de extensão.