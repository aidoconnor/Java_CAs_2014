import javax.swing.JOptionPane;

public class ReadEarthquakeMeasurement {
	
	public static void main(String[] args)
	{
		// ask user for richter scale measurement
		String stringMeasurement = JOptionPane.showInputDialog(null, "Please enter the richter scale measurement for the earthquake", "Input", JOptionPane.QUESTION_MESSAGE);
		// convert the measurement string to an int
		int measurement = Integer.parseInt(stringMeasurement);
		
		// using a switch for richter scale measurement
		switch (measurement){
			case 1:
			case 2:
			case 3:		JOptionPane.showMessageDialog(null, "Detectable only by Instruments", "Earthquake Tester", JOptionPane.INFORMATION_MESSAGE);
						break;
			case 4:		JOptionPane.showMessageDialog(null, "Detectable within 32km of epicentre", "Earthquake Tester", JOptionPane.INFORMATION_MESSAGE);
						break;
			case 5:		JOptionPane.showMessageDialog(null, "May cause slight damage", "Earthquake Tester", JOptionPane.INFORMATION_MESSAGE);
						break;
			case 6:		JOptionPane.showMessageDialog(null, "Moderately destructive", "Earthquake Tester", JOptionPane.INFORMATION_MESSAGE);
						break;
			case 7:		JOptionPane.showMessageDialog(null, "A major earthquake", "Earthquake Tester", JOptionPane.INFORMATION_MESSAGE);
						break;
			case 8:		JOptionPane.showMessageDialog(null, "A very destructive earthquake", "Earthquake Tester", JOptionPane.INFORMATION_MESSAGE);
						break;
			case 9:		JOptionPane.showMessageDialog(null, "A catastrophe", "Earthquake Tester", JOptionPane.INFORMATION_MESSAGE);
						break;
			default:	JOptionPane.showMessageDialog(null, "Incorrect earthquake measurement value entered", "Error", JOptionPane.ERROR_MESSAGE);
						break;
		}
	}
}
