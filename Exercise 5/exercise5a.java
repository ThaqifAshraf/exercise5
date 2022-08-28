import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class exercise5a {
	
	public static void main(String[] args) {
		
		//1.Declare output file.
		String outFile = "Exercise5.txt";
		
		//Data declaration
		String dates[] = {"04/08/22", "05/08/22", "06/08/22", "07/08/22", "08/08/22", "09/08/22"};
		double utilization[] = {51.0, 0.0, 0.0, 3.0, 22.0, 0.0};
		
		try {
			
		//2. Create stream to read data.
			DataOutputStream dos = new DataOutputStream(new FileOutputStream(outFile));
			
		//Processdaat
			for (int index = 0; index <  dates.length; index++) {
				
				//3.Write data into data stream
				dos.writeUTF(dates[index]);
				dos.writeDouble(utilization[index]);
				
				//4.Flush for each writing
				dos.flush();
			}
			
			//5.Close stream
			dos.close();
			
		} catch  (Exception ex) {
			ex.printStackTrace();
		}
		
		//Indicate end of program - Could be successful
		System.out.println("End of program. Check out " + outFile);
	}
}
