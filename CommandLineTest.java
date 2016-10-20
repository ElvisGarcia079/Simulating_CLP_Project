

public class CommandLineTest {
	public static void main(String[] args){
		
			/*
			 * If only one argument is passed in...
			 */
			if(args.length == 1){
				//Take that string passed in, that must be an integer, and convert to an integer.
				int num = Integer.parseInt(args[0]);
				//Print out middle as many times as the number passed in using this for-loop.
				for(int i = 0; i < num; i++){
					System.out.println("middle");
				}
			}
			
			/*
			 * If two arguments are passed in...
			 */
			else if(args.length == 2){
				//The last argument passed in, (must be a number), convert to an integer and store in num.
				int num = Integer.parseInt(args[1]);
				//The command passed in will be stored in command.
				String command = args[0].replaceAll(" ", "");
				//if the command passed in is -s, then I'll print Starting...
				if(command.equals("-s")){
					System.out.println("Starting...");
				}
				//This loop will print "middle" as many times as the number passed in by the number passed in.
				for(int i = 0; i < num; i++){
					System.out.println("middle");
				}
				//if the command passed in was "-e", then I will print "Ending"..., and the end of the output.
				if(command.equals("-e")){
					System.out.println("Ending...");
				}
				
				
			}
				//If the user passed in all three arguments...
			else if(args.length == 3){
				//The last argument passed in, (must be a number), convert to an integer and store in num.
				int num = Integer.parseInt(args[2]);
				//The first command passed in will be stored in command1. The second in command2.
				String command1 = args[0].replaceAll(" ", "");
				String command2 = args[1].replaceAll(" ", "");
				//If either command1 or command2 passed in is equal to "-s", I will print "Starting..."
				if((command1.equals("-s")) ||(command2.equals("-s")) ){
					System.out.println("Starting...");
				}
				//This loop will print "middle" as many times as the number passed in by the number passed in.
				for(int i = 0; i < num; i++){
					System.out.println("middle");
				}
				//if either command1 or command 2 passed in was "-e", then I will print "Ending..." as output.
				if((command1.equals("-e")) ||(command2.equals("-e"))){
					System.out.println("Ending...");
				}
			}
			
			
			
			
		
		
		
	}
}
