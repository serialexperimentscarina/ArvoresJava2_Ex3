package view;

import br.com.serialexperimentscarina.arvorechar.ArvoreChar;

public class Principal {

	public static void main(String[] args) {
		char[] vetor = {'k', 'd', 'm', 'b', 'f', 'l', 't', 'c', 'p', 'z', 'r'};
		ArvoreChar arvore = new ArvoreChar();
		
		for (char letra : vetor) {
			arvore.insert(letra);
		}
		
		try {
			arvore.remove('m');
			
			arvore.prefixSearch();
			System.out.println('\n');
			arvore.infixSearch();
			System.out.println('\n');
			arvore.postfixSearch();
			
			System.out.println('\n');
			arvore.search('r');
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
