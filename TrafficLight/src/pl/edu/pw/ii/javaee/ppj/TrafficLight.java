package pl.edu.pw.ii.javaee.ppj;
/**
 * The TrafficLightclass models the state of a traffic light.
 * @author lesl
 * @version 2019
 */
public class TrafficLight {

	private String state; // green, yellow, red
	/**
	 * Constructor for objects of class TrafficLight.
	 * Pass in "green", "yellow" or "red" to
	 * represent the state of the TrafficLightobject.
	 * 
	 * @param state the initial state of the TrafficLightobject
	 */
	public TrafficLight(String state) {
		this.state= state;
	}
	/**
	 * The getState() method is an accessor method
	 * for the state variable.
	 * 
	 * @return     the value of "state"
	 */
	public String getState() {
		return state;
	}
	/**
	 * The setState(String state) is a mutator method
	 * for the state variable.
	 * 
	 * @param  state  the value used to initialize the state variable
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * The green() method sets the state of the TrafficLight
	 * to green color if the current color is yellow.
	 */
	public void green() {
		if(state.equals("green")) {
			System.out.println("The lightisalreadygreen.");
		} else if(state.equals("red")) {
			System.out.println("The lighthas" + state+
					" colorbut mustbe yellowbeforeitcanbecomegreen.");
		} else {
			state= "green";
			System.out.println("The lightisnowgreen.");
			}
	}		
	public void yellow() {
		if(state.equals("green") || state.equals("red")) {
			state= "yellow";
			System.out.println("The lightisnowyellow.");
		} else {
			System.out.println("The lightisalreadyyellow.");
		}
	}
	public void red() {
		if(state.equals("red")) {
			System.out.println("The lightisalreadyred.");
		} else if(state.equals("green")) {
			System.out.println("The lighthas" + state+
					"colorbut mustbe yellowbeforeitcanbecomegreen.");
		} else {
			state = "red";
			System.out.println("The lightisnowred.");
		}
	}
}
