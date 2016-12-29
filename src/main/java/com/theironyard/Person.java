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

    // todo: create properties named "height", "neck", "waist", and "hips". All of these hold double values that represent measurements in centimeters.

    /**
     * Create a constructor that accepts values for name, height, neck, and
     * waist. Because this constructor does not accept an argument for hips, we
     * can assume that the person is a male. Be sure to set the gender property
     * to "male".
     */
    // todo: create four-argument constructor for males


    /**
     * Create a constructor that accepts values for name, height, neck, waist,
     * and hips. Because this constructor accepts an argument for hips, we can
     * assume that the person is a female. Be sure to set the gender property
     * to "female".
     */
    // todo: create five-argument constructor for females


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


    /**
     * Create a method as described here:
     * <p>
     * - named "inRecommendedRange"
     * - takes no arguments
     * - returns a boolean value
     * <p>
     * This method returns true if the person's weight is within the recommended
     * range.
     * <p>
     * For men, the recommended range is 8 to 14 percent, inclusive.
     * <p>
     * For women, the recommended range is 20 to 25 percent, inclusive.
     */
    // todo: create inRecommendedRange() method


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


    /**
     * Create a toString() method that will return a string description of the
     * person. Follow the instructions below to complete the method.
     */

        /*
            We will start by creating a variable named "description". This
            variable will hold the default description of a Person. It should
            read:

            Bob is a male with estimated body fat of 14.639547773378297%.

            Be sure to replace the name, gender and body fat percentages with
            their real values. Otherwise, the string should be exactly as shown
            above.

            Here are some example descriptions:

            Bob is a male with estimated body fat of 15%.
            Wanda is a female with estimated body fat of 27%.
            Zelda is a female with estimated body fat of 37%. This is obese.
            Sven is a male with estimated body fat of 19%. This is in the average range for an american.
            Alvin is a male with estimated body fat of 28%. This is obese.
            Kat is a female with estimated body fat of 23%. This is in the recommended range and average range for an american.

            Note: to round the double value returned from the bodyFatEstimate()
            method you will need to use the Math.round() function. For example:

            Math.round(bodyFatEstimate())
         */
        // todo: create default description.


        /*
            Next create a conditional statement to add additional details to the
            person's description.
         */
        // todo: check if the user is in the recommended range and also in the average range

            /*
                If the user is in the recommended and average ranges then append
                to their description the text "This is in the recommended range
                and average range for an american."
             */
            // todo: add the recommended and average range description


        // todo: check if the person is in the recommended range

            /*
                If the user is in the recommended range then append to their
                description the text "This is within the recommended range."
             */
            // todo: add the recommended range description


        // todo: check if the person is in the average range for an american

            /*
                If the user is in the average range for an american then append
                to their description the text "This is in the average range for
                an american."
             */

            // todo: add the average american range description


        // todo: check if the person is obese

            /*
                If the user is obese then append to their description the text
                "This is considered obese."
             */


        // todo: return the full description

}
