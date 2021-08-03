package br.com.deivity.pessoa;

public class PessoaFisica extends Pessoa {

	public PessoaFisica(String documento){
		super(documento);
	}
	@Override
	public Boolean validarDocumento() {
		if(11 == super.getDocumento().length()) {
			char[] posicao = super.getDocumento().toCharArray();
			String posicao1 = String.valueOf(posicao[0]);
			Integer valor1 = Integer.valueOf(posicao1);
			String posicao2 = String.valueOf(posicao[1]);
			Integer valor2 = Integer.valueOf(posicao2);
			String posicao3 = String.valueOf(posicao[2]);
			Integer valor3 = Integer.valueOf(posicao3);
			String posicao4 = String.valueOf(posicao[3]);
			Integer valor4 = Integer.valueOf(posicao4);
			String posicao5 = String.valueOf(posicao[4]);
			Integer valor5 = Integer.valueOf(posicao5);
			String posicao6 = String.valueOf(posicao[5]);
			Integer valor6 = Integer.valueOf(posicao6);
			String posicao7 = String.valueOf(posicao[6]);
			Integer valor7 = Integer.valueOf(posicao7);
			String posicao8 = String.valueOf(posicao[7]);
			Integer valor8 = Integer.valueOf(posicao8);
			String posicao9 = String.valueOf(posicao[8]);
			Integer valor9 = Integer.valueOf(posicao9);
			String posicao10 = String.valueOf(posicao[9]);
			Integer valor10 = Integer.valueOf(posicao10);
			String posicao11 = String.valueOf(posicao[10]);
			Integer valor11 = Integer.valueOf(posicao11);

			Integer somaDv1 = (valor1*1)+(valor2*2)+(valor3*3)+(valor4*4)+(valor5*5)+(valor6*6)+(valor7*7)+(valor8*8)+(valor9*9);
			Integer somaDv2 = (valor1*0)+(valor2*1)+(valor3*2)+(valor4*3)+(valor5*4)+(valor6*5)+(valor7*6)+(valor8*7)+(valor9*8)+(valor10*9);

			if(somaDv1%11==valor10) {

				if(somaDv2%11==valor11) {
					return true;
				}
				else {
					return false;
				}
			}
			else {
				return false;
			}
		} else {
			return false;
		}
	}
}