## Pilares do POO

<b>Programação orientada a objetos</b> (<b>POO</b>, ou <b>OOP</b> segundo as suas siglas em inglês) é uma paradigma de programação baseado no conceito de "objetos", que podem conter dados na forma de campos, também conhecidos como atributos, e códigos, na forma de procedimentos, também conhecidos como métodos.

Como se trata de um contexto análogo ao mundo real, tudo no qual nos referimos são objetos, exemplo: Conta bancária, Aluno, Veiculo, Transferência, etc.

A programação orientada a objetos é bem requisitada no contexto das aplicações mais atuais no mercado devido a possibilidade de reutilização de código e a capacidade de representação do sistema muito mais proximo do mundo real.

Para uma linguagem ser considerada orientada a objetos, esta deve seguir o que denominamos como <b>Os quatro pilares da orientação a objetos</b>:

-   <b>Enncapsulamento:</b> Nem tudo precisa estar visivel, grande parte do nosso algoritmo pode ser distribuido em métodos com finalidades especificas que complementa uma ação em noss aplicação.
    Exemplo: Ligar um veiculo exige muitas etapas para a engenharia, mais o condutor só visualiza a ignição, dar a partida e a "magia" acontece.
-   <b>Herança:</b> Caracteristicas e comportamentos comuns podem ser elevados e compartilhados através de uma hierarquia de objetos.
    Exemplo: Um Carro e uma Motocicleta possuem propriedades como placa, chassi, ano de fabricação e métodos como acelerar, frear. Logo para não ser um processo de codificação redundante, podemos desfrutar da herança criando uma classe <b>Veiculo</b> para que seja herdada pelas classes Carro e Motocicleta.
-   <b>Abstração:</b> É a indisponibilidade para determinar a lógica de um ou vários comportamentos em um objeto.
    Exemplo: <b>Veiculo</b> determina duas ações como acelerar e frear, logo estes comportamentos deverão ser abstratos pois existem mais de uma maneira de se realizar a mesma operação. ver Polimorfismo.
-   <b>Polimorfismo:</b> São inumeras maneiras de se realizar uma mesma ação.
    Exemplo: Veiculo determina duas ações como acelerar e frear, primeiramente precisamos identificar se estaremos nos referindo a <b>Carro</b> ou <b>Motocicleta</b> para determinar a lógica de aceleração e frenagem dos respectivos veículos.

Em prática

Para ilustrar a proposta dos Principios da POO no nosso quotidiano, vamos simular algumas funcionalidades dos aplicativos de mensagem instantâneas pela internet.

<b>MSN Messenger</b> foi um programa de mensagens instatâneas criado pela Microsoft Corporation. O serviço nasceu em 22 de julho de 1999, anunciando-se como um serviço que permitia falar com uma pessoa através de conversas instatãneas pela internet. Ao logo dos anos surgiram novos serviços de mensagens pela internet como <b>Faceboo Messenger</b> e o <b>Telegram</b>.

### Modificador protected

Vamos para uma retrospectiva quanto ao requisito do nosso sistema de mensagens instantâneas desde a etapa de encapsulamento.

O nosso requisito solicita que além de Enviar e Receber Mensagens precisamos validar se o aplicativo esta conectado com a internet (<b>validarConectadoInternet</b>) e salvar o historico de mensagens (<b>salvarHistoricoMensagem</b>).

Sabemos que cada aplicativo costuma salvar as mensagens em seus respectivos servidores cloud, mas e quando a validar se esta conectado a internet? Não poderiamos ter um mecanismo comum á todos? Logo qualquer classe filha se ServicoMensagemInstatanea poderia desfrutar através de herança desta funcionalidade.

<b>OBS:</b> O modificador protected permite que as classes filhas tenham acesso aos atributos e métodos da classe pai.

### Interface

<b>OBS:</b> Uma interface é uma estrutura que define um contrato, ou seja, um conjunto de regras que devem ser seguidas por quem a implementa.

Como vimos anteriormente, Herança é um dos pilares de POO, mas uma curiosidade que se deve ser esclarecida na linguagem Java é que a mesma não permite o que conhecemos como <b>Herança Múltipla</b>.

Á medida que vão surgindo novas necessidades, novos equipamentos (objetos) nascem para atender as expectativas de ofereçer ferramentas com finalidades bem especificas como por exemplo: Impressoras, Digitalizadoras, Copiadoras e etc.

Observem que não há uma especificação de marca, modelo e ou capacidades de execução das classes citadas acima, isto é o que consideramos o nível mais abstrato da orientação a objetos que denominamos como <b>Interface</b>.

`Então o que você esta dizendo é que interfaces é o mesmo que classes? Um molde para representação dos objetos?`

Este é um dos maiores questionamentos dos desenvolvedores no que se refere a modelo de classes da aplicação.

Como citado acima Java não permite herança múltipla, logo, vamos imaginar que recebemos o desafio de projetar uma nova classe para criar objetos que representem as três caracteristicas citadas acima e que iremos denominar de <b>EquipamentoMultifuncional</b>.
