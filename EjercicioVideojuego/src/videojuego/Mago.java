package videojuego;

public class Mago extends Personaje {

	private int inteligencia;

	public int getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}

	@Override
	public void atacar(Personaje p) {
		if (this.getArma() instanceof Hechizo) {
			System.out.println("Mi hechizo genera más daños!!");
			this.getArma().usar();
			p.setVida(p.getVida() - 16);
			
		} else {
			System.out.println("Lanzando ataque ⚒⚒⚒⚒⚒⚒⚒⚒⚒  🔥🔥🔥🔥🔥🔥🔥🔥🔥");
			this.getArma().usar();
			p.setVida(p.getVida() - 8);
		}

	}

}
