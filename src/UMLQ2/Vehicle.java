package UMLQ2;

public interface Vehicle {
	void start();// all the nonstatic methods are public abstract
	void stop();
	void accelerate(int acc) ;
	void brake(int dec);
	int getCurrentSpeed();
	void displayType();
}
