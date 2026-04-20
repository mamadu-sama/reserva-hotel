
```

                        ███████╗██╗███████╗████████╗███████╗███╗   ███╗ █████╗     ██████╗ ███████╗                               
                        ██╔════╝██║██╔════╝╚══██╔══╝██╔════╝████╗ ████║██╔══██╗    ██╔══██╗██╔════╝                               
                        ███████╗██║███████╗   ██║   █████╗  ██╔████╔██║███████║    ██║  ██║█████╗                                 
                        ╚════██║██║╚════██║   ██║   ██╔══╝  ██║╚██╔╝██║██╔══██║    ██║  ██║██╔══╝                                 
                        ███████║██║███████║   ██║   ███████╗██║ ╚═╝ ██║██║  ██║    ██████╔╝███████╗                               
                        ╚══════╝╚═╝╚══════╝   ╚═╝   ╚══════╝╚═╝     ╚═╝╚═╝  ╚═╝    ╚═════╝ ╚══════╝                               
                                                                                                                                  
██████╗ ███████╗███████╗███████╗██████╗ ██╗   ██╗ █████╗     ██╗  ██╗ ██████╗ ████████╗███████╗██╗     ███████╗██╗██████╗  █████╗ 
██╔══██╗██╔════╝██╔════╝██╔════╝██╔══██╗██║   ██║██╔══██╗    ██║  ██║██╔═══██╗╚══██╔══╝██╔════╝██║     ██╔════╝██║██╔══██╗██╔══██╗
██████╔╝█████╗  ███████╗█████╗  ██████╔╝██║   ██║███████║    ███████║██║   ██║   ██║   █████╗  ██║     █████╗  ██║██████╔╝███████║
██╔══██╗██╔══╝  ╚════██║██╔══╝  ██╔══██╗╚██╗ ██╔╝██╔══██║    ██╔══██║██║   ██║   ██║   ██╔══╝  ██║     ██╔══╝  ██║██╔══██╗██╔══██║
██║  ██║███████╗███████║███████╗██║  ██║ ╚████╔╝ ██║  ██║    ██║  ██║╚██████╔╝   ██║   ███████╗███████╗███████╗██║██║  ██║██║  ██║
╚═╝  ╚═╝╚══════╝╚══════╝╚══════╝╚═╝  ╚═╝  ╚═══╝  ╚═╝  ╚═╝    ╚═╝  ╚═╝ ╚═════╝    ╚═╝   ╚══════╝╚══════╝╚══════╝╚═╝╚═╝  ╚═╝╚═╝  ╚═╝
                                                                                                                                  
                                                                                                                                           
                                                                                                                                                                                                                          
```

## 📋 Descrição

Sistema de gestão de reservas desenvolvido para o **Hotel Atlântico**, implementado em Java puro com orientação a objetos. Permite gerir quartos, hóspedes e reservas através de uma interface de terminal interativa.

Projeto académico desenvolvido para demonstrar conceitos fundamentais de POO (Programação Orientada a Objetos).

---

## ✨ Funcionalidades

### Gestão de Quartos
- 🏨 Listar quartos por tipo e estado (livre/ocupado)
- 💰 Três categorias: Standard (60€), Suite (120€) e Presidencial (250€)
- 🔄 Atualização automática de estado

### Gestão de Hóspedes
- 👤 Registo de hóspedes com validação de dados
- ✅ Validação de email, NIF e contacto
- 📝 Histórico de reservas por hóspede

### Gestão de Reservas
- 📅 Criação de reservas com cálculo automático do preço
- ❌ Cancelamento de reservas com libertação automática de quartos
- 📊 Resumo com estatísticas detalhadas do hotel
- 💵 Cálculo de preço baseado no número de noites

---

## 📁 Estrutura do Projeto

```
hotel-reservas/
│
├── src/
│   ├── modelo/
│   │   ├── Quarto.java              # Classe abstrata base para quartos
│   │   ├── QuartoStandard.java      # Quarto Standard (60€/noite)
│   │   ├── QuartoSuite.java         # Quarto Suite (120€/noite)
│   │   ├── QuartoPresidencial.java  # Quarto Presidencial (250€/noite)
│   │   ├── Hospede.java             # Hóspede com validação de dados
│   │   └── Reserva.java             # Ligação entre hóspede e quarto
│   │
│   ├── servico/
│   │   └── Hotel.java               # Gestão central do sistema
│   │
│   └── Main.java                    # Menu interativo (ponto de entrada)
│
└── README.md
```

---

## 🎯 Conceitos de POO Aplicados

- **Classes Abstratas e Interfaces**: Estrutura flexível para diferentes tipos de quartos
- **Herança e Polimorfismo**: Reutilização de código entre tipos de quartos
- **Encapsulamento com Validação**: Proteção de dados com validadores
- **Composição de Objetos**: Reserva composta por Hóspede e Quarto
- **Arrays e Iteração**: Gestão de coleções de objetos
- **Métodos Estáticos**: Validadores reutilizáveis

---

## 🚀 Como Executar

### Requisitos
- **Java JDK 21+** instalado
- Terminal/CMD

### Compilação e Execução

```bash
# Compilar todos os ficheiros
javac src/modelo/*.java src/servico/*.java src/Main.java

# Executar o programa
java -cp src Main
```

### Ou com package:

```bash
# Compilar
javac -d out src/**/*.java

# Executar
java -cp out Main
```

---

## 💡 Exemplos de Uso

```
=== SISTEMA DE RESERVAS - HOTEL ATLÂNTICO ===

1. Listar quartos disponíveis
2. Registar novo hóspede
3. Criar reserva
4. Cancelar reserva
5. Ver estatísticas do hotel
0. Sair

Escolha uma opção: _
```

---

## 🎓 Aprendizagens

Este projeto permitiu consolidar conhecimentos em:
- Design de classes e relacionamentos entre objetos
- Validação de dados e tratamento de erros
- Implementação de lógica de negócio
- Desenvolvimento de interfaces de utilizador em terminal
- Boas práticas de código Java

---

## 👨‍💻 Autor

**Mamadu Sama** - Projeto académico

---

## 📝 Licença

Este projeto é de código aberto para fins educacionais.

---

## 🔮 Melhorias Futuras

- [ ] Persistência de dados (ficheiros/base de dados)
- [ ] Interface gráfica (JavaFX/Swing)
- [ ] Sistema de autenticação
- [ ] Relatórios em PDF
- [ ] API REST para integração
- [ ] Testes unitários (JUnit)
