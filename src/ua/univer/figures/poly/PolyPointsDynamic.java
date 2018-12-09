package ua.univer.figures.poly;

import java.util.Arrays;

import ua.univer.figures.base.Point;

public class PolyPointsDynamic {
	private Point[] points;
	private int count;
	public PolyPointsDynamic() {
		points = new Point[3];
		count=-1;
	}
	public void add(Point p) {
		if(count==points.length-1)
		{
		//	Point [] temp = new Point[points.length];
			points=Arrays.copyOf(points, points.length*2);
			//for (int i = 0; i < points.length; i++) {
			//	temp[i]=points[i];
			//}
		//	points=temp;
		}	
		points[++count] = p;
		
	}
	public PolyPointsDynamic getPositivePoints(){
		PolyPointsDynamic positivePoly = new PolyPointsDynamic();
		for (int i = 0; i < size(); i++) {
			if(points[i].getX()>0&&points[i].getX()>0){
				positivePoly.add(points[i]);				
			}
		}
		return positivePoly;
	}
	public Point get(int i){
		if(i<size())
		return points[i];
		else return null;
	}
	public void set(int i,Point p){
		if(i<size())
			points[i] = p;		
	}
	public int size() {
		return count+1;
	}
    public void print() {
		for (int i = 0; i < size(); i++) {		
			System.out.println(points[i]);
		}
	}
}
