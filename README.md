![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)

# ⚔️ RPG de Turno

RPG de turno desenvolvido em Java como projeto prático para explorar os quatro pilares da Programação Orientada a Objetos.

---

## 🎯 Objetivo

Aplicar na prática os conceitos de POO desenvolvendo um jogo de RPG com sistema de combate por turnos, inventário e missões.

---

## 🏛️ Os 4 Pilares de POO

### Abstração
Classes abstratas definem o molde sem implementação completa:
- `Personagem` → base de todos os heróis
- `Inimigos` → base de todos os inimigos
- `Item` → base de todos os itens

### Herança
Subclasses herdam e especializam o comportamento da classe pai:
- `Guerreiro`, `Mago`, `Arqueiro` → extends `Personagem`
- `Goblin`, `Orc` → extends `Inimigos`
- `Arma`, `Pocao` → extends `Item`

### Polimorfismo
O mesmo método se comporta diferente em cada classe:
- `atacar()` → cada herói ataca de um jeito
- `habilidadeEspecial()` → cada herói tem sua habilidade única
- `usar()` → cada item tem seu efeito diferente

### Encapsulamento
Atributos privados protegidos por getters e setters:
- Ninguém acessa `vida`, `dano` ou `defesa` diretamente
- `setVida()` garante que a vida nunca ultrapasse o máximo
- `setters` protegidos só permitem que subclasses alterem atributos

---

## 📦 Arquitetura
```
src/
├── Interfaces/
│   ├── Combatente.java       → contrato de combate
│   └── Missoes.java          → contrato de missões
├── Entities/
│   ├── personagens/
│   │   ├── Personagem.java   → classe abstrata base
│   │   ├── Guerreiro.java    → golpe duplo
│   │   ├── Mago.java         → tempestade arcana (consome mana)
│   │   └── Arqueiro.java     → crítico aleatório 30%
│   ├── Inimigos/
│   │   ├── Inimigos.java     → classe abstrata base
│   │   ├── Goblin.java       → ataque duplo
│   │   └── Orc.java          → fúria
│   └── itens/
│       ├── Item.java         → classe abstrata base
│       ├── Arma.java         → aumenta dano
│       ├── Pocao.java        → restaura vida
│       └── Inventario.java   → lista genérica com Generics
└── Utilities/
    ├── PersonagemFactory.java → criação de personagens
    ├── MissaoCombate.java     → missões com recompensa
    └── SistemaDeCombate.java  → lógica de turnos
```

---

## 🎮 Personagens

| Classe | Vida | Dano | Defesa | Habilidade Especial |
|---|---|---|---|---|
| Guerreiro | 120 | 50 | 25 | Golpe Duplo |
| Mago | 70 | 40 | 15 | Tempestade Arcana |
| Arqueiro | 70 | 30 | 13 | Chuva de Flechas |

---

## 👾 Inimigos

| Inimigo | Vida | Dano | Defesa | Habilidade |
|---|---|---|---|---|
| Goblin | 50 | 20 | 2 | Ataque Duplo |
| Orc | 80 | 35 | 20 | Fúria |

---

## 🎒 Itens

| Item | Tipo | Efeito |
|---|---|---|
| Poção de Vida | Cura | Restaura 50 de vida |
| Espada Reforçada | Arma | +10 de dano |

---

## 🚀 Como Rodar

1. Clone o repositório
```bash
git clone https://github.com/Kaylu1/RpgDeTurno.git
```
2. Abra no **IntelliJ IDEA**
3. Execute o arquivo `Main.java`
4. Digite o nome do seu personagem
5. Escolha sua classe e batalhe!

---

## 🛠️ Tecnologias

- Java 21
- IntelliJ IDEA
- Git & GitHub
