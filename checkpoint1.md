# Checkpoint 1

## Descrição do projeto
O projeto é um aplicativo Android desenvolvido em Kotlin com Jetpack Compose. Ele possui navegação entre quatro telas: Login, Menu, Perfil e Pedidos.

## Objetivo da prova
O objetivo é evoluir o projeto base para aplicar os conceitos de navegação entre telas, implementando o envio e recebimento de parâmetros usando a biblioteca Navigation Compose.

## Explicação de cada evolução implementada

1. Parâmetros obrigatórios na tela de Perfil: A tela agora exige receber um "nome" do Menu para conseguir abrir.

2. Parâmetros opcionais na tela de Pedidos: A tela não exige dados para abrir. Se não receber nenhum nome de cliente, ela apenas mostra "Cliente Genérico".

3. Inserção de valor no parâmetro opcional: O botão do Menu foi configurado para enviar a palavra "Rafael", que substitui o texto "Cliente Genérico" na tela de Pedidos.

4. Passagem de múltiplos parâmetros: A tela de Perfil agora recebe duas informações ao mesmo tempo (o nome e a idade) e mostra as duas juntas.