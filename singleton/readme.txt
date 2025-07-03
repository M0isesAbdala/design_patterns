BENEFÍCIOS

	. Evita inconsistências em recursos compartilhados (ex: geradores de IDs, serviços de log).

	. Pode ser acessado de qualquer lugar da aplicação, sem necessidade de passar instâncias como argumento.

        . Lazy initialization. A instância pode ser criada apenas quando for usada pela primeira vez (sob demanda).

MALEFÍCIOS
	
	. Isso pode causar efeitos colaterais difíceis de rastrear, especialmente em aplicações com múltiplas threads ou ciclos de vida complexos.
	. Dificuldade de abstrair. Esse padrão sozinho torna díficil o uso de multiplas maneiras.
