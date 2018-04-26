package com.homecredit.exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

import org.assertj.core.api.Assertions;

import com.homecredit.exam.ObjectOrientedExam.Circle;
import com.homecredit.exam.ObjectOrientedExam.Shape;
import com.homecredit.exam.ObjectOrientedExam.Square;
import com.homecredit.exam.ObjectOrientedExam.Triangle;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
/**
 * Unit test for simple App.
 */
public class AppTest {

    @org.junit.Test
    public void testApp() {
         
        
        // Arrange
        double side, radius, base, height;
        ArrayList<Shape> expected = new ArrayList<Shape>();

        side = 7.1234;
        expected.add(new Square(side));
        
        Assertions.assertThat(new Square(side).getArea()).isEqualTo(28.4936);

        
        height = 3.;
        base = 4.;
        expected.add(new Triangle(base, height));
        
        Assertions.assertThat(new Triangle(base, height).getArea()).isEqualTo(6.0);


        height = 2.;
        base = 5.;
        expected.add(new Triangle(base, height));
        
        Assertions.assertThat(new Triangle(base, height).getArea()).isEqualTo(5.0);
        
        radius = 1.1234;
        expected.add(new Circle(radius));
        
        Assertions.assertThat(new Circle(radius).getArea()).isEqualTo(3.5292651870427734);

        Random random = new Random();
        ArrayList<Shape> actual = createRandomOrderedList(random, expected);

        
        System.out.println("@@@@@@ randomized list");
        for(Shape s : actual) {
        	System.out.println(s);
        }
        System.out.println("@@@@@@ randomized list");
        
        // Act
        Collections.sort(actual);

        System.out.println();
        
        System.out.println("@@@@@@ ordered descending list");
        // Assert
        Iterator<Shape> a = actual.iterator();
        for (Shape e : expected) {
        	
        	System.out.println(e);
            Assertions.assertThat(e).isEqualTo(a.next());
        }
        System.out.println("@@@@@@ ordered descending list");
        
    }
    
    private ArrayList<Shape> createRandomOrderedList(Random random, ArrayList<Shape> expected){
        ArrayList<Shape> actual = new ArrayList<Shape>();
        for (Shape shape : expected) {
            int j = random.nextInt(actual.size()+1);
            actual.add(j, shape);
        }
        return actual;
    }
}