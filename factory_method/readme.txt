BENEFÍCIOS
	. Desacoplamento entre cliente e classes concretas: O cliente depende apenas da interface/produto, não da implementação. Isso facilita a manutenção e a extensão do sistema.

	. Facilita a adição de novas classes de produtos: Basta criar uma nova subclasse e sobrescrever o método fábrica, sem alterar o código existente.

	. Segue o princípio aberto/fechado (Open/Closed Principle): Você pode estender o comportamento da criação sem modificar o código existente.

	.Melhora a coesão do código: Centraliza a lógica de criação do objeto, evitando duplicação e confusão.

MALEFÍCIOS
	
	. Pode criar muitas classes: Para cada tipo novo de produto, geralmente é criada uma nova subclasse. Isso pode aumentar o número de arquivos em projetos grandes.

	. Mais complexidade para casos simples: Se a criação do objeto for simples e direta, o uso do padrão pode parecer desnecessário ou verboso.

 	. Subclasses obrigadas a conhecer detalhes da criação: Pode ser necessário expor mais conhecimento sobre o produto nas subclasses, o que pode gerar um pouco de acoplamento em certos casos.

DIREFREÇA ENTRE Factory Method e Abstract Factory
	. Factory Method: uma única criação por fábrica.

	. Abstract Factory: cria famílias de objetos relacionados.