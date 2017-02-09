package com.theironyard;

import net.doughughes.testifier.exception.*;
import net.doughughes.testifier.test.TestifierTest;
import net.doughughes.testifier.util.Invoker;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

public class PersonTest extends TestifierTest{

    @Test
    public void testSimpleFemaleEstimate() {
        try {
            /* arrange */
            Person person = (Person) Invoker.instantiate(Person.class, "Wanda", 165.0, 42.0, 87.5, 91.5);

            /* act */
            double estimate = (double) Invoker.invoke(person, "bodyFatEstimate");


            /* assert */
            assertThat("Person with height=165, neck=42, waist=87.5, hips=91.5 should have body fat percentage close to 26.917076518297108.",
                    estimate, closeTo(26.917076518297108, 0.001));
        } catch (CannotInvokeMethodException | CannotInstantiateClassException | CannotFindConstructorException | CannotFindMethodException | CannotAccessMethodException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testSimpleFemaleNotInRecommendedRange() {
        try{
            /* arrange */
            Person person = (Person) Invoker.instantiate(Person.class, "Wanda", 165.0, 42.0, 87.5, 91.5);

            /* act */
            boolean inRecommendedRange = (boolean) Invoker.invoke(person, "inRecommendedRange");

            /* assert */
            assertThat("Person with height=165, neck=42, waist=87.5, hips=91.5 should not be in recommended range.",
                    inRecommendedRange, equalTo(false));
        } catch (CannotInvokeMethodException | CannotInstantiateClassException | CannotFindConstructorException | CannotFindMethodException | CannotAccessMethodException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testSimpleFemaleIsNotAverageAmerican() {
        try{
            /* arrange */
            Person person = (Person) Invoker.instantiate(Person.class, "Wanda", 165.0, 42.0, 87.5, 91.5);

            /* act */
            boolean isAverageAmerican = (boolean) Invoker.invoke(person, "isAverageAmerican");

            /* assert */
            assertThat("Person with height=165, neck=42, waist=87.5, hips=91.5 should not be in average american range.",
                    isAverageAmerican, equalTo(false));
        } catch (CannotInvokeMethodException | CannotInstantiateClassException | CannotFindConstructorException | CannotFindMethodException | CannotAccessMethodException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testSimpleFemaleIsNotObese() {
        try {
            /* arrange */
            Person person = (Person) Invoker.instantiate(Person.class, "Wanda", 165.0, 42.0, 87.5, 91.5);

            /* act */
            boolean isObese = (boolean) Invoker.invoke(person, "isObese");

            /* assert */
            assertThat("Person with height=165, neck=42, waist=87.5, hips=91.5 should not be obese.",
                    isObese, equalTo(false));
        } catch (CannotInvokeMethodException | CannotInstantiateClassException | CannotFindConstructorException | CannotFindMethodException | CannotAccessMethodException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testSimpleFemaleDescription() {
        try {
            /* arrange */
            Person person = (Person) Invoker.instantiate(Person.class, "Wanda", 165.0, 42.0, 87.5, 91.5);

            /* act */

            /* assert */
            assertThat("Incorrect description.",
                    person.toString(), equalTo("Wanda is a female with estimated body fat of 27%."));
        } catch (CannotInstantiateClassException | CannotFindConstructorException | CannotAccessMethodException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testSimpleMaleEstimate() {
        try {
            /* arrange */
            Person person = (Person) Invoker.instantiate(Person.class, "Bob", 183.0, 48.5, 94.0);

            /* act */
            double estimate = (double) Invoker.invoke(person, "bodyFatEstimate");


            /* assert */
            assertThat("Person with height=183, neck=48.5, waist=94 should have body fat percentage close to 14.446129765076648.",
                    estimate, closeTo(14.446129765076648, 0.001));
        } catch (CannotInvokeMethodException | CannotInstantiateClassException | CannotFindConstructorException | CannotFindMethodException | CannotAccessMethodException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testSimpleMaleNotInRecommendedRange() {
        try {
            /* arrange */
            Person person = (Person) Invoker.instantiate(Person.class, "Bob", 183.0, 48.5, 94.0);

            /* act */
            boolean inRecommendedRange = (boolean) Invoker.invoke(person, "inRecommendedRange");

            /* assert */
            assertThat("Person with height=183, neck=48.5, waist=94 should not be in recommended range.",
                    inRecommendedRange, equalTo(false));
        } catch (CannotInvokeMethodException | CannotInstantiateClassException | CannotFindConstructorException | CannotFindMethodException | CannotAccessMethodException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testSimpleMaleIsNotAverageAmerican() {
        try {
            /* arrange */
            Person person = (Person) Invoker.instantiate(Person.class, "Bob", 183.0, 48.5, 94.0);

            /* act */
            boolean isAverageAmerican = (boolean) Invoker.invoke(person, "isAverageAmerican");

            /* assert */
            assertThat("Person with height=183, neck=48.5, waist=94 should not be in average american range.",
                    isAverageAmerican, equalTo(false));
        } catch (CannotInvokeMethodException | CannotInstantiateClassException | CannotFindConstructorException | CannotFindMethodException | CannotAccessMethodException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testSimpleMaleIsNotObese() {
        try {
            /* arrange */
            Person person = (Person) Invoker.instantiate(Person.class, "Bob", 183.0, 48.5, 94.0);

            /* act */
            boolean isObese = (boolean) Invoker.invoke(person, "isObese");

            /* assert */
            assertThat("Person with height=183, neck=48.5, waist=94 should not be obese.",
                    isObese, equalTo(false));
        } catch (CannotInvokeMethodException | CannotInstantiateClassException | CannotFindConstructorException | CannotFindMethodException | CannotAccessMethodException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testSimpleMaleDescription() {
        try {
            /* arrange */
            Person person = (Person) Invoker.instantiate(Person.class, "Bob", 183.0, 48.5, 94.0);

            /* act */

            /* assert */
            assertThat("Incorrect description.",
                    person.toString(), equalTo("Bob is a male with estimated body fat of 14%."));
        } catch (CannotFindConstructorException | CannotAccessMethodException | CannotInstantiateClassException e) {
            fail(e.getMessage());
        }

    }

    @Test
    public void testObeseFemaleEstimate() {
        try {
            /* arrange */
            Person person = (Person) Invoker.instantiate(Person.class, "Zelda", 152.5, 45.5, 94.0, 101.5);

            /* act */
            double estimate = (double) Invoker.invoke(person, "bodyFatEstimate");


            /* assert */
            assertThat("Person with height=152.5, neck=45.5, waist=94, hips=101.5 should have body fat percentage close to 36.92979544354483.",
                    estimate, closeTo(36.92979544354483, 0.001));
        } catch (CannotInvokeMethodException | CannotInstantiateClassException | CannotFindConstructorException | CannotFindMethodException | CannotAccessMethodException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testObeseFemaleNotInRecommendedRange() {
        try {
            /* arrange */
            Person person = (Person) Invoker.instantiate(Person.class, "Zelda", 152.5, 45.5, 94.0, 101.5);

            /* act */
            boolean inRecommendedRange = (boolean) Invoker.invoke(person, "inRecommendedRange");

            /* assert */
            assertThat("Person with height=152.5, neck=45.5, waist=94, hips=101.5 should not be in recommended range.",
                    inRecommendedRange, equalTo(false));
        } catch (CannotInvokeMethodException | CannotInstantiateClassException | CannotFindConstructorException | CannotFindMethodException | CannotAccessMethodException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testObeseFemaleIsNotAverageAmerican() {
        try {
            /* arrange */
            Person person = (Person) Invoker.instantiate(Person.class, "Zelda", 152.5, 45.5, 94.0, 101.5);

            /* act */
            boolean isAverageAmerican = (boolean) Invoker.invoke(person, "isAverageAmerican");

            /* assert */
            assertThat("Person with height=152.5, neck=45.5, waist=94, hips=101.5 should not be in average american range.",
                    isAverageAmerican, equalTo(false));
        } catch (CannotInvokeMethodException | CannotInstantiateClassException | CannotFindConstructorException | CannotFindMethodException | CannotAccessMethodException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testObeseFemaleIsObese() {
        try {
            /* arrange */
            Person person = (Person) Invoker.instantiate(Person.class, "Zelda", 152.5, 45.5, 94.0, 101.5);

            /* act */
            boolean isObese = (boolean) Invoker.invoke(person, "isObese");

            /* assert */
            assertThat("Person with height=152.5, neck=45.5, waist=94, hips=101.5 should be obese.",
                    isObese, equalTo(true));
        } catch (CannotInvokeMethodException | CannotInstantiateClassException | CannotFindConstructorException | CannotFindMethodException | CannotAccessMethodException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testObeseFemaleDescription() {
        try {
            /* arrange */
            Person person = (Person) Invoker.instantiate(Person.class, "Zelda", 152.5, 45.5, 94.0, 101.5);

            /* act */

            /* assert */
            assertThat("Incorrect description.",
                    person.toString(), equalTo("Zelda is a female with estimated body fat of 37%. This is considered obese."));
        } catch (CannotFindConstructorException | CannotInstantiateClassException | CannotAccessMethodException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testObeseMaleEstimate() {
        try {
            /* arrange */
            Person person = (Person) Invoker.instantiate(Person.class, "Alvin", 171.5, 56.0, 117.0);

            /* act */
            double estimate = (double) Invoker.invoke(person, "bodyFatEstimate");

            /* assert */
            assertThat("Person with height=171.5, neck=56, waist=117 should have body fat percentage close to 27.27381638574883.",
                    estimate, closeTo(27.27381638574883, 0.001));
        } catch (CannotInvokeMethodException | CannotInstantiateClassException | CannotFindConstructorException | CannotFindMethodException | CannotAccessMethodException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testObeseMaleNotInRecommendedRange() {
        try {
            /* arrange */
            Person person = (Person) Invoker.instantiate(Person.class, "Alvin", 171.5, 56.0, 117.0);

            /* act */
            boolean inRecommendedRange = (boolean) Invoker.invoke(person, "inRecommendedRange");

            /* assert */
            assertThat("Person with height=171.5, neck=56, waist=117 should not be in recommended range.",
                    inRecommendedRange, equalTo(false));
        } catch (CannotInvokeMethodException | CannotInstantiateClassException | CannotFindConstructorException | CannotFindMethodException | CannotAccessMethodException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testObeseMaleIsNotAverageAmerican() {
        try {
            /* arrange */
            Person person = (Person) Invoker.instantiate(Person.class, "Alvin", 171.5, 56.0, 117.0);

            /* act */
            boolean isAverageAmerican = (boolean) Invoker.invoke(person, "isAverageAmerican");

            /* assert */
            assertThat("Person with height=171.5, neck=56, waist=117 should not be in average american range.",
                    isAverageAmerican, equalTo(false));
        } catch (CannotInvokeMethodException | CannotInstantiateClassException | CannotFindConstructorException | CannotFindMethodException | CannotAccessMethodException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testObeseMaleIsObese() {
        try {
            /* arrange */
            Person person = (Person) Invoker.instantiate(Person.class, "Alvin", 171.5, 56.0, 117.0);

            /* act */
            boolean isObese = (boolean) Invoker.invoke(person, "isObese");

            /* assert */
            assertThat("Person with height=171.5, neck=56, waist=117 should be obese.",
                    isObese, equalTo(true));
        } catch (CannotInvokeMethodException | CannotInstantiateClassException | CannotFindConstructorException | CannotFindMethodException | CannotAccessMethodException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testObeseMaleDescription() {
        try {
            /* arrange */
            Person person = (Person) Invoker.instantiate(Person.class, "Alvin", 171.5, 56.0, 117.0);

            /* act */

            /* assert */
            assertThat("Incorrect description.",
                    person.toString(), equalTo("Alvin is a male with estimated body fat of 27%. This is considered obese."));
        } catch (CannotFindConstructorException | CannotInstantiateClassException | CannotAccessMethodException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testAverageAmericanMaleEstimate() {
        try {
            /* arrange */
            Person person = (Person) Invoker.instantiate(Person.class, "Sven", 181.5, 45.5, 96.5);

            /* act */
            double estimate = (double) Invoker.invoke(person, "bodyFatEstimate");

            /* assert */
            assertThat("Person with height=181.5, neck=45.5, waist=96.5 should have body fat percentage close to 18.848205343988184.",
                    estimate, closeTo(18.848205343988184, 0.001));
        } catch (CannotInvokeMethodException | CannotInstantiateClassException | CannotFindConstructorException | CannotFindMethodException | CannotAccessMethodException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testAverageMaleNotInRecommendedRange() {
        try {
            /* arrange */
            Person person = (Person) Invoker.instantiate(Person.class, "Sven", 181.5, 45.5, 96.5);

            /* act */
            boolean inRecommendedRange = (boolean) Invoker.invoke(person, "inRecommendedRange");

            /* assert */
            assertThat("Person with height=181.5, neck=45.5, waist=96.5 should not be in recommended range.",
                    inRecommendedRange, equalTo(false));
        } catch (CannotInvokeMethodException | CannotInstantiateClassException | CannotFindConstructorException | CannotFindMethodException | CannotAccessMethodException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testAverageMaleIsAverageAmerican() {
        try {
            /* arrange */
            Person person = (Person) Invoker.instantiate(Person.class, "Sven", 181.5, 45.5, 96.5);

            /* act */
            boolean isAverageAmerican = (boolean) Invoker.invoke(person, "isAverageAmerican");

            /* assert */
            assertThat("Person with height=181.5, neck=45.5, waist=96.5 should be in average american range.",
                    isAverageAmerican, equalTo(true));
        } catch (CannotInvokeMethodException | CannotInstantiateClassException | CannotFindConstructorException | CannotFindMethodException | CannotAccessMethodException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testAverageMaleIsNotObese() {
        try {
            /* arrange */
            Person person = (Person) Invoker.instantiate(Person.class, "Sven", 181.5, 45.5, 96.5);

            /* act */
            boolean isObese = (boolean) Invoker.invoke(person, "isObese");

            /* assert */
            assertThat("Person with height=181.5, neck=45.5, waist=96.5 should not be obese.",
                    isObese, equalTo(false));
        } catch (CannotInvokeMethodException | CannotInstantiateClassException | CannotFindConstructorException | CannotFindMethodException | CannotAccessMethodException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testAverageAmericanMaleDescription() {
        try {
            /* arrange */
            Person person = (Person) Invoker.instantiate(Person.class, "Sven", 181.5, 45.5, 96.5);

            /* act */

            /* assert */
            assertThat("Incorrect description.",
                    person.toString(), equalTo("Sven is a male with estimated body fat of 19%. This is in the average range for an american."));
        } catch (CannotFindConstructorException | CannotInstantiateClassException | CannotAccessMethodException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testRecommendedAverageFemaleEstimate() {
        try {
            /* arrange */
            Person person = (Person) Invoker.instantiate(Person.class, "Kat", 166.5, 39.5, 81.5, 89.0);

            /* act */
            double estimate = (double) Invoker.invoke(person, "bodyFatEstimate");

            /* assert */
            assertThat("Person with height=166.5, neck=39.5 waist=81.5, hips=89 should have body fat percentage close to 23.415608448971795.",
                    estimate, closeTo(23.415608448971795, 0.001));
        } catch (CannotInvokeMethodException | CannotInstantiateClassException | CannotFindConstructorException | CannotFindMethodException | CannotAccessMethodException e) {
            fail(e.getMessage());
        }
    }


    @Test
    public void testRecommendedAverageFemaleInRecommendedRange() {
        try {
            /* arrange */
            Person person = (Person) Invoker.instantiate(Person.class, "Kat", 166.5, 39.5, 81.5, 89.0);

            /* act */
            boolean inRecommendedRange = (boolean) Invoker.invoke(person, "inRecommendedRange");

            /* assert */
            assertThat("Person with height=166.5, neck=39.5 waist=81.5, hips=89 should be in recommended range.",
                    inRecommendedRange, equalTo(true));
        } catch (CannotInvokeMethodException | CannotInstantiateClassException | CannotFindConstructorException | CannotFindMethodException | CannotAccessMethodException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testRecommendedAverageFemaleIsAverageAmerican() {
        try {
            /* arrange */
            Person person = (Person) Invoker.instantiate(Person.class, "Kat", 166.5, 39.5, 81.5, 89.0);

            /* act */
            boolean isAverageAmerican = (boolean) Invoker.invoke(person, "isAverageAmerican");

            /* assert */
            assertThat("Person with height=166.5, neck=39.5 waist=81.5, hips=89 should be in average american range.",
                    isAverageAmerican, equalTo(true));
        } catch (CannotInvokeMethodException | CannotInstantiateClassException | CannotFindConstructorException | CannotFindMethodException | CannotAccessMethodException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testRecommendedAverageFemaleIsNotObese() {
        try {
            /* arrange */
            Person person = (Person) Invoker.instantiate(Person.class, "Kat", 166.5, 39.5, 81.5, 89.0);

            /* act */
            boolean isObese = (boolean) Invoker.invoke(person, "isObese");

            /* assert */
            assertThat("Person with height=166.5, neck=39.5 waist=81.5, hips=89 should not be obese.",
                    isObese, equalTo(false));
        } catch (CannotInvokeMethodException | CannotInstantiateClassException | CannotFindConstructorException | CannotFindMethodException | CannotAccessMethodException e) {
            fail(e.getMessage());
        }
    }


    @Test
    public void testRecommendedAverageFemaleDescription() {
        try {
            /* arrange */
            Person person = (Person) Invoker.instantiate(Person.class, "Kat", 166.5, 39.5, 81.5, 89.0);

            /* act */

            /* assert */
            assertThat("Incorrect description.",
                    person.toString(), equalTo("Kat is a female with estimated body fat of 23%. This is in the recommended range and average range for an american."));
        } catch (CannotFindConstructorException | CannotInstantiateClassException | CannotAccessMethodException e) {
            fail(e.getMessage());
        }
    }



}