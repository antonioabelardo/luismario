package Simpson;

public class SomadorVetor {

	private int soma;

	public synchronized int somaArray(int[] array) {
		
		soma = 0;

		for (int i = 0; i < array.length; i++) {
			soma += array[i];
			System.out.println("Execuntado a soma" + Thread.currentThread().getName() + "somando o valor do vetor "	+ array[i] + "com total: " + soma);

			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return soma;
	}
}
