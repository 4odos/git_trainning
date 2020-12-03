package com.mycompany.app;

public class TesteRunnable implements Runnable{

	
	private int tempoDeEspera;
	private String nomeRunnable;
	
	
	public TesteRunnable(int tempoDeEspera, String none) {
		this.tempoDeEspera = tempoDeEspera;
		this.nomeRunnable = none;
	}



	@Override
	public void run() {
		for(int i = 0 ; i <= tempoDeEspera ; i++) {
			System.out.println(nomeRunnable);
		}
	}

}
