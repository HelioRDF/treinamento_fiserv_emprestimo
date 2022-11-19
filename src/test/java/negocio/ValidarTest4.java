package negocio;

import static org.junit.Assert.*;

import org.junit.Test;

import modelo.Cliente;

public class ValidarTest4 {


	//reprovarPorIdadeInvalidaValorLimiteMax
	@Test	
	public void reprovarPorIdadeInvalidaValorLimiteMax() {
		Cliente cliente =  new Cliente("Helio", 17, 5000);
		Validar validar = new Validar();
		String resultado = validar.aprovarEmprestimo(cliente);
		assertEquals("Reprovado", resultado);	
	}
	

	//aprovarPorIdadeValidaValorLimiteMin
	@Test
	public void aprovarPorIdadeValidaValorLimiteMin() {
		Cliente cliente =  new Cliente("Helio", 18, 5000);
		Validar validar = new Validar();
		String resultado = validar.aprovarEmprestimo(cliente);
		assertEquals("Aprovado", resultado);
	}
	
	//aprovarPorIdadeValidaValorLimiteMax
	@Test
	public void aprovarPorIdadeValidaValorLimiteMax() {
		Cliente cliente =  new Cliente("Helio", 80, 5000);
		Validar validar = new Validar();
		String resultado = validar.aprovarEmprestimo(cliente);
		assertEquals("Aprovado", resultado);
	}
	

//	//reprovarPorIdadeInvalidaValorLimiteMin
//	@Test
//	public void reprovarPorIdadeInvalidaValorLimiteMin() {
//		Cliente cliente =  new Cliente("Helio", 81, 5000);
//		Validar validar = new Validar();
//		String resultado = validar.aprovarEmprestimo(cliente);
//		assertEquals("Reprovado", resultado);
//	}
//	

}


