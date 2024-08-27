package mypack;

public class Gender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length != 2) {
            System.out.println("Please provide both gender and age as command line arguments.");
            return;
        }

        String gender = args[0];
        int age = Integer.parseInt(args[1]);

        double interestRate = 0.0;

        if (gender.equalsIgnoreCase("Female")) {
            if (age >= 1 && age <= 58) {
                interestRate = 8.2;
            } else if (age >= 59 && age <= 100) {
                interestRate = 9.2;
            } else {
                System.out.println("Age out of expected range.");
                return;
            }
        } else if (gender.equalsIgnoreCase("Male")) {
            if (age >= 1 && age <= 58) {
                interestRate = 8.4;
            } else if (age >= 59 && age <= 100) {
                interestRate = 10.5;
            } else {
                System.out.println("Age out of expected range.");
                return;
            }
        } else {
            System.out.println("Invalid gender provided.");
            return;
        }

        System.out.println("The interest rate is " + interestRate + "%.");
    }


	}

}
