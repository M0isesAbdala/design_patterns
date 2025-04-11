BENEFÍCIOS
	. Oferece um controle mais fino sobre o processo de contrução.

 	. Facilita a criação de objetos imutáveis: Você monta o objeto com o builder e, no final, gera uma instância imutável.

	. Evita construtores telescópicos: Em vez de ter vários construtores com diferentes combinações de parâmetros, o Builder centraliza a lógica de construção.

	. Encapsula a lógica de construção: A complexidade da construção do objeto fica dentro do builder, mantendo o código cliente mais limpo.

MALEFÍCIOS
	. Aumento da complexidade e quantidade de código: Para objetos simples, usar Builder pode ser overkill e desnecessariamente verboso.

	. Dificuldade inicial de entendimento para iniciantes: Pode parecer excessivamente abstrato para quem está começando com padrões de projeto.

	. Overhead de manutenção: Caso o modelo de dados mude com frequência, manter o Builder sincronizado com as mudanças pode gerar trabalho extra.