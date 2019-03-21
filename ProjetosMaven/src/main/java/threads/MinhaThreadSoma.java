package threads;

public class MinhaThreadSoma implements Runnable {
	private String nome;
	private int[] nums;
	
	private static Calculadora calc = new Calculadora();
	
	public MinhaThreadSoma(String nome, int[] nums){
		this.nome = nome;
		this.nums = nums;
		new Thread(this, nome).start();
	}

	public void run() {
		
		System.out.println(this.nome + "Iniciada");
		
		int soma = calc.somaArray(this.nums);
		
		System.out.println("Resultado da soma para thread " + this.nome + "�" + soma);
		
		System.out.println(this.nome + "Terminada");
		
	}
}