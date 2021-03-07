package videojuego;

public class Guerrero extends Personaje {

	private int fuerza;

	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	@Override
	public void atacar(Personaje p) {
		if (this.getArma() instanceof Espada) {
			System.out.println("Mi espada provoca mas daños!!");
			this.getArma().usar();
			p.setVida(p.getVida() - 20);

		} else if (this.getArma() instanceof Arco) {
			System.out.println("Mi Arco provoca mas daños!!");
			this.getArma().usar();
			p.setVida(p.getVida() - 20);

		} else {
			//System.out.println("Lanzando ataque ⚒⚒⚒⚒⚒⚒⚒⚒⚒  🔥🔥🔥🔥🔥🔥🔥🔥🔥");
			p.setVida(p.getVida() - 10);
		}

	}

}
