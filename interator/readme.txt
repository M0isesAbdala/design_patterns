BENEFÍCIOS
	
	. Desacopla a coleção da forma de iteração não importando se é array, lista ligada, árvore.

	. Permite múltiplos iteradores ao mesmo tempo e cada iterador mantém seu próprio estado.

	. Facilita polimorfismo você pode trocar a coleção sem mudar o código de iteração.

	. Adiciona flexibilidade podendo criar iteradores diferentes (ordem inversa, filtrados, etc.).

	. Não expõem a estrutura interna.
		
MALEFÍCIOS
	
	. Mais classes e código boilerplate ( precisa criar interfaces e classes extras ).

	. Pode aumentar complexidade para coleções simples ( um for já resolveria ).

	. Não é eficiente em todos os casos. ( alguns iteradores precisam armazenar muito estado extra ).
