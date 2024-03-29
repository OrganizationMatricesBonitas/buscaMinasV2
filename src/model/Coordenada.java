package model;

public class Coordenada {
	private int posX, posY;

	public Coordenada(int posX, int posY) {
		super();
		this.posX = posX;
		this.posY = posY;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + posX;
		result = prime * result + posY;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coordenada other = (Coordenada) obj;
		if (posX != other.posX)
			return false;
		if (posY != other.posY)
			return false;
		return true;
	}

	public boolean isInToLimits(int ancho, int alto) {
		return posX >= 0 && posY >= 0 && posX < alto && posY < ancho;
	}

	@Override
	public String toString() {
		return "Posicion X " + posX + " Y " + posY;
	}
	
	

}
