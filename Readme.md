# README: LotofacilGUI

## Descrição
`LotofacilGUI` é uma classe Java que implementa uma interface gráfica para um jogo de apostas. A classe estende `JFrame`, que é uma classe do Swing para criar uma janela gráfica.

## Funcionalidades
A classe `LotofacilGUI` possui três botões de aposta:
1. **Apostar de 0 a 100**: O usuário digita um número de 0 a 100. Se o número digitado for igual ao número sorteado aleatoriamente, o usuário ganha.
2. **Apostar de A a Z**: O usuário digita uma letra de A a Z. Se a letra digitada for igual à letra sorteada (neste caso, 'V'), o usuário ganha.
3. **Apostar par ou ímpar**: O usuário digita um número. Se o número for par, o usuário ganha.

## Como usar
Para usar esta classe, basta instanciá-la no método `main`. Uma janela gráfica será exibida com os três botões de aposta. Clique em qualquer botão para fazer uma aposta.

```java
public static void main(String[] args) {
    new LotofacilGUI();
}
```

## Dependências
Esta classe depende das seguintes bibliotecas Java:
- `java.awt.Color`
- `java.awt.FlowLayout`
- `java.awt.event.ActionEvent`
- `java.awt.event.ActionListener`
- `java.util.Random`
- `java.util.Scanner`
- `javax.swing.*`

## Nota
Esta é uma aplicação simples e serve apenas como exemplo de como criar uma interface gráfica em Java usando Swing. Não é recomendado usar este código em produção sem fazer as devidas verificações e tratamentos de erro.
