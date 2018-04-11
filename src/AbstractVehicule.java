
public abstract class AbstractVehicule implements Vehicule {
	
	private Position position;
	private float direction;
	private float nord;
	private float sud;
	private float est;
	private float ouest;
	private float speed;
	
	public AbstractVehicule()
	{this.nord=0.0f;
	this.sud=0.0f;
	this.est=0.0f;
	this.ouest=0.0f;
	this.direction=0.0f;
	this.speed=0.0f;
	}
	
	
	public Position getPosition() {
		return this.position;
	}
	public void setDirection (float nord, float sud, float est, float ouest) {
		this.nord=nord;
		this.sud=sud;
		this.ouest=ouest;
		this.est=est;
	}
	public void setSpeed(float speed) {
		this.speed=speed;
	}

}
