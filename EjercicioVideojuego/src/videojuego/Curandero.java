package videojuego;

public class Curandero extends Personaje {

	private int sabiduria;

	public int getSabiduria() {
		return sabiduria;
	}

	public void setSabiduria(int sabiduria) {
		this.sabiduria = sabiduria;
	}

	@Override
	public void atacar(Personaje p) {
		if (this.getArma() instanceof Rezos) {
			System.out.println("Mi rezo provoca más daños!!!");
			this.getArma().usar();
			p.setVida(p.getVida() - 18);

		} else {
			//System.out.println("Lanzando ataque ⚒⚒⚒⚒⚒⚒⚒⚒⚒  🔥🔥🔥🔥🔥🔥🔥🔥🔥");
			this.getArma().usar();
			p.setVida(p.getVida() - 9);
		}
	}

	@Override
	public String toString() {
		return super.toString() + "\t💥 Sabiduría: " + sabiduria;
	}

}
