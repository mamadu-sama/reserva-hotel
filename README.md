# Sistema de Reservas de servico.Hotel

## Descrição
Sistema de gestão de reservas para o servico.Hotel Atlântico, desenvolvido
em Java puro. Permite gerir quartos, hóspedes e reservas via terminal.

## Funcionalidades
- Listar quartos por tipo e estado (livre/ocupado)
- Registar hóspedes com validação de dados
- Criar reservas com cálculo automático do preço
- Cancelar reservas e libertar quartos automaticamente
- Ver resumo com estatísticas do hotel

## Estrutura do projecto

src/
modelo/
modelo.Quarto.java            # Classe abstracta base
modelo.QuartoStandard.java    # 60€/noite
modelo.QuartoSuite.java       # 120€/noite
modelo.QuartoPresidencial.java# 250€/noite
Hospede.java           # Hóspede com validação
modelo.Reserva.java           # Liga hóspede e quarto
servico/
servico.Hotel.java             # Gestão central
servico.Main.java                # Menu interactivo

## Conceitos aplicados
- Classes abstractas e interfaces
- Herança e polimorfismo
- Encapsulamento com validação
- Composição de objectos
- Arrays e iteração

## Como executar
Requer Java JDK 21+. Compilar e correr com: