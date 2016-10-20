import java.util.Scanner;
import java.io.*;

import java.util.Scanner;
import java.io.*;

public class MyShell {
	public static void main(String[] args) throws IOException, InterruptedException {
        //Setting my global variables for use in all my code below
		String s = null;
		String str = null;
        Scanner in = new Scanner(System.in);
        String exit = "Exit";
        
        
        while(true){
            System.out.println("prompt> ");
            //I will use this variable to store each new command passed in by the user. 
	        String userCommand = in.nextLine();
	            		
	            		
	       /*This if statement I will use to handle the case in which the user simply presses 
    	      enter, or if they pass in a bunch of spaces. 
    	    */
            if(userCommand.equals("")||userCommand.trim().isEmpty()){
            	continue;
            }
            /* This will handle the part where the user enters exit, with out with out spaces
               before or after the word "Exit"
             */
            else if((userCommand.trim().equalsIgnoreCase(exit) )){
                System.out.println("Exiting...");
            	break;
            }
            
            
           else{
            	try{
            		/*Here I created a variable to store the running program with the command
            		passed in by the user. 
            		*/
            		Process childProcess = Runtime.getRuntime().exec(userCommand);
	                //This will store the Stream of the process in the variable inputStream.
            		InputStream inputStream = childProcess.getInputStream();
            		
            		
            		/*Process batchMode = Runtime.getRuntime().exec("batch");
            		InputStream batchModeIS= batchMode.getInputStream();
            		BufferedReader batchModeReader = new BufferedReader(new InputStreamReader(batchModeIS));
	                */
            		while(userCommand.toLowerCase().contains("batch")){
	            		try{	
            				userCommand = userCommand.substring(6, userCommand.length());
	            			FileReader file = new FileReader(userCommand.trim());
	            			BufferedReader fileName = new BufferedReader(file);
	            			
	            	        while((str = fileName.readLine()) != null){
		            			try{	
		            	        	Process batch = Runtime.getRuntime().exec(str);
			            			InputStream batchIS = batch.getInputStream();
			            			BufferedReader batchFile = new BufferedReader(new InputStreamReader(batchIS));
			            			while((s = batchFile.readLine()) != null){
					                	try{
					                		System.out.println(s);
					                	}catch(Exception e){}
					                }
		            			}catch(Exception e){
		            				
		            			}
	            			}
	            		}catch(Exception e){
	            			
	            		}
            		}
            		
            		
            		
	                /*
	                 * This buffered reader object will read the value of the command passed 
	                 * in by the user, and then use a buffered reader to read, what the input
	                 * stream reader read, and store it in the variable input.
	                 */
	                BufferedReader input = new BufferedReader(new InputStreamReader(inputStream));
	                /*This while loop will check to see the value of the command line by line
	                 * and display each line, until there are no more lines to display.
	                 */
	                while((s = input.readLine()) != null){
	                	System.out.println(s);
	                }
	                
	                
	                
	                
             
	            }catch(IOException e){
            		/*if the user command does not execute, the I will return a message saying that there was an error executing
	                that command.
	                */
            		System.out.println("Error executing: " + userCommand);
            	}
	        	
        }
        
        
        
    }
}
}

