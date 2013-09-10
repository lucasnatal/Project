ALTER TABLE `news`.`noticias` CHANGE COLUMN `titulo` `titulo` VARCHAR(100) NOT NULL  ;

insert into noticias (id, img, descricao, id_categoria, date_time_publicacao, date_time_atualizacao, autor, titulo) values
					 (1, '/resources/img/noticias/image1.jpeg',
					  '<p>O velório do músico Champignon, encontrado morto na madrugada de
					   segunda-feira (9) na capital paulista, prossegue 
                       durante a manhã desta terça-feira (10) no Cemitério Memorial Necrópole 
			           Ecumênica, em Santos, no litoral de São Paulo. Até as 10h, apenas para familiares. 
                       Na sequência, fãs e imprensa poderão acompanhar a cerimônia fúnebre. 
                       O sepultamento do ex-baixista do Charlie Brown Jr., que atualmente era vocalista 
					   do grupo A Banca, está previsto para as 15h, no mesmo local.</p>' 
		
					  ,1, '2013-09-10 09:00', '2013-09-10 09:00', 'Natal', 
					  'Corpo de Champignon será enterrado na tarde desta terça-feira');

insert into noticias (id, img, descricao, id_categoria, date_time_publicacao, date_time_atualizacao, autor, titulo) values
					 (2, '/resources/img/noticias/image2.jpeg',
					  '<p>A expectativa anterior era de que o iOS 7 só fosse disponibilizado 
						  para os usuários em 20 de setembro, ou seja, dez dias depois do 
                          lançamento dos novos iPhones, o que pode ser considerado o “padrão” Apple. 
                          Afinal, ela costuma apresentar seus telefones e sistemas e só 
                          disponibilizá-los um certo tempo depois.</p>
					  </br>
					  <p>Ainda não há nenhuma confirmação da Apple sobre o assunto. 
					     O iOS 7 já está disponível em versão de testes para desenvolvedores 
						 há algumas semanas. No evento, sua versão final deve ser apresentada,
						 rodando nos novos iPhone 5S e iPhone 5C.
					  </p>' 
		
					  ,4, '2013-09-10 09:20', '2013-09-10 09:20', 'Natal', 
					  'iOS 7 pode ser liberado logo após lançamento de iPhones, diz site');
					  
insert into noticias (id, img, descricao, id_categoria, date_time_publicacao, date_time_atualizacao, autor, titulo) values
					 (3, '/resources/img/noticias/image3.jpeg',
					  '<p>O Criciúma jogou com o regulamento debaixo do braço e avançou à segunda fase da Copa 
					      do Brasil sub-20. Na tarde desta segunda-feira, em Barueri, o Tigre segurou o empate 
						  sem gols contra o Corinthians e se classificou após ter vencido o jogo de ida, em Santa Catarina, por 4 a 1. 
						  Agora o time catarinense espera o vencedor do duelo entre Atlético-GO e Cruzeiro. 
						  Goianos e mineiros fazem a primeira partida nesta quarta-feira, dia 11. 
						  Se vencer por dois ou mais gols de diferença, a Raposa também avança de fase.</p>
					  </br>
					  <p>No primeiro tempo, o Corinthians teve mais posse de bola, mas não conseguiu transformar o 
					     volume que teve em chances de gol. Já o Criciúma tentou gastar o tempo e segurar a boa vantagem 
						 construída na capital do carvão. Mesmo assim, a melhor chance foi do Criciúma. 
						 Vitor Michels roubou a bola do zagueiro corintiano e rolou para Mateus, 
						 sozinho no meio da área, que ele chutou em cima do goleiro.
					  </p>' 
		
					  ,2, '2013-09-10 09:40', '2013-09-10 09:40', 'Natal', 
					  'Criciúma fica no empate com Timão e avança na Copa do Brasil sub-20');
					  
insert into noticias (id, img, descricao, id_categoria, date_time_publicacao, date_time_atualizacao, autor, titulo) values
					 (4, '/resources/img/noticias/image4.jpeg',
					  '<p>As primeiras fileiras dos desfiles são capítulos a parte na cobertura
   					      das temporadas de moda. Com a New York Fashion Week não é diferente. 
						  Depois de David Beckham com a filha Harper Seven, de Rihanna e sua cinta-liga à 
						  mostra e de tantas outras celebridades que circulam pelo evento, é a vez 
						  do vocalista da banda "Red Hot Chili Peppers", Anthony Kiedis, 
						  chamar a atenção por lá, ao lado de sua bem mais nova namorada. 
						  Com idade entre 19 e 21 anos - sim, ninguém sabe ao certo - a new face australiana Helena Vestergaard 
						  tem sido companhia frequente do roqueiro de 50 anos nos últimos meses, 
						  mas só agora os dois posaram oficialmente como casal.</p>
					  </br>'
					  ,3, '2013-09-10 09:50', '2013-09-10 09:50', 'Fernado', 
					  'Anthony Kiedis surge na NYFW com namorada modelo muito mais nova');