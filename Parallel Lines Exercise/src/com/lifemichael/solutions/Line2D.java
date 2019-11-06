package com.lifemichael.solutions;

class Line2D {
	Point2D first;
	Point2D second;

	Line2D(Point2D p1, Point2D p2) {
		first = p1;
		second = p2;
	}

	void details() {
		System.out.println("((" + first.getX() + "," + first.getY() + ") , ("
				+ second.getX() + "," + second.getY() + "))");
	}

	boolean isParallel(Line2D otherLine) {
		return (this.gradient()) == (otherLine.gradient());

	}

	double length() {
		return Math.sqrt(Math.pow(first.getX() - second.getX(), 2)
				+ Math.pow(first.getY() - second.getY(), 2));
	}

	double gradient() {
		return (first.getY() - second.getY()) / (first.getX() - second.getX());
	}
}