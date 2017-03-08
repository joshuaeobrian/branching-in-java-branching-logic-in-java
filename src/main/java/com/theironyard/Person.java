package com.theironyard;



/**
 * In this exercise you will be creating a class that models a person. The
 * person class contains methods to calculate the person's estimated body fat
 * percentage, whether the percentage is in the recommended range, is average
 * for an american, or indicates obesity.
 * <br />
 * The formulas and values used in this class are based on The Navy Formula Body
 * Fat Calculator. You can read more about it here:
 * http://www.calculator.net/body-fat-calculator.html
 * <br />
 * Follow the instructions below. Note that all measurements are in centimeters.
 */
public class Person {

    /*
        The Person class should have six properties, name, gender, height, neck,
        waist, and hips. Note that the hips property is only used when
        calculating percentages for women. As such, if it's not specified then
        we know the person is male. All of the measurements are in centimeters.
     */

    // todo: create two private properties named "name" and "gender". Both of these hold Strings.
	private String name;
	private String gender;

    // todo: create properties named "height", "neck", "waist", and "hips". All of these hold double values that represent measurements in centimeters.


	private double height;
	private double neck;
	private double waist;
	private double hips;

    /**
     * Create a constructor that accepts values for name, height, neck, and
     * waist. Because this constructor does not accept an argument for hips, we
     * can assume that the person is a male. Be sure to set the gender property
     * to "male".
     */
    // todo: create four-argument constructor for males
	public Person(String name, double height,double neck, double waist){
		this.name = name;
		this.gender = "male";
		this.height = height;
		this.neck = neck;
		this.waist = waist;
	}


    /**
     * Create a constructor that accepts values for name, height, neck, waist,
     * and hips. Because this constructor accepts an argument for hips, we can
     * assume that the person is a female. Be sure to set the gender property
     * to "female".
     */
    // todo: create five-argument constructor for females
	public Person(String name, double height,double neck, double waist,double hips){
		this.name = name;
		this.gender = "female";
		this.height = height;
		this.neck = neck;
		this.waist = waist;
		this.hips = hips;
	}


    /**
     * Create a method as described here:
     * <p>
     * - named "bodyFatEstimate"
     * - takes no arguments
     * - returns a double value
     * <p>
     * This method returns a double value indicating a body fat percentage
     * estimate for this person. Note that the value returned is already a
     * percentage. IE: 14.5%, not 0.145.
     * <p>
     * There are a few things you need to know:
     * <p>
     * The formula for estimating body fat is different for men and women. For
     * men it is:
     * <p>
     * 495 / (1.0324 - 0.19077 * (LOG(waist - neck)) + 0.15456 * (LOG(height))) - 450
     * <p>
     * For women it is:
     * <p>
     * 495 / (1.29579 - 0.35004 * (LOG(waist + hips - neck)) + 0.22100 * (LOG(height))) - 450;
     * <p>
     * As such, you will have to use a conditional statement to run the correct
     * calculation, depending on the person's gender.
     * <p>
     * To calculate a logarithm in Java you use the Math.log10() function. For
     * example, to get the logarithm of 18 in base 10 you would use:
     * <p>
     * Math.log10(18)
     * <p>
     * This evaluates to 1.2552725051033058.
     * <p>
     * So, if we are calculating body fat percentages for a woman with the
     * following measurements...
     * <p>
     * height = 165 cm
     * neck = 42 cm
     * waist = 87.5 cm
     * hips = 91.5 cm
     * <p>
     * ... the formula in Java would be:
     * <p>
     * <code>495 / (1.29579 - 0.35004 * (Math.log10(87.5 + 91.5 - 42)) + 0.22100 * (Math.log10(165))) - 450</code>;
     */
    // todo: create bodyFatEstimate() method
	public double bodyFatEstimate(){
		if(this.gender.equals("male")){
			return 495 / (1.0324 - 0.19077 * (Math.log10(waist - neck)) + 0.15456 * (Math.log10(height))) - 450;
		}else if(this.gender.equals("female")) {
			return 495 / (1.29579 - 0.35004 * (Math.log10(waist + hips - neck)) + 0.22100 * (Math.log10(height))) - 450;
		}else{
			return 0;
		}
	}


    /**
     * Create a method as described here:
     * <p>
     * - named "inRecommendedRange"
     * - takes no arguments
     * - returns a boolean value
     * <p>
     * This method returns true if the person's body fat percentage is within the recommended
     * range.
     * <p>
     * For men, the recommended range is 8 to 14 percent, inclusive.
     * <p>
     * For women, the recommended range is 20 to 25 percent, inclusive.
     */
    // todo: create inRecommendedRange() method
	public boolean inRecommendedRange(){
		if(this.gender.equals("male") && bodyFatEstimate() >= 8 && bodyFatEstimate() <= 14){
			return true;
		}else if(this.gender.equals("female") && bodyFatEstimate() >= 20 && bodyFatEstimate() <= 25) {
			return true;
		}else{
			return false;
		}
	}


    /**
     * Create a method as described here:
     * <p>
     * - named "isAverageAmerican"
     * - takes no arguments
     * - returns a boolean value
     * <p>
     * This method returns true if the person's weight is within the average
     * range for an american.
     * <p>
     * For men, the range is 15 to 19 percent, inclusive.
     * <p>
     * For women, the range is 22 to 25 percent, inclusive.
     */
    // todo: create isAverageAmerican() method
	public boolean isAverageAmerican(){
		if(this.gender.equals("male") && this.bodyFatEstimate() >= 15 && this.bodyFatEstimate() <= 19 ){
			return true;
		}else if(this.gender.equals("female") && this.bodyFatEstimate() >= 22 && this.bodyFatEstimate() <= 25 ){
			return true;
		}else{
			return false;
		}
	}


    /**
     * Create a method as described here:
     * <p>
     * - named "isObese"
     * - takes no arguments
     * - returns a boolean value
     * <p>
     * This method returns true if the person's weight is considered obese.
     * <p>
     * For men, 25% and higher is considered obese.
     * <p>
     * For women, 30% and higher is considered obese.
     */
    // todo: create isObese() method
	public boolean isObese() {
		if (this.gender.equals("male") && bodyFatEstimate() >= 25) {
			return true;
		} else if (this.gender.equals("female") && bodyFatEstimate() >= 30) {
			return true;
		} else {
			return false;
		}
	}

    /**
     * Create a toString() method that will return a string description of the
     * person. Follow the instructions below to complete the method.
     */
    public String toString() {


        /*
            We will start by creating a variable named "description". This
            variable will hold the default description of a Person. It should
            read:

         */
	    // todo: create default description.
			String description = this.name + " is a "+ this.gender + " with estimated body fat of " + Math.round(bodyFatEstimate()) + "%.";


		if(inRecommendedRange()){
			description+=" This is in the recommended range and average range for an american.";
		}

	    // todo: check if the person is in the average range for an american

            /*
                If the user is in the average range for an american then append
                to their description the text "This is in the average range for
                an american."
             */
//
	    if (isAverageAmerican() && !gender.equals("female")){
		    description += " This is in the average range for an american.";
	    }
//
//	    if (isAverageAmerican() && description.contains(" This is in the recommended range and average range for an american.")){
//		    description += " This is in the average range for an american.";
//	    }

	    // todo: add the average american range description

		// todo: check if the person is obese
	    if(isObese()){
		    // todo: add considered obese description
		    description += " This is considered obese.";
	    }
                                                                /*
          If the user is obese then append to their description the text
           "This is considered obese."
                                                                    */



	    // todo: return the full description
		return description;
    }

}
