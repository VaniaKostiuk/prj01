package ua.univer.figures.color;

import ua.univer.figures.base.Line;
import ua.univer.figures.base.Point;
import ua.univer.figures.base.Triangle;

public class ColorTriangle extends Triangle {
	
	private int colorTriangle ;

	public ColorTriangle(Point apexA, Point apexB, Point apexC, Line sideAB, Line sideBC, Line sideAC ,int colorTriangle) {
		super(apexA, apexB, apexC, sideAB, sideBC, sideAC);
		this.colorTriangle = colorTriangle ;
	}

	@Override
	public String toString() {
		return "ColorTriangle [colorTriangle=" + colorTriangle + "]";
	}

	

}
