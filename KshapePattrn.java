package letsdoit;

public class KshapePattrn {

	public static void main(String[] args) {
		        int size = 12; // Adjust the size as per your requirement

		        for (int i = 0; i < size; i++) {
		            for (int j = 0; j < size; j++) {
		                if (j == 0 || j == size - 1) {
		                    System.out.print("*");
		                } else if (i == j && i <= size / 2) {
		                    System.out.print("*");
		                } else if (j == size / 2 && i >= size / 2) {
		                    System.out.print("*");
		                } else {
		                    System.out.print(" ");
		                }
		            }
		            System.out.println();
		        }
		    }
		}