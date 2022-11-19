package negocio;

import config.Regra;
import modelo.Cliente;

public class Validar {

	public String aprovarEmprestimo(Cliente cliente) {
		String resultado;
		if (cliente.getIdade() >= Regra.IDADE_Min && cliente.getIdade() <= Regra.IDADE_MAX) {
			resultado = "Aprovado";
		} else if (cliente.getIdade() > Regra.IDADE_MAX && cliente.getIdade() <= Regra.IDADE_MAX_PARCIAL) {
			resultado = "Em analise";
		} else if (cliente.getIdade() > Regra.IDADE_MAX && cliente.getIdade() <= Regra.IDADE_MAX_PARCIAL) {
			resultado = "Em analise";
		} else if (cliente.getIdade() > Regra.IDADE_MAX && cliente.getIdade() <= Regra.IDADE_MAX_PARCIAL) {
			resultado = "Em analise";
		} else {
			resultado = "Reprovado";
		}
		return resultado;
	}

}
