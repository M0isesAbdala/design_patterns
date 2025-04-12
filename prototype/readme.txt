BENEFÍCIOS
	. Desempenho: Clonar objetos pode ser mais eficiente do que criar do zero, especialmente quando envolve inicialização complexa (como ler de arquivos, bancos de dados, etc).

	. Evita repetição de código: Você pode criar vários objetos com pequenas variações a partir de um protótipo base, sem repetir o processo de configuração.

	. Flexibilidade em tempo de execução: Você pode registrar novos protótipos dinamicamente e criar objetos em tempo de execução.

	. Reduz o acoplamento ao tipo concreto: O cliente não precisa saber a classe concreta do objeto — ele apenas clona o protótipo.

MALEFÍCIOS
	
	. Implementação de clone() pode ser complexa :Especialmente quando há objetos aninhados ou referências circulares. A distinção entre cópia superficial (shallow) e profunda (deep) precisa ser clara.

	. Dependência do uso correto de clone(): Se o clone() não for bem implementado, pode causar bugs difíceis de identificar (referências compartilhadas, inconsistências, etc).

	. Nem todos os objetos são naturalmente "clonáveis": Em algumas linguagens, o suporte a clonagem pode ser limitado, ou você precisa implementar manualmente.
