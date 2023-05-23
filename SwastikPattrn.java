package letsdoit;

public class SwastikPattrn {

	public static void main(String[] args) {
		        int size = 7; // Adjust the size as per your requirement

		        // Printing the upper half of the swastika
		        for (int i = 0; i < size; i++) {
		            for (int j = 0; j < size; j++) {
		                if (i < size / 2) {
		                    if (j < size / 2) {
		                        if (j == 0)
		                            System.out.print("*");
		                        else
		                            System.out.print(" ");
		                    } else if (j == size / 2)
		                        System.out.print("*");
		                    else if (i == 0)
	                        System.out.print("*");
		                    else
		                        System.out.print(" ");
		                } else if (i == size / 2)
		                    System.out.print("*");
		                else {
		                    if (j == size / 2 || j == size - 1)
		                        System.out.print("*");
		                    else if (i == size - 1)
		                        if (j <= size / 2 || j == size - 1)
		                            System.out.print("*");
		                        else
		                            System.out.print(" ");
		                    else
		                        System.out.print(" ");
		                }
		            }
		            System.out.println();
		        }
		    }
	
	}


