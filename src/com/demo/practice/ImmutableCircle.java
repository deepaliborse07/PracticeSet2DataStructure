package com.demo.practice;
//point is a mutable class
class Point {
	private int xPos, yPos;

	public Point(int x, int y) {
		
		this.xPos = x;
		this.yPos = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + xPos + ", y=" + yPos + "]";
	}
	
	int getX() {
		return xPos;
	}
	
	int getY() {
		return yPos;
	}
	
	

}

public final class ImmutableCircle {
	private final Point center;
	private final int radius;
	
	public ImmutableCircle(int x,int y,int r) {
		center=new Point(x,y);
		radius=r;
	}
	
	

	@Override
	public String toString() {
		return "ImmutableCircle [center=" + center + ", radius=" + radius + "]";
	}
	
	public int getRadius() {
		return radius;
	}
	
	public Point getCenter() {
		return new Point(center.getX(),center.getY());
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new ImmutableCircle(10, 10, 20));
	}

}
