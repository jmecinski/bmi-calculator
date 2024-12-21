public class Main {
    public static void main(String[] args) {
        double weight, height;
        double bmi = 0;
        String bmiSystem;
        String bmiCategory;

        UserInput userInput = new UserInput();
        BMICalculator bmiCalculator = new BMICalculator();

        bmiSystem = userInput.obtainBMISystem();

        switch (bmiSystem.toUpperCase()) {
            case "IMPERIAL":
                // Get the values from user
                weight = userInput.obtainWeight(bmiSystem);
                height = userInput.obtainHeight(bmiSystem);

                // Set the values in BMICalculator
                bmiCalculator.weightInPounds = weight;
                bmiCalculator.heightInInches = height;

                // Calculate BMI
                bmi = bmiCalculator.calculateBmiImperial();
                break;

            case "METRIC":
                // Get the values from user
                weight = userInput.obtainWeight(bmiSystem);
                height = userInput.obtainHeight(bmiSystem);

                // Set the values in BMICalculator
                bmiCalculator.weightInKilos = weight;
                bmiCalculator.heightInMeters = height;

                // Calculate BMI
                bmi = bmiCalculator.calculateBmiMetric();
                break;

            case "":
                System.out.println("Please Enter a valid BMI System as input");
                break;
        }

        System.out.println("Your BMI is: " + bmi);
        bmiCategory = bmiCalculator.getBMICategory(bmi);
        System.out.println("Your BMI category is: " + bmiCategory);
    }
}
