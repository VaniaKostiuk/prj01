package ua.univer.figures.base;

import ua.univer.figures.Figure;

public class Triangle extends Figure{
	Point apexA;
	Point apexB;
	Point apexC;
	private Line sideAB;
	private Line sideBC;
	private Line sideAC;
	
	public Triangle(Point apexA, Point apexB, Point apexC, Line sideAB, Line sideBC, Line sideAC) {
		super();
		this.apexA = apexA;
		this.apexB = apexB;
		this.apexC = apexC;
		//sideAB = new Line (apexA, apexB);
		//sideBC = new Line (apexB, apexC);
		//sideAC = new Line (apexA, apexC);
	}

	public Line getSideAB() {
		if(sideAB!=null)sideAB = new Line (apexA, apexB);   //метод линивой инициализацыи
		return sideAB;
	}
	public Line getSideBC() {
		if(sideBC!=null)sideBC = new Line (apexB, apexC);   //метод линивой инициализацыи
		return sideBC;
	}
	public Line getSideAC() {
		if(sideAC!=null)sideAC = new Line (apexA, apexC);   //метод линивой инициализацыи
		return sideAC;
	}

	
	
			
}
