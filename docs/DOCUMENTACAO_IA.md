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