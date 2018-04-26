package com.homecredit.exam;

import java.util.ArrayList;
import java.util.Collections;

public class RealAnswer {

	public static abstract class Shape implements Comparable<Shape>{
		
		protected double area;
		
		public abstract void calculateArea();

		public double getArea() {
			return area;
		}

		public void setArea(double area) {
			this.area = area;
		}
		
		public int compareTo(Shape o) {
			// TODO Auto-generated method stub
			return (int) (o.getArea() - this.getArea() );
		}
		
	}
	
	public static class Square extends Shape {
		
		private double side;
		
		public Square(double side) {
			this.side = side;
			calculateArea();
		}

		@Override
		public void calculateArea() {
			this.setArea(side*4);
		}

		public double getSide() {
			return side;
		}

		public void setSide(double side) {
			this.side = side;
		}
		
		@Override
		public String toString() {
			return "Square "+String.valueOf(area);
		}
	}
	
	public static class Circle extends Shape {
		
		private double radius;
		
		public Circle(double radius) {
			this.setRadius(radius);
			calculateArea();
		}

		@Override
		public void calculateArea() {
			setArea(radius*Math.PI);
		}

		public double getRadius() {
			return radius;
		}

		public void setRadius(double radius) {
			this.radius = radius;
		}

		@Override
		public String toString() {
			return "Circle "+String.valueOf(area);
		}
	}
	
	public static class Triangle extends Shape {
		
		private double height;
		private double base;
		
		public Triangle(double height,double base) {
			this.setHeight(height);
			this.setBase(base);
			calculateArea();
		}

		@Override
		public void calculateArea() {
			setArea((base * height)/2);
		}

		public double getHeight() {
			return height;
		}

		public void setHeight(double height) {
			this.height = height;
		}

		public double getBase() {
			return base;
		}

		public void setBase(double base) {
			this.base = base;
		}

		@Override
		public String toString() {
			return "Triangle "+String.valueOf(area);
		}
	}
	
	
	public static void main(String[] args) {
		double side = 7.1234;
		double radius = 1.1234;
		double base = 5;
		double height = 2;

		ArrayList<Shape> shapes = new ArrayList<Shape>();
		shapes.add(new Square(side));
		shapes.add(new Circle(radius));
		shapes.add(new Triangle(base, height));

		Collections.sort(shapes);
		
		
		for(Shape s:shapes) {
			
			System.out.println(s);
		}
	}

}
